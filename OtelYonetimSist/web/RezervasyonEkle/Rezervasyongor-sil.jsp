<%-- 
    Document   : RezervasyonGoruntule
    Created on : 18.Oca.2021, 05:48:37
    Author     : Mehmet NARMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
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
<!DOCTYPE html>
<html>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
            <body>
            <section class="adminlogin">
                <div class="card z-depth-3">
                    <div class="card-panel center orange accent-2">
                        <span class="card-title">Rezervasyon Görüntüle-Sil</span>
                    </div>
                    <table border="1">
                        <tr>
                            <td>Rezervasyon Sahibinin Mail Adresi</td>
                            <td>Otel Adı</td>
                            <td>Otelin Bulunduğu Şehir</td>
                            <td>Otele Giriş Tarihi</td>
                            <td>Otelden Çıkış Tarihi</td>
                        </tr>
                        <%
                            try {
                                connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                                statement = connection.createStatement();
                                String sql = "select * from rezervasyon";
                                resultSet = statement.executeQuery(sql);
                                int i = 0;
                                while (resultSet.next()) {
                        %>
                        <tr>
                            <td><%=resultSet.getString("mail")%></td>
                            <td><%=resultSet.getString("otelAdi")%></td>
                            <td><%=resultSet.getString("sehir")%></td>
                            <td><%=resultSet.getString("giris")%></td>
                            <td><%=resultSet.getString("cikis")%></td>
                            <td><a href="RezervasyonSil.jsp?id=<%=resultSet.getString("id")%>"><button type="button" class="delete">Rezervasyon Sil</button></a></td>
                        </tr>
                        <%
                                    i++;
                                }
                                connection.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        %>
                    </table>
                </div>
            </section>
            </body>
            </html>
