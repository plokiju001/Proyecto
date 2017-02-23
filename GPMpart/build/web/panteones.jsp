<%-- 
    Document   : panteones
    Created on : 25-ene-2017, 14:17:56
    Author     : SHALOM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <title>GPM</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
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
    
    <body>
         <a href="index.jsp">
        <img src="img/Tlajo.png" width="600px">
        </a>
    <nav class="navbar navbar-inverse">
        <div class ="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="panteones.jsp">PANTEONES</a>
                
            </div>
            <ul class="nav navbar-nav" style="background-color: rgba(150,150,150, .2); color: #fff; font-size: 18px; margin-right: 1em; margin-left: 1m">
           
        <li><a href="prescripciones.jsp">Prescripciones</a></li>    
       <li><a href="AdquiTerreno.jsp">Adquisición de terreno nuevo</a></li>        
      <li><a href="certificados.jsp">Certificado de derecho de gaveta</a></li>
      <li><a href="PagoMant.jsp">Pago de mantenimiento</a></li>
      <li><a href="ordenPago.jsp">Orden de pago</a></li>
  <li><a href="#">Sesión</a></li>
            </ul>
            
        </div>
      
          </nav>
         <div class="container" id="panteones">
             
             <div class="dropdown">
  <button class="dropbtn">Dropdown</button>
  <div class="dropdown-content">
    <a href="#">Panteón 01</a>
    <a href="#">Panteón 02</a>
    <a href="#">Panteón 03</a>
      <a href="#">Panteón 04</a>
        <a href="#">Panteón 05</a>
          <a href="#">Panteón 06</a>
            <a href="#">Panteón 07</a>
              <a href="#">Panteón 08</a>
                <a href="#">Panteón 09</a>
                  <a href="#">Panteón 10</a>
                    <a href="#">Panteón 11</a>
                      <a href="#">Panteón 12</a>
                        <a href="#">Panteón 13</a>
                          <a href="#">Panteón 14</a>
                               <a href="#">Panteón 14</a>
                                    <a href="#">Panteón 14</a>
  </div>
</div>
          
<ul class="nav nav-tabs">
  <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
       <li><a data-toggle="tab" href="#p01">Panteón 01</a></li>
    <li><a data-toggle="tab" href="#p02">Panteón 02</a></li>
  <li><a data-toggle="tab" href="#p03">Panteón 03</a></li>
 <li><a data-toggle="tab" href="#p04">Panteón 04</a></li>
  </ul>
             
               <div class="tab-content">
   <div id="home" class="tab-pane fade in active">
    <h2>PANTEONES</h2>
    <p>Por favor selecciona un panteón.</p>
  </div>   
        
        
       
              <div id="p01" class="tab-pane fade">
             <h2>  Panteón 01</h2>
  <table class="table table-hover table-bordered">
    <thead>
      <tr>
        <th>ID</th>
        <th>Cuenta</th>
        <th>Propietario</th>
        <th>Domicilio</th>
        <th>Colonia</th>
        <th>Lote</th>      
        <th>Gavetas</th>
        <th>Ocupación</th>
        <th>Localidad</th>
        <th>Panteón</th>
        <th>Sección</th>
        <th>Frente</th>
        <th>Fondo</th>
        <th>Área Padrón</th>
        <th>Tolerancia</th>
        <th>Caso</th>
        <th>Shape STAr</th>
        <th>Shape STLe</th>
    
      </tr>
    </thead>
    <tbody style="background-color: #FCEBB8">
      <tr>
        <td>13</td>
        <td>P01010001</td>
        <td>José-Chávez-Gallardo</td>
         <td>Juárez#90</td>
          <td>Tlajomulco</td>
           <td>0001</td>
            <td>6</td>
             <td>2</td>
              <td>01</td>
               <td>01</td>
                <td>1</td>
                 <td>3</td>
                  <td>3</td>
                   <td>9</td>
                    <td>0.1</td>
                     <td>1</td>
                      <td>9.09485</td>
                      <td>12.06539</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
         <td></td>
        <td></td>
        <td></td>
      </tr>
    </tbody>
  </table>
</div>
                   
                      <div id="p02" class="tab-pane fade">
             <h2>  Panteón 02</h2>
  <table class="table table-bordered table hover">
    <thead>
      <tr>
        <th>ID</th>
        <th>Cuenta</th>
        <th>Propietario</th>
        <th>Domicilio</th>
        <th>Colonia</th>
        <th>Lote</th>      
        <th>Gavetas</th>
        <th>Ocupación</th>
        <th>Localidad</th>
        <th>Panteón</th>
        <th>Sección</th>
        <th>Frente</th>
        <th>Fondo</th>
        <th>Área Padrón</th>
        <th>Tolerancia</th>
        <th>Caso</th>
        <th>Shape STAr</th>
        <th>Shape STLe</th>
    
      </tr>
       </thead>
      
       <tbody>
           
       </tbody>
      
   </div>          
  </div>    
              
    </body>
</html>
