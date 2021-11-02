<%-- 
    Document   : actualizar22
    Created on : 15/10/2021, 04:37:10 PM
    Author     : edith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Actualizar Alumna CerdaMonroy</title>
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
    <center><h1>Registro actualizado con exito!</h1></center>
    <hr>
    <%@page import = "java.sql.*" %>
    <%@page import = "conexion.Conexion" %>
    <%@page errorPage="error.jsp" %>
    
    <%
    Conexion conexion = new Conexion("jdbc:mysql://localhost/bdcerdamonroyproyectojsp", "root", "");    
    String numero = (String)session.getAttribute("num");
    String nombre=request.getParameter("nombre");
    String apPaterno=request.getParameter("ap1");
    String apMaterno=request.getParameter("ap2");
    
    String queryActualizar="UPDATE talumnos SET nombre='"+nombre+"', apepat='"+apPaterno+"', apemat='"+apMaterno+"' WHERE matricula='"+numero+"'";
    int confirmaEditar=conexion.ejecutaSentencia(queryActualizar);
    if(confirmaEditar==1){//inicia if para confirmar edicion exitosa
    %>
    <center>
        <div class="container">
            <div class="jumbotron">
                <h3>Confirmacion datos de alumna actualizada</h3>
                <div class="alert alert-danger">
                    <h4><i>(Verifica datos)</i></h4>
                    <h4>Nombre alumna : <%= nombre%></h4>
                    <h4>Apellido paterno alumna : <%= apPaterno%></h4>
                    <h4>Apellido materno alumna : <%= apMaterno%></h4>
                    
                </div>
                    <hr>
                    <a href="editaralumno.html"><h4>Editar otro alumno</h4></a>
                    <hr>
            </div>
        </div>
    </center>
    <%
    }else{//inicia else    
    %> 
    <hr>
    <h4>Error no realizo actualuzacion de rigistro alumna!</h4>
    <h4>Ningun registro actualizado</h4>
    <a href="editaralumno.html"><h4>Regresar a formulario anterior</h4></a>
    
    
    
    <%
    }//termina else    
    %>
    <h4>Fecha y hora del sistema: <%= new java.util.Date()%></h4>    
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
