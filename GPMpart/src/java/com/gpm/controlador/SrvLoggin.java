/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gpm.controlador;


import com.gpm.beans.User;
import com.gpm.config.Constantes;
import com.gpm.dao.PanteonDAO;
import com.utiles.datos.Cifrar;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jdom2.JDOMException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebServlet(name = "loggin", urlPatterns = {"/loggin"})
public class SrvLoggin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req servlet request
     * @param res servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException, JDOMException {
        
            res.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = res.getWriter()) {
           
            HttpSession sesion = req.getSession();
            
            String usuario = "";
            String pass = "";
            String passcod = "";
            final String KEY = "Tlj159753mX#";
            
            if (req.getParameter("usr") != null)
                usuario = req.getParameter("usr");
            if (req.getParameter("pass") != null)
		pass = req.getParameter("pass").toString();
            
            PanteonDAO gpmD = new  PanteonDAO();
            
            gpmD.setXmlFile(Constantes.getConexionStr(req));
            
            try{
                User u = null;
                
                passcod = Cifrar.Codifica(pass, KEY);
                
                u = gpmD.getUser(usuario, passcod);
                
                gpmD.desconectaBD();
                
                System.out.println(u);
                
                if(!u.getN_empleado().equals("")){
                    
                    sesion.setAttribute("usuario", u);
                    out.print("Session iniciada con éxito");
                    
                }else{
                    out.print("Fallo al iniciar, Usuario/Constraseña incorrecta");
                 
                }
                
                
                
                //req.setAttribute("usr", u);
                //req.getRequestDispatcher("loggin.jsp").forward(req, res);
                
            } catch (SQLException | JDOMException e) {
                System.out.println(" - *- * -* -* - *- * -* -* - * ERROR");
            }
        
        
        
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
        try {
            processRequest(request, response);
        } catch (JDOMException ex) {
            Logger.getLogger(SrvLoggin.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (JDOMException ex) {
            Logger.getLogger(SrvLoggin.class.getName()).log(Level.SEVERE, null, ex);
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
