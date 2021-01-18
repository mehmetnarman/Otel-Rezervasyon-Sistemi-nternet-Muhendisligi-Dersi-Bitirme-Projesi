package org.apache.jsp.OtelSil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class deleteOtel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\r\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei\" rel=\"stylesheet\">\r\n");
      out.write("        ");

            String id = request.getParameter("id");
            String sehir = request.getParameter("sehir");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oteller?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "123456");
                Statement st = conn.createStatement();
                int i = st.executeUpdate("DELETE FROM " + sehir + " WHERE id=" + id);
        
      out.write("\r\n");
      out.write("        <div class=\"card z-depth-3\">         \r\n");
      out.write("            <p>Otel Silindi.. Yönetici Paneline Git.<br></p>\r\n");
      out.write("                <a href='../adminpanel.jsp'><button type='button'>Yönetici Paneli</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
    } catch (Exception e) {
                System.out.print(e);
                e.printStackTrace();
            }
        
      out.write('\r');
      out.write('\n');
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
