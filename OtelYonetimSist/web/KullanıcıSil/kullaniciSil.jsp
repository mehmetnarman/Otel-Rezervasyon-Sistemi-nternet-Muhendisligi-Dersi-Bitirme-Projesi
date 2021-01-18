<%-- 
    Document   : kullaniciSil
    Created on : 18.Oca.2021, 03:02:35
    Author     : Mehmet NARMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <%
            String id = request.getParameter("uid");                    
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/otelyonetim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "123456");
                Statement st = conn.createStatement();
                int i = st.executeUpdate("DELETE FROM user WHERE uid=" + id);
        %>
        <section class="text">
            <div style="text-align: center">         
                <span style="font-size: 20px; color: white;">Kullanıcı Silindi.. Yönetici Paneline Git.</span><br>
                <a href='../adminpanel.jsp'><button  style="background-color: orange" type='button'>Yönetici Paneli</button></a>
            </div>
        </section>
        <%
            } catch (Exception e) {
                System.out.print(e);
                e.printStackTrace();
            }
        %>
