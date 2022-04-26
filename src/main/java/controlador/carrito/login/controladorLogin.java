/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador.carrito.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controladorLogin", urlPatterns = {"/presentation/login/login"})
public class controladorLogin extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         request.setAttribute("model", new Model());  //este objeto estara en el request para poder extraerlo despues
        
        String viewUrl="";
         switch(request.getServletPath()){
            //si me llega el path de login/show entonces ejecuto una logica para mostrar la vista de show
            case "/presentation/login/login":
                viewUrl= showLogin(request);
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

    //metodo que me retornara la pagina despues del login
    private String showLogin(HttpServletRequest request) {
        //extrae los datos y los ingresa al model
        this.extraerDatos(request);
        return showLoginAction(request);
    }
   //logica para abrir la pagina despues del login
    private String showLoginAction(HttpServletRequest request) {
         Model model= (Model) request.getAttribute("model");
          //extrae la informacion del cliente
          return "";
    }
    
    //me eztrae los datos ingresados en el form del login para verificar que exita y iniicar la sesion
    private void extraerDatos(HttpServletRequest request){
        Model model= (Model) request.getAttribute("model");//retorna el mismo objeto model del request 
       
       //el modelo tiene como atributo en el getCurrent un objeto usuario por lo que lo que se..
       //..realiza aca es colocarle los valores de la sesion respectiva
        model.getCurrent().setUser(request.getParameter("user"));
        model.getCurrent().setClave(request.getParameter("clave"));
        model.getCurrent().setTipo(1); //por default es cliente
    }

}
