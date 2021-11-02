<%-- 
    Document   : registraralumno
    Created on : 8/10/2021, 04:52:17 PM
    Author     : edith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Registro Alumna CerdaMonroy</title>
        
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
        <h1>Alumna registrada con exito!</h1>
       <hr> 
       <!--Librerias Jsp para la conexion-->
       <%@page import = "java.sql.*" %> 
       <%@page import = "conexion.Conexion" %> 
       <%@page errorPage="error.jsp" %>
       <!--Llamada a la conexion, variables y sql query--> 
       <%
       Conexion conexion = new Conexion("jdbc:mysql://localhost/bdcerdamonroyproyectojsp", "root", "");
       int matriculaAlu=Integer.parseInt(request.getParameter("matricula"));
       String nombreAlu=request.getParameter("nombre");
       String apPaternoAlu=request.getParameter("ap1");
       String apMaternoAlu=request.getParameter("ap2");
       
String sqlAlta="INSERT INTO talumnos VALUE ('"+matriculaAlu+"','"+nombreAlu+"','"+apPaternoAlu+"','"+apMaternoAlu+"')";
int c = conexion.ejecutaSentencia(sqlAlta);
if (c==1){
       
       %>
       
       <!--/Llamada a la conexion, variables y sql query--> 
       <div class="container">
           <div class="jumbotron">
               <h2>Sistema de control de alumnos</h2>
               <hr>
               <div class="thumbnail">
                   <center>
                       <h2>Se agrego de forma exitosa un nuevo alumno</h2>
                       <hr>
                       <h3>Matricula alumno: <%= matriculaAlu%></h3>
                       <h3>Nombre alumno: <%= nombreAlu%></h3>
                       <h3>Apellido Paterno alumno: <%= apPaternoAlu%></h3>
                       <h3>Apellido Materno alumno: <%= apMaternoAlu%></h3>
                   </center>
                   <hr>
                   <h3>Fecha y hora del sistema: <%= new java.util.Date() %></h3>
                   <hr>
                   <a href="altaalumnos.html"><h3><i>Registrar otro alumno</i></h3></a>
                   <%
                   }//termina if
                   %>
               </div>
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
