<%-- 
    Document   : SilinecekOteliSec
    Created on : 18.Oca.2021, 01:04:28
    Author     : Mehmet NARMAN
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <title>Silinecek Şehri Seç</title>
    </head>
    <body>
        <div class="giris">
        <div>
            <form action="deleteOtelGit.jsp" method="post">
                <div style="text-align: center"><label style="color: white" class="label" for="otelkonum">Silinecek Otelin Bulunduğu Şehir</label><br>
                    <input type="text" id="sehir" name="sehir" required><br>
                    <input type="submit" value="Sonraki Adım">
                </div>
            </form>
        </div>
    </div>
    </body>
</html>
