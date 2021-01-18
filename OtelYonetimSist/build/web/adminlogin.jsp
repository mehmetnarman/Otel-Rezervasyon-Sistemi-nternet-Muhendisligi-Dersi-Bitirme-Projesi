<%-- 
    Document   : adminlogin
    Created on : 15.Oca.2021, 01:11:41
    Author     : Mehmet NARMAN
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Otel Rezervasyon</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <section class="adminlogin">
        <div class="card z-depth-3">
            <div class="card-panel center orange accent-2">
                <span class="card-title">Yönetici Girişi</span>
            </div>
            <form class="form" action="AdminLoginServlet" method="post"> 
                <div class="input-field"><br></br>
                    <input type="email" placeholder="Email" class="validate" name="email" required>
                </div>
                <div class="input-field"><br></br>
                    <input type="password" placeholder="Şifre" class="validate" name="password" required>
                </div>
                <div class="center">
                    <button type="submit" class="btn-large orange accent-2">
                        Giriş
                    </button>
                </div>
                <!--<div class="center pt-1">
                    <a href="sifre.jsp">Şifreni mi Unuttun?</a>
                </div>-->
            </form>
        </div>
    </section>
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>

