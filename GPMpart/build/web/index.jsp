<%-- 
    Document   : index
    Created on : 02-feb-2017, 9:29:08
    Author     : SHALOM
--%>

<%@page import="com.gpm.beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>GPM</title>
            
        <link rel="shortcut icon" href="img/tlajo_en_movimiento_favicon.ico" type="image/x-icon">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="font-awesome-4.6.1/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="iconFonts/material-icons.css">
        <link rel="stylesheet" href="css/estilo.css">

        <script src="js/jquery-1.11.3.min.js"></script>

        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="js/typeahead.min.js"></script>
        <script src="js/acciones.js"></script>
        <script src="js/validator.js"></script>
        <script src="js/jquery-barcode.min.js"></script>
        <!-- Custom CSS -->
        
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    
    </head>
     <%
        boolean logOK = false;
        User u = new User();

        if (session.getAttribute("usuario") != null) {
            u = (User) session.getAttribute("usuario");
        }

        System.out.println(u);

        logOK = (u.getN_empleado().equals("")) ? false : true;
    %>
    <body>
         <a href="index.html">
        <img src="img/Tlajo.png" width="600px">
        </a>       
          <% if (logOK) { %>
    <nav class="navbar navbar-inverse">
        <div class ="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="index.html">Panteones</a>
                
            </div>
            <ul class="nav navbar-nav">
                
            <li class="dropdown">
            <li>
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Servicios
                <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="tramites.jsp">Prescripciones</a></li>
                    <li><a href="AdquiTerreno.jsp">Adquisición de terreno</a></li>
                    <li><a href="certificados.jsp">Certificados</a></li>
                     <li><a href="PagoMant.jsp">Pago de mantenimiento</a></li>
                      <li><a href="ordenPago.jsp">Órdenes de pago</a></li>
                </ul>
                
            </li>
            <li>
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Catálogo
                <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="PagoMant.jsp">Panteones</a></li>
                    <li><a href="OrdenPago.jsp">Localidades</a></li>
                     <li><a href="Propietario.jsp">Propietarios</a></li>
                </ul>
            </li>
           
           <li><a href="#">Pagos</a></li>
            <li><a href="#">Tesorería</a></li>
            
             <a class="dropdown-toggle" data-toggle="dropdown" href="#">Usuario
                <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="tramites.jsp">Cambiar contraseña</a></li>
            </ul>
            </ul>
            
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Sesión</a></li>
            </ul>
            
        </div>
          </nav>
           <% } else { %>
                       

                        <% } %>
                        
                      <div class="container" id="nom" >                    
                                <div id="contLogo">
                                    <div id="dirCem" style="float:right">
    
                                        <strong><span id="sp11" style="font-size: 35px;  color: #888; left: 15px; top: 30px;">Dirección de</span></strong><br>
                                        <strong><span id="sp21" style="font-size: 35px; color: #999; left: 10px; top: 40px;"> Cementerios</span></strong>
                                        <div id="barraN1" style="height: 5px; width: 210px; 
    background-color: #f0ad4e; 
    position: static; 
    left: 0px; bottom: 4px;"></div>
                                    </div>
                           </div>
                            </div>
                   
                       
                        
          <div class="container" id="logIn">
               <a href="#" id="" style="font-size: 16px;"><span class="fa fa-info-circle"></span>&nbsp; &nbsp; Inicia Sesión</a>
               <br>
               <br> 
               <form id="frmLog">
                                        <div class="form-group">
                                            <label for="usr">Usuario:</label>
                                            <input type="text" class="form-control" id="" name="usr" required>
                                        </div>
                                        <div class="form-group">
                                            <label for="pwd">Contraseña:</label>
                                            <input type="password" class="form-control" id="" name="pass" required>
                                        </div>
                                        <button type="submit" class="btn btn-default">Ingresar</button>
                                    </form>

                                </div>
                            </div>

        </div> 
        
      
        </body>
 
</html>
