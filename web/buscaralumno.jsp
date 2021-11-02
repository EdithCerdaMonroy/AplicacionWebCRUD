<%-- 
    Document   : buscaralumno
    Created on : 12/10/2021, 05:21:10 PM
    Author     : edith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page BuscarEditar  Alumno CerdaMonroy</title>

        <!-----------------------------BOOTSTRAP----------------------------->
        <!--Icono-->
        <link rel="Icon" type="img/png" href="img/logoicono.png">
        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>
        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>
        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css"/>
        <!--Ventanas emergentes-->
        <link rel="stylesheet" type="text/css" href="css/ventanas.css">
        <!-----------------------------/BOOTSTRAP----------------------------->
    </head>
    <body>
        <!-- Llamado librerias -->
        <%@page import= "java.sql.*"  %>
        <%@page import= "conexion.Conexion"  %>
        <%@page errorPage="error.jsp" %>
        <%
            Conexion conexion = new Conexion("jdbc:mysql://localhost/bdcerdamonroyproyectojsp", "root", "");
                      //manejo de sesiones para identificar el registro que se busca
               String numero = request.getParameter("matricula");
               int numeroCuenta = Integer.parseInt(numero);
               session.setAttribute("num", numero);
               //cursor consultar o recorrer una tabla  e identificar un campo distintivo
            String consultaBusqueda="SELECT * from talumnos where matricula = '"+numeroCuenta+"'";
                    ResultSet rs = conexion.ejecutaSelect(consultaBusqueda);
                           if(rs.next()){//inicia if


        %>


        <div class="container">
           <div class="jumbotron">
               <center><h2>Sistema de Control Buscar Alumna CerdaMonroy</h2></center>
               <hr>
               <div class="thumbnail">
                   <center>
                       <h1>Formulario para modificar Registros alumnos</h1>
                       <h3><i>(Cambia la informacion en los campos de texto)</i></h3>
                       <hr>
                       <form method="post" action="actualizar22.jsp">
                           <div class="form-group">    
                       <h3>Nombre: </h3>
                       <input type="text" name="nombre" class="form-control" value="<%= rs.getString(2) %>"/>
                        <h3>Apellido paterno: </h3>
                       <input type="text" name="ap1" class="form-control" value="<%= rs.getString(3) %>"/>
                        <h3>Apellido materno: </h3>
                       <input type="text" name="ap2" class="form-control" value="<%= rs.getString(4) %>"/>   
                              <br>
                       <input type="submit" class="btn btn-info btn-block" value="Modificar datos"/>
                           </div>
                       </form>
                       <hr>
                      
                       <%
                           }else{//inicia else
                       %>
                       <h1>Error alumno no encontrado</h1>
                       <hr>
                       <h3>Fecha y hora del sistema: <%= new java.util.Date()%> </h3>
                       <a href="editaralumno.html"><h4>Regresar a Menu Principal</h4></a>
                       <%
                           }//termina else
                       %>
                       
                   </center>  
                      
               </div>
                        <h3>Fecha y hora del sistema: <%= new java.util.Date()%> </h3>
           </div>
       </div>

        <!-- js Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>
        <script type="text/javascript" src="js/municipios.js"></script>
        <script type="text/javascript" src="js/select_estados.js"></script>
        <!-- /js Plugins -->
    </body>
</html>