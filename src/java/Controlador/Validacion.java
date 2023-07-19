/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Profesor
 */
    @WebServlet(urlPatterns = {"/Validacion"})
public class Validacion extends HttpServlet {

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
        
        String letras="ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚabcdefghijklmnñopqrstuvwxyzáéíóú ";
        char[] letra=letras.toCharArray();
        String num="0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚabcdefghijklmnñopqrstuvwxyzáéíóú ";
        char[] numeros_letras=num.toCharArray();
        char[] nombre=request.getParameter("nom").toCharArray();
        char[] ap_pat=request.getParameter("ap").toCharArray();
        char[] ap_mat=request.getParameter("am").toCharArray();
        char[] usuario=request.getParameter("use").toCharArray();
        char[] contra=request.getParameter("pass").toCharArray();
        int prov_nom=0;
        int prov_ap_pat=0;
        int prov_ap_mat=0;
        int prov_usuario=0;
        int prov_contra=0;
        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < letra.length; j++) {
                if (nombre[i]==letra[j]) {
                    prov_nom++;
                }
            }
        }
        for (int i = 0; i < ap_pat.length; i++) {
            for (int j = 0; j < letra.length; j++) {
                if (ap_pat[i]==letra[j]) {
                    prov_ap_pat++;
                }
            }
        }
        for (int i = 0; i < ap_mat.length; i++) {
            for (int j = 0; j < letra.length; j++) {
                if (ap_mat[i]==letra[j]) {
                    prov_ap_mat++;
                }
            }
        }
        for (int i = 0; i < usuario.length; i++) {
            for (int j = 0; j < numeros_letras.length; j++) {
                if (usuario[i]==numeros_letras[j]) {
                    prov_usuario++;
                }
            }
        }
        for (int i = 0; i < contra.length; i++) {
            for (int j = 0; j < numeros_letras.length; j++) {
                if (contra[i]==numeros_letras[j]) {
                    prov_contra++;
                }
            }
        }
        if (prov_nom==nombre.length&&(prov_ap_pat==ap_pat.length&&(prov_ap_mat==ap_mat.length&&(prov_usuario==usuario.length&&(prov_contra==contra.length))))) {
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            response.sendRedirect("home.html");
            }
        }
        else{
           response.sendRedirect("index.html");
           try (PrintWriter out = response.getWriter()) {
               
            }
        }
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
        String letras="ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚabcdefghijklmnñopqrstuvwxyzáéíóú ";
        char[] letra=letras.toCharArray();
        String num="0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚabcdefghijklmnñopqrstuvwxyzáéíóú ";
        char[] numeros_letras=num.toCharArray();
        char[] nombre=request.getParameter("nom").toCharArray();
        char[] ap_pat=request.getParameter("ap").toCharArray();
        char[] ap_mat=request.getParameter("am").toCharArray();
        char[] usuario=request.getParameter("use").toCharArray();
        char[] contra=request.getParameter("pass").toCharArray();
        int prov_nom=0;
        int prov_ap_pat=0;
        int prov_ap_mat=0;
        int prov_usuario=0;
        int prov_contra=0;
        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < letra.length; j++) {
                if (nombre[i]==letra[j]) {
                    prov_nom++;
                }
            }
        }
        for (int i = 0; i < ap_pat.length; i++) {
            for (int j = 0; j < letra.length; j++) {
                if (ap_pat[i]==letra[j]) {
                    prov_ap_pat++;
                }
            }
        }
        for (int i = 0; i < ap_mat.length; i++) {
            for (int j = 0; j < letra.length; j++) {
                if (ap_mat[i]==letra[j]) {
                    prov_ap_mat++;
                }
            }
        }
        for (int i = 0; i < usuario.length; i++) {
            for (int j = 0; j < numeros_letras.length; j++) {
                if (usuario[i]==numeros_letras[j]) {
                    prov_usuario++;
                }
            }
        }
        for (int i = 0; i < contra.length; i++) {
            for (int j = 0; j < numeros_letras.length; j++) {
                if (contra[i]==numeros_letras[j]) {
                    prov_contra++;
                }
            }
        }
        if (prov_nom==nombre.length&&(prov_ap_pat==ap_pat.length&&(prov_ap_mat==ap_mat.length&&(prov_usuario==usuario.length&&(prov_contra==contra.length))))) {
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            response.sendRedirect("login.html");
            }
        }
        else{
           response.sendRedirect("register.html");
           try (PrintWriter out = response.getWriter()) {
               
            }
        }
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