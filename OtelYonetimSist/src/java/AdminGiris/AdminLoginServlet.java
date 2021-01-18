/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdminGiris;

import connector.ConnectionPro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Mehmet NARMAN
 */
public class AdminLoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\'stylesheet\' href=\'https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\'>");
            out.println("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("<title>Servlet AdminLoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet AdminLoginServlet at " + request.getContextPath() + "</h1>");
            String email = request.getParameter("email");           //girilen emaili admin login sayfasından istedim
            String password=request.getParameter("password");       //girilen passwordu admin login sayfasından istedim
            adminDao ado = new adminDao(ConnectionPro.getConnection());
            Admin admin = ado.logAdmin(email, password);            //Admin veri tablosunda eğer email ve password varsa bilgileri getiriyoruz
            if(admin!=null){
                response.sendRedirect("adminpanel.jsp");
            }else{
                out.println("<section class=\"text\">\n" +
                    "            <div style=\"text-align: center\">\n" +
                    "                <span style=\"font-size: 20px; color: white;\">Kullanıcı Bulunamadı...</span><br>\n" +
                    "                <a href='adminlogin.jsp'><button  style=\"background-color: orange\" type='button'>Tekrar Deneyin</button></a>\n" +
                    "            </div>\n" +
                    "        </section>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
