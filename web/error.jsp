<%-- 
    Document   : error
    Created on : 19/10/2021, 04:17:28 PM
    Author     : edith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Tratamiento de errores CerdaMonroy</title>
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
    <marquee><h1>Error en tiempo de ejecucion!</h1></marquee>
    <hr>
    <div class="container">
        <center><h3>Sistema de control UACM CerdaMonroy</h3></center>
        <div class="jumbotron">
            <hr>
            <div class="thumbnail">
                <center>
                    <h1>Mensaje importante del sistema</h1>
                    <h2><i>Favor de comunicarlo al Administrador del Sitio</i></h2>
                    <hr>
                    <%@page isErrorPage="true"%>
                    <div class="alert alert-danger" role="alert">
                        <h3><i>Ha ocurrido un error producido por : </i></h3>
                        <h4><i><%= exception %></i></h4>
                        
                    </div>
                        <hr>
                        <center>
                            <h4><a href="index.html">Abrir menu principal del sistema</a></h4>
                            <hr>
                            <h4>Fecha y hora del sistema : <%= new java.util.Date() %></h4>
                            
                        </center>
                </center>
                
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
