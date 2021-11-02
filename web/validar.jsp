<%-- 
    Document   : validar
    Created on : 19/10/2021, 06:14:51 PM
    Author     : edith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Validar Usuario</title>
        
        
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
        <h1>Confirma Acceso Usuario</h1>
        <hr>
        <!-- llamada de librerias -->
    <%@page  import="java.sql.*" %>
    <%@page  import="conexion.Conexion" %>
    <%@page errorPage="error.jsp" %>
    
    <%
        String usuarioAcceso = request.getParameter("usuario");
        String passwordAcceso = request.getParameter("password");
        
    %>     
    
    <!-- llamada de la conexion mediante un objeto -->
    <%
        Conexion conexion = new Conexion("jdbc:mysql://localhost/bdcerdamonroyproyectojsp", "root", "");
        
        ResultSet rs = conexion.ejecutaSelect("SELECT * FROM TUSUARIOS");
        boolean error=true;
        while(rs.next()==true){//inicia while
            if(usuarioAcceso.equals(rs.getString("usuario"))&&passwordAcceso.equals(rs.getString("password"))){
                error=false;
            
    %>
    
    <div class="container">
        <div class="jumbotron">
            <center>
                <h3>Bienvenido a Sistema control Alumnos</h3>
                <h3>Usuario: <%= usuarioAcceso%> </h3>
                <hr>
                <h2>Menu Principal</h2>
                <hr>
                <h3>Fecha y hora del sistema: <%= new java.util.Date()%></h3>
                
                
            </center>
                
                <%
                }//termina if
}//termina while
if(error==true){
                %>
                
                <h3>Error usuario no existe</h3>
                <h3>Usuario: <%= usuarioAcceso%></h3>
                <a href="acceso.html"><h4>Regresar a la ventana de acceso</h4></a>
                <%
                }//termina el segundo if    
                %>
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
