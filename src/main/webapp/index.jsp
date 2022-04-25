<%-- 
    Document   : index
    Created on : Apr 24, 2022, 11:10:48 PM
    Author     : Dell
--%>

<%@page import="modelCarritoCompras.Producto"%>
<%@page import="java.util.List"%>
<%@page import="modelCarritoCompras.Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //clase de servicio que contiene metodos necesarios para el funcionamiento del programa
    Service ser = Service.instance();
    //retorno la lista de prodcutos en oferta para mostrarlos en esta pagina principal
    List<Producto> productosOferta = ser.retornarProductosPromocion();
    
    Producto prod7 = new Producto("/CarritoCompras/assets/img/Funko.jpg", 100, "Funko", "Otros", true);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrito de Compras</title>
        <%@ include file="/presentation/Head.jsp" %>
    </head>
    <body style="background-color: black; color: white;">
         <%@ include file="/presentation/Header.jsp" %>
<!--         Container que mostrara todos los productos que esten en promocion-->
         <div class="container-md">
             <% for(Producto p: productosOferta){ %>
             <div class="row d-flex border border-secondary rounded-pill shadow" style="margin: 3em; max-height: 400px"> 
                 <div id="descripcion" class="col" style="max-width: 300px;">
                     <p class="fs-3 text-center">
                         <br>
                         Producto: <%= p.getNombreProducto() %>
                     </p>
                 </div>
                 
                 <div id="imagen" class="col"  style="max-height: 400px">
                     <img alt="..." class="img-fluid" src="<%= p.getDireccionImagen() %>" >
                 </div>
                 
                 <div id="precio" class="col">
                        <p class="fs-3 text-center">
                         <br>
                         Precio: <%= p.getPrecio() %>
                       </p>
                 </div>
                 
                       <div id="boton-agregar" class="col" style="padding: 2em 0px 2em 2em; margin-left: 6em;">
                       <button type="button" class="btn btn-outline-success rounded-pill" style="height: 100px; width: 150px;">Agregar</button>
                      </div>
                 
             </div>
                        <%}%>
         </div>
    </body>
</html>
