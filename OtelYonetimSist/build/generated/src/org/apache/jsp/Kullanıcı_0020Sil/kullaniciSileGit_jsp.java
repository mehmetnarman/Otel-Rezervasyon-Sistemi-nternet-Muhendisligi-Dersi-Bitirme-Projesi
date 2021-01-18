package org.apache.jsp.Kullanıcı_0020Sil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class kullaniciSileGit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "otelyonetim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei\" rel=\"stylesheet\">\r\n");
      out.write("            <body>\r\n");
      out.write("            <section class=\"adminlogin\">\r\n");
      out.write("                <div class=\"card z-depth-3\">\r\n");
      out.write("                    <div class=\"card-panel center orange accent-2\">\r\n");
      out.write("                        <span class=\"card-title\">Kullanıcı Sil</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <table border=\"1\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Kullanıcı Adı</td>\r\n");
      out.write("                            <td>Email</td>\r\n");
      out.write("                            <td>İşlem</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                            try {
                                connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                                statement = connection.createStatement();
                                String sql = "select * from user";
                                resultSet = statement.executeQuery(sql);
                                int i = 0;
                                while (resultSet.next()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("name"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(resultSet.getString("email"));
      out.write("</td>\r\n");
      out.write("                            <td><a href=\"kullaniciSil.jsp?uid=");
      out.print(resultSet.getString("uid"));
      out.write("\"><button type=\"button\" class=\"delete\">Sil</button></a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                                    i++;
                                }
                                connection.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            </body>\r\n");
      out.write("            </html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
