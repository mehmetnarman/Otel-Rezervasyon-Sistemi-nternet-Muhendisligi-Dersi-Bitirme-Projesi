/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OtelKaydet;


import connector.ConnectionOtel;
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
public class OtelSaveServlet extends HttpServlet {

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
            out.println("<title>Servlet OtelSaveServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet OtelSaveServlet at " + request.getContextPath() + "</h1>");
            String oteladi = request.getParameter("oteladi");
            String sehir = (request.getParameter("sehir")).toUpperCase();           //Şehir isimlerini küçüğe çevirdim çünkü database de isimlerim küçük
            Otel otel = new Otel(oteladi, sehir);

            OtelDatabase regOtel = new OtelDatabase(ConnectionOtel.getConnection());
            if (regOtel.saveOtel(otel)) {
                out.println("<section class=\"text\">\n" +
                    "            <div style=\"text-align: center\">\n" +
                    "                <span style=\"font-size: 20px; color: white;\">Otel Eklendi... Yönetici Paneline Git</span><br>\n" +
                    "                <a href='adminpanel.jsp'><button  style=\"background-color: orange\" type='button'>Yönetici Paneli</button></a>\n" +
                    "            </div>\n" +
                    "        </section>");
                
                
                
                
                //out.println("Yönetici Eklenemedi Tekrar Deneyin<br>");
                //out.println("<a href='YöneticiEkle/YoneticiSifreOlustur.jsp'><button type='button'>Tekrar Deneyin</button></a>");
                //response.sendRedirect("adminpanel.jsp");
            } else {
                out.println("<section class=\"text\">\n" +
                    "            <div style=\"text-align: center\">\n" +
                    "                <span style=\"font-size: 20px; color: white;\">Otel Eklenemedi... Tekrar Deneyin</span><br>\n" +
                    "                <a href='OtelEkle/OtelEkle.jsp'><button  style=\"background-color: orange\" type='button'>Tekrar Deneyin</button></a>\n" +
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
