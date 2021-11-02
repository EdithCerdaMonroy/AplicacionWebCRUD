<%-- 
    Document   : consultaralumnos
    Created on : 5/10/2021, 06:09:49 PM
    Author     : edith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <title>JSP Page Consulta Alumno</title>
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
    <marquee><h1>JSP Page Consulta Alumno</h1></marquee>
    <hr>
    <!-- llamada de librerias -->
    <%@page  import="java.sql.*" %>
    <%@page  import="conexion.Conexion" %>
    <%@page errorPage="error.jsp" %>

    <!-- llamada de la conexion mediante un objeto -->
    <%
        Conexion conexion = new Conexion("jdbc:mysql://localhost/bdcerdamonroyproyectojsp", "root", "");
        String consultaAlumnos = "SELECT * FROM talumnos";
        ResultSet rs = conexion.ejecutaSelect(consultaAlumnos);

        ResultSetMetaData rsmd = rs.getMetaData();
        int col = rsmd.getColumnCount();
    %>
    <!-- /llamada de la conexion mediante un objeto -->
    <!-- IMPRIMIR EN CONTAINER -->
    <div class="container">
        <div class="jumbotron">
            <center>
                <h2>Consulta de alumnos sistema WEB</h2>
                <hr>
                <div class="thumbnail">
                    <table class="table table-hover alert-info">
                        <thead>
                            <tr>
                                <%
                                    for (int k = 1; k <= col; k++) {


                                %>
                                <th scope="col"><h3><strong><%= rsmd.getColumnName(k)%></strong></h3></th>
                                            <%
                                                }
                                            %>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <%
                                    while (rs.next()) {
                                %>
                                <td><h4><%= rs.getString(1)%></h4></td>
                                <td><h4><%= rs.getString(2)%></h4></td>
                                <td><h4><%= rs.getString(3)%></h4></td>
                                <td><h4><%= rs.getString(4)%></h4></td>
                            </tr>
                            <%
                        }//termina while
%>
                        </tbody>
                    </table>
                </div>
            </center>
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
