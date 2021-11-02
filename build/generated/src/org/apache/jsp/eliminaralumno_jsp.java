package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import conexion.Conexion;

public final class eliminaralumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page Baja Alumno CerdaMonroy</title>\r\n");
      out.write("\r\n");
      out.write("        <!-----------------------------BOOTSTRAP----------------------------->\r\n");
      out.write("        <!--Icono-->\r\n");
      out.write("        <link rel=\"Icon\" type=\"img/png\" href=\"img/logoicono.png\">\r\n");
      out.write("        <!-- Google font -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("        <!-- Slick -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\r\n");
      out.write("        <!-- nouislider -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\r\n");
      out.write("        <!-- Font Awesome Icon -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Custom stlylesheet -->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("        <!--Ventanas emergentes-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/ventanas.css\">\r\n");
      out.write("        <!-----------------------------/BOOTSTRAP----------------------------->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");

            Conexion conexion = new Conexion("jdbc:mysql://localhost/bdcerdamonroyproyectojsp", "root", "");
            int matriculaAlu = Integer.parseInt(request.getParameter("matricula"));
            //para borrar con variable objeto
            String bajaAlumno = "DELETE FROM talumno WHERE matricula = '" + matriculaAlu + "'";
            int confirmaBaja = conexion.ejecutaSentencia(bajaAlumno);
            if (confirmaBaja == 1) {

        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"jumbotron\">\r\n");
      out.write("                <h4>Sistema de control de alumnos</h4>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"alert alert-danger\">\r\n");
      out.write("                    <h2>Confirma baja</h2>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <h3>Numero cuenta ");
      out.print( matriculaAlu);
      out.write("</h3>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <h3>Fecha y hora del sistema : ");
      out.print( new java.util.Date());
      out.write("</h3>    \r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <a href=\"bajaalumno.html\"><h4>Eliminar otro registro alumno</h4></a>\r\n");
      out.write("                </div> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

            }else{
        
      out.write("\r\n");
      out.write("        <div class=\"alert alert-info\">\r\n");
      out.write("            <h1>Error alumno no eliminado</h1>\r\n");
      out.write("            <h3><i>El numero de cuenta o matricula alumno no Existe</i></h3>\r\n");
      out.write("            <h2>Verifica</h2>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <a href=\"bajaalumno.html\"><h4>Regresar o a formulario Baja Alumno</h4></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- js Plugins -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/municipios.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/select_estados.js\"></script>\r\n");
      out.write("        <!-- /js Plugins -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
