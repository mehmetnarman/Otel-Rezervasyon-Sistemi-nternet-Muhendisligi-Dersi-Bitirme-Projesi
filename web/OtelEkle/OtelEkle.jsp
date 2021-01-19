<%-- 
    Document   : OtelEkle
    Created on : 16.Oca.2021, 14:16:40
    Author     : Mehmet NARMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Otel Ekle</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
    </head>
    <body>
    <section class="adminlogin">
        <div class="card z-depth-3">
            <div class="card-panel center orange accent-2">
                <span class="card-title">Otel Ekle</span>
            </div>
            <form class="form" action="../OtelSaveServlet" method="post">
                 <div class="input-field"><br></br>
                    <input type="text" value="sivas" class="validate" name="sehir" required>
                        <label>Otelin Bulunduğu Şehir</label>
                </div>
                <div class="input-field"><br></br>
                    <input type="text" placeholder="Otel Adı" class="validate" name="oteladi" required>
                        <label>Otel Adı</label> 
                </div>
                <div class="center">
                    <button type="submit" class="btn-large orange accent-2">
                        Otel Ekle
                    </button>
                </div>    
            </form>
        </div>
    </section>
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>