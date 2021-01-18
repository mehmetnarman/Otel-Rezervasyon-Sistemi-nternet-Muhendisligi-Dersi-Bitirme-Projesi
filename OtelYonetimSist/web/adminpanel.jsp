<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <title>Yönetici Paneli</title>
</head>
<body>
<div class="ortalaa">
    <form action="YöneticiEkle/YoneticiSifreOlustur.jsp" method="post">
        <input class="buton" type="submit" value="Yönetici Ekle">
    </form>
    <form action="YöneticiSil/yoneticiSileGit.jsp" method="post">
        <input class="buton" type="submit" value="Yönetici Sil">
    </form>
    <form action="OtelEkle/OtelEkle.jsp" method="post">
        <input class="buton" type="submit" value="Otel Ekle">
    </form>
    <form action="OtelSil/SilinecekOteliSec.jsp" method="post">
        <input class="buton" type="submit" value="Otel Sil">
    </form>
    <form action="KullanıcıEkle/KullaniciSifreOlustur.jsp" method="post">
        <input class="buton" type="submit" value="Kullanıcı Ekle">
    </form>
    <form action="KullanıcıSil/kullaniciSileGit.jsp" method="post">
        <input class="buton" type="submit" value="Kullanıcı Sil">
    </form>
    <form action="RezervasyonEkle/Rezervasyongor-sil.jsp" method="post">
        <input class="buton" type="submit" value="Rezervasyonları Gör-Sil">
    </form>
</div>
</body>
</html>