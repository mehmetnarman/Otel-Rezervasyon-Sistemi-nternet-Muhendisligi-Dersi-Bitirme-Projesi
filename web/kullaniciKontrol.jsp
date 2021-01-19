<%-- 
    Document   : kullaniciKontrol
    Created on : 18.Oca.2021, 03:53:57
    Author     : Mehmet NARMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <title>Kullanıcı Kontrol</title>
</head>
<body>
    <%
        String mail = request.getParameter("mail");
        session.putValue("mail", mail);
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otelyonetim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "123456");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from user where mail='" + mail + "' and password='" + password + "'");
        try {
            rs.next();
            if (rs.getString("password").equals(password) && rs.getString("mail").equals(mail)) {
    %>
<div class="giris">
    <div>
        <form action="otelAra.jsp?mail=<%=request.getParameter("mail")%>" method="post">
            <div style="text-align: center"><label style="color: white" class="label" for="otelkonum">Otelin Bulunduğu Şehir</label><br>
                <input type="text" id="sehir" name="sehir" required><br>
                    <input type="submit" value="Sonraki Adım">
                        </div>
                        </form>
                        </div>
                        </div>
                        <%
                                } else {
                                    out.println("<section class=\"text\">\n"
                                            + "            <div style=\"text-align: center\">\n"
                                            + "                <span style=\"font-size: 20px; color: white;\">Kullanıcı Adı veya Şifte Yanlış...</span><br>\n"
                                            + "                <a href='kullanicilogin.jsp'><button  style=\"background-color: orange\" type='button'>Tekrar Deneyin</button></a>\n"
                                            + "            </div>\n"
                                            + "        </section>");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %>
                        </body>
                        </html>
