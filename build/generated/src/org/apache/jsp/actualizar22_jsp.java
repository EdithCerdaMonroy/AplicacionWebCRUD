package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import conexion.Conexion;

public final class actualizar22_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page Actualizar Alumna CerdaMonroy</title>\n");
      out.write("        <!-----------------------------BOOTSTRAP----------------------------->\n");
      out.write("        <!--Icono-->\n");
      out.write("        <link rel=\"Icon\" type=\"img/png\" href=\"img/logoicono.png\">\n");
      out.write("        <!-- Google font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <!-- Slick -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\n");
      out.write("        <!-- nouislider -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\n");
      out.write("        <!-- Font Awesome Icon -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <!-- Custom stlylesheet -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <!--Ventanas emergentes-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/ventanas.css\">\n");
      out.write("        <!-----------------------------/BOOTSTRAP----------------------------->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1>Registro actualizado con exito!</h1></center>\n");
      out.write("    <hr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

    Conexion conexion = new Conexion("jdbc:mysql://localhost/bdcerdamonroyproyectojsp", "root", "");    
    String numero = (String)session.getAttribute("num");
    String nombre=request.getParameter("nombre");
    String apPaterno=request.getParameter("ap1");
    String apMaterno=request.getParameter("ap2");
    
    String queryActualizar="UPDATE talumnos SET nombre='"+nombre+"', apepat='"+apPaterno+"', apemat='"+apMaterno+"' WHERE matricula='"+numero+"'";
    int confirmaEditar=conexion.ejecutaSentencia(queryActualizar);
    if(confirmaEditar==1){//inicia if para confirmar edicion exitosa
    
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h3>Confirmacion datos de alumna actualizada</h3>\n");
      out.write("                <div class=\"alert alert-danger\">\n");
      out.write("                    <h4><i>(Verifica datos)</i></h4>\n");
      out.write("                    <h4>Nombre alumna : ");
      out.print( nombre);
      out.write("</h4>\n");
      out.write("                    <h4>Apellido paterno alumna : ");
      out.print( apPaterno);
      out.write("</h4>\n");
      out.write("                    <h4>Apellido materno alumna : ");
      out.print( apMaterno);
      out.write("</h4>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"editaralumno.html\"><h4>Editar otro alumno</h4></a>\n");
      out.write("                    <hr>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("    ");

    }else{//inicia else    
    
      out.write(" \n");
      out.write("    <hr>\n");
      out.write("    <h4>Error no realizo actualuzacion de rigistro alumna!</h4>\n");
      out.write("    <h4>Ningun registro actualizado</h4>\n");
      out.write("    <a href=\"editaralumno.html\"><h4>Regresar a formulario anterior</h4></a>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

    }//termina else    
    
      out.write("\n");
      out.write("    <h4>Fecha y hora del sistema: ");
      out.print( new java.util.Date());
      out.write("</h4>    \n");
      out.write("         <!-- js Plugins -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/municipios.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/select_estados.js\"></script>\n");
      out.write("        <!-- /js Plugins --> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
