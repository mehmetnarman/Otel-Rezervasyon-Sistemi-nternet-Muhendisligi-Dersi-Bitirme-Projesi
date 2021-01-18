<%-- 
    Document   : RezervasyonEkle
    Created on : 18.Oca.2021, 05:15:14
    Author     : Mehmet NARMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String mail = request.getParameter("mail");
            String otelAdi = request.getParameter("Rezervasyon");
            String sehir = request.getParameter("sehir");
            String giris = request.getParameter("giris");
            String cikis = request.getParameter("cıkıs");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oteller?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "123456");
                Statement st = conn.createStatement();

                int i = st.executeUpdate("insert into rezervasyon(mail,otelAdi,sehir,giris,cikis)values('" + mail + "','" + otelAdi + "','" + sehir + "','" + giris + "','" + cikis + "')");
            } catch (Exception e) {
                System.out.print(e);
                e.printStackTrace();
            }
        %>
    <section class="text">
        <div style="text-align: center">         
            <span style="font-size: 20px; color: white;">Rezervasyon Yaptırma İşleminiz Başarılı...</span><br>
            <a href="../index.html"><button  style="background-color: orange" type="button">Ana Sayfa</button></a>
        </div>
    </section>
</body>
</html>
