<%-- 
    Document   : otelAra
    Created on : 15.Oca.2021, 14:59:52
    Author     : Mehmet NARMAN
--%>
<!DOCTYPE html>
<html>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
            <%@page import="java.sql.DriverManager"%>
            <%@page import="java.sql.ResultSet"%>
            <%@page import="java.sql.Statement"%>
            <%@page import="java.sql.Connection"%>
            <%
                String id = request.getParameter("id");
                String driver = "com.mysql.jdbc.Driver";
                String connectionUrl = "jdbc:mysql://localhost:3306/";
                String database = "oteller?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
                String userid = "root";
                String password = "123456";
                try {
                    Class.forName(driver);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;
            %>

            <body>
            <section class="adminlogin">
                <div class="card z-depth-3">
                    <div class="card-panel center orange accent-2">
                        <span class="card-title">Oteller</span>
                    </div>
                    <form action="RezervasyonEkle/RezervasyonEkle.jsp">
                        <table>
                            <tr>
                                <td></td>
                                <td style="text-align: center"><label for="mail">Rezervasyon Yapılacak Mail Adresi</label><br>
                                    <input style="text-align: center" type="text" id="mail" name="mail" value="<%=request.getParameter("mail")%>" readonly>
                                </td>
                            </tr>
                            <tr>
                                <td style="text-align: center">Otel Adı</td>
                                <td>Bulunduğu Şehir</td>
                                <td>Rezervasyon Yapılacak Oteli Seç</td>
                            </tr>
                            <%
                                String x = "select * from " + request.getParameter("sehir");
                                try {
                                    connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                                    statement = connection.createStatement();
                                    String sql = x;
                                    resultSet = statement.executeQuery(sql);
                                    while (resultSet.next()) {
                            %>
                            <tr>                   
                                <td><%=resultSet.getString("oteladi")%></td>
                                <td><%=resultSet.getString("sehir")%></td>
                                <td><input type="submit" id="Rezervasyon" name="Rezervasyon" value="<%=resultSet.getString("oteladi")%>">     
                                </tr>
                                <%
                                        }
                                        connection.close();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                %>
                                <tr>
                                    <td></td>
                                    <td style="text-align: center"><label for="sehir">Seçilen Otel Konumu</label><br>
                                    <input style="text-align: center" type="text" id="sehir" name="sehir" value="<%=request.getParameter("sehir")%>" readonly>
                                    </td>
                                </tr>
                                <tr>
                                <td style="text-align: center"><label for="giris">Giriş Tarihi</label><br>
                                <input type="date" id="giris" name="giris" required>
                                </td>
                                <td></td>
                                <td style="text-align: center"><label for="cıkıs">Çıkış Tarihi</label><br>
                                <input type="date" id="cıkıs" name="cıkıs" required></td>
                                </tr>
                                    </table>

                                    </form>
                                    </div>
                                    </section>
                                    </body>
                                    </html>
