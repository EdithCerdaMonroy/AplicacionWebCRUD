<%-- 
    Document   : eliminaralumno
    Created on : 12/10/2021, 05:21:10 PM
    Author     : edith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Baja Alumno CerdaMonroy</title>

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
        <%@page import= "java.sql.*"  %>
        <%@page import= "conexion.Conexion"  %>
        <%@page errorPage="error.jsp" %>
        <%
            Conexion conexion = new Conexion("jdbc:mysql://localhost/bdcerdamonroyproyectojsp", "root", "");
            int matriculaAlu = Integer.parseInt(request.getParameter("matricula"));
            //para borrar con variable objeto
            String bajaAlumno = "DELETE FROM talumnos WHERE matricula = '" + matriculaAlu + "'";
            int confirmaBaja = conexion.ejecutaSentencia(bajaAlumno);
            if (confirmaBaja == 1) {

        %>
        <div class="container">
            <div class="jumbotron">
                <h4>Sistema de control de alumnos</h4>
                <hr>
                <div class="alert alert-danger">
                    <h2>Confirma baja</h2>
                    <hr>
                    <h3>Numero cuenta <%= matriculaAlu%></h3>
                    <hr>
                    <h3>Fecha y hora del sistema : <%= new java.util.Date()%></h3>    
                    <hr>
                    <a href="bajaalumno.html"><h4>Eliminar otro registro alumno</h4></a>
                </div> 


            </div>
        </div>
        <%
            }else{
        %>
        <div class="alert alert-info">
            <h1>Error alumno no eliminado</h1>
            <h3><i>El numero de cuenta o matricula alumno no Existe</i></h3>
            <h2>Verifica</h2>
            <hr>
            <a href="bajaalumno.html"><h4>Regresar o a formulario Baja Alumno</h4></a>
        </div>
        <%
        }
        %>



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