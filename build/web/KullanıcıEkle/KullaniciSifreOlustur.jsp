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
    <title>Kullanıcı Şifre Oluşturma</title>                                                                         <!--sayfa başlığını ayarladım-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">  <!--dışarıdan hazır css ekledim-->
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>                                             <!--sayfa içeriklerinde düzenlemesi gereken yerleri kendi css dosyamla yapmak için css dosyamı sayfa içerisinde tanımladım-->
    </head>
    <body>
    <section class="adminlogin">                                    
        <div class="card z-depth-3">
            <div class="card-panel center orange accent-2">
                <span class="card-title">Kullanıcı Şifre Oluştur</span>                                                
            </div>
            <form class="form" action="../UserSaveServlet" method="post">          <!--Form açarak Kullanıcıdan Ad mail ve şifre bilgilerini girmesini istiyorum bu bilgileri action ile UserSaveServlet Sayfasına Gönderiyorum--> 
                <div class="input-field"><br></br>
                    <input type="text" placeholder="Ad" class="validate" name="name" required>          <!-- kullanıcıdan adını alıyorum -->
                        <label>Ad</label>
                </div>
                <div class="input-field"><br></br>
                    <input type="email" placeholder="mail" class="validate" name="mail" required>       <!-- kullanıcıdan mailini alıyorum -->
                        <label>E-mail Adres</label> 
                </div>
                <div class="input-field"><br></br>
                    <input type="password" placeholder="şifre" class="validate" name="password" required>   <!-- kullanıcıdan şifresini alıyorum -->
                        <label>Şifre</label>
                </div>
                <div class="center">
                    <button type="submit" class="btn-large orange accent-2">                    <!-- kullanıcıdan submit imputu alıyorum butona basınca değerleri form üerinden yönlendirilecek sayfaya gönderecek -->
                        Kaydol
                    </button>
                </div>    
            </form>
        </div>
    </section>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>


