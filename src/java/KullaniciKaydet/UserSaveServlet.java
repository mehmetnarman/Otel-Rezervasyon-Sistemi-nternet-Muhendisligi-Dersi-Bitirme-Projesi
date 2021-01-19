/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KullaniciKaydet;

import Sil.User;
import connector.ConnectionPro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mehmet NARMAN
 */
public class UserSaveServlet extends HttpServlet {

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
            out.println("<title>Servlet UserSaveServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet UserSaveServlet at " + request.getContextPath() + "</h1>");
            String name = request.getParameter("name");
            String email = request.getParameter("mail");
            String password = request.getParameter("password");
            
//make user object
            User userModel = new User(name, email, password);
            
//create a database model
            UserDatabase regUser = new UserDatabase(ConnectionPro.getConnection());
            if (regUser.saveUser(userModel)) {
                out.println("<section class=\"text\">\n" +
                    "            <div style=\"text-align: center\">\n" +
                    "                <span style=\"font-size: 20px; color: white;\">Kullanıcı Eklendi... Giriş Yapmak İçin Butona Bas.</span><br>\n" +
                    "                <a href='girisSayfası.jsp'><button  style=\"background-color: orange\" type='button'>Giriş Yap</button></a>\n" +
                    "            </div>\n" +
                    "        </section>");
            } else {
                out.println("<section class=\"text\">\n" +
                    "            <div style=\"text-align: center\">\n" +
                    "                <span style=\"font-size: 20px; color: white;\">Kullanıcı Eklenemedi... Tekrar Deneyin</span><br>\n" +
                    "                <a href='KullanıcıEkle/KullaniciSifreOlustur.jsp'><button  style=\"background-color: orange\" type='button'>Tekrar Deneyin</button></a>\n" +
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
