<%-- 
    Document   : girisSayfası
    Created on : 15.Oca.2021, 12:15:29
    Author     : Mehmet NARMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>                                   <!--jsp sayfama css sayfamı ekliyorum-->
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">            <!-- ağ üzerindeki css leri tanımlıyorum-->
        <title>Otel Rezervasyon Sistemi</title>
    </head>
    <body>
    <div class="baslik">
        <h1 style="color: white;">Otel Rezervasyon Sistemine Hoşgeldiniz</h1>                       
    </div>
    <div class="yonlendirme">
        <h1 style="color: white">Giriş Yap</h1>
        <form action="adminlogin.jsp">
            <input class="button5" type="submit" value="Yönetici Girişi">
        </form><br>
        <form action="kullanicilogin.jsp">
            <input class="button5" type="submit" value="Kullanıcı Girişi">
        </form>
    </div>
</body>
</html>
