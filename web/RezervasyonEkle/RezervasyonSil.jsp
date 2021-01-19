<%-- 
    Document   : RezervasyonSil
    Created on : 18.Oca.2021, 05:54:48
    Author     : Mehmet NARMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
            <title>JSP Page</title>
            </head>
            <body>
                <%
                    String id = request.getParameter("id");
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oteller?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "123456");
                        Statement st = conn.createStatement();
                        int i = st.executeUpdate("DELETE FROM rezervasyon WHERE id=" + id);
                %>
            <section class="text">
                <div style="text-align: center">         
                    <span style="font-size: 20px; color: white;">Rezervasyon Silindi.. Yönetici Paneline Git.</span><br>
                    <a href='../adminpanel.jsp'><button  style="background-color: orange" type='button'>Yönetici Paneli</button></a>
                </div>
            </section>
            <%
                } catch (Exception e) {
                    System.out.print(e);
                    e.printStackTrace();
                }
            %>
            </body>
            </html>
