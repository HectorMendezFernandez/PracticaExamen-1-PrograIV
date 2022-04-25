/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador.carrito.pagina.principal;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(name = "controlador", urlPatterns = {"/presentation/carrito", "/presentation/producto", "/presentation/logi", "/presentation/login/logout"})
public class controlador extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         System.out.println("PAAAAATH: "+request.getServletPath());
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("model", new Model()); 
        
        String viewUrl=""; // var que almacenara la vista que se mostrara
        System.out.println("PAAAAATH: "+request.getServletPath());
        switch(request.getServletPath()){
            //si me llega el path de login/show entonces ejecuto una logica para mostrar la vista de show
            case "/presentation/carrito":
                viewUrl= "/presentation/carrito/showCarrito.jsp";
                break;   
             //si me llega el path de login/login entonces ejecuto una logica para mostrar la vista de login
            case "/presentation/producto":
               viewUrl= "/presentation/producto/showProducto.jsp";
                break;            
              //si me llega el path de login/logout entonces ejecuto una logica para mostrar la vista logout
            case "/presentation/logi":
                viewUrl= login(request);
                break;
            case "/presentation/login/logout":
                 //aqui deberia de quitar la sesion y retornar la pagina principal
                 viewUrl= "/presentation/login/login.jsp";
                 break;
        }
        //en base a lo que retorno el switch en la variable viewUrl realiza el foward respectivo
        request.getRequestDispatcher(viewUrl).forward( request, response); 
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

    private String login(HttpServletRequest request) 
    {
        return showActionLogin(request);
    }

    private String showActionLogin(HttpServletRequest request) {
        
        return "/presentation/login/login.jsp";
    }

}
