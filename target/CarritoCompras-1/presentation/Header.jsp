<%-- 
    Document   : Header
    Created on : Apr 24, 2022, 11:11:33 PM
    Author     : Dell
--%>
<%@page import="modelCarritoCompras.Usuario"%>
<% 
    //extraemos el usuario de la sesion si esta registrado
   Usuario usuario= (Usuario) session.getAttribute("usuario");
%>
<header>
    <nav class="navbar navbar-expand-lg navbar-black " style="background-color: #292929;">
            <div class="container-fluid">
                <a class="" href="/CarritoCompras/index.jsp">Home</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0" id="navbarSupportedContent">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Electronica</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Deporte</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Otros</a>
                        </li>
                     </ul>
<!--                        boton de busqueda-->
                            <form class="d-flex" name="form" action="/CarritoCompras/presentation/producto" method="post">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-primary" type="submit">Search</button>
                            
<!--                         icono carrito compras-->
                          
                             <a class="nav-link" href="/CarritoCompras/presentation/carrito">
                             <i class="fa-solid fa-cart-shopping"></i>
                             </a>
                             <% if(usuario == null){ %>
<!--                         icono log-in-->
                               <a class="nav-link" href="/CarritoCompras/presentation/logi">
                                 <i class="fa-solid fa-arrow-right-to-bracket"></i>
                              </a>
                             <%}else{ %>
                                <a class="nav-link" href="/CarritoCompras/presentation/login/logout">
                                  <i class="fa-solid fa-arrow-right-from-bracket"></i>
                                </a>
                             <%}%>
        </nav>
</header>