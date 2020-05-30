/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import conectBD.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author denwa
 */
public class AgregarVideo extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        RequestDispatcher res;

        String usuarioVideo = request.getParameter("usuarioVideo");
        String plataforma = request.getParameter("plataforma");
        String titulo = request.getParameter("titulo");
        String url = request.getParameter("url");

        if (plataforma.equals("YouTube")) {
            String cadena = url.substring(32);

            Consultas co = new Consultas();
            if (co.AgregarVideo(usuarioVideo, titulo, cadena, plataforma,url)) {
                request.setAttribute("v", "2");
                request.setAttribute("com", request.getParameter("usuario"));
            } else {
                request.setAttribute("v", "0");
            }
        } else {
            String cadena = url.substring(18);
            Consultas co = new Consultas();
            if (co.AgregarVideo(usuarioVideo, titulo, cadena, plataforma,url)) {
                request.setAttribute("v", "2");
                request.setAttribute("com", request.getParameter("usuario"));
            } else {
                request.setAttribute("v", "0");
            }
        }

        res = request.getRequestDispatcher("Comentarios.jsp");
        res.forward(request, response);

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
