package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import conexion.Conexion;

public final class registraralumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page Registro Alumna CerdaMonroy</title>\n");
      out.write("        \n");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Alumna registrada con exito!</h1>\n");
      out.write("       <hr> \n");
      out.write("       <!--Librerias Jsp para la conexion-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("       <!--Llamada a la conexion, variables y sql query--> \n");
      out.write("       ");

       Conexion conexion = new Conexion("jdbc:mysql://localhost/bcerdamonroyproyectojsp", "root", "");
       int matriculaAlu=Integer.parseInt(request.getParameter("matricula"));
       String nombreAlu=request.getParameter("nombre");
       String apPaternoAlu=request.getParameter("ap1");
       String apMaternoAlu=request.getParameter("ap2");
       
String sqlAlta="INSERT INTO talumnos VALUE ('"+matriculaAlu+"','"+nombreAlu+"','"+apPaternoAlu+"','"+apMaternoAlu+"')";
int c = conexion.ejecutaSentencia(sqlAlta);
if (c==1){
       
       
      out.write("\n");
      out.write("       \n");
      out.write("       <!--/Llamada a la conexion, variables y sql query--> \n");
      out.write("       <div class=\"container\">\n");
      out.write("           <div class=\"jumbotron\">\n");
      out.write("               <h2>Sistema de control de alumnos</h2>\n");
      out.write("               <hr>\n");
      out.write("               <div class=\"thumbnail\">\n");
      out.write("                   <center>\n");
      out.write("                       <h2>Se agrego de forma exitosa un nuevo alumno</h2>\n");
      out.write("                       <hr>\n");
      out.write("                       <h3>Matricula alumno: ");
      out.print( matriculaAlu);
      out.write("</h3>\n");
      out.write("                       <h3>Nombre alumno: ");
      out.print( nombreAlu);
      out.write("</h3>\n");
      out.write("                       <h3>Apellido Paterno alumno: ");
      out.print( apPaternoAlu);
      out.write("</h3>\n");
      out.write("                       <h3>Apellido Materno alumno: ");
      out.print( apMaternoAlu);
      out.write("</h3>\n");
      out.write("                   </center>\n");
      out.write("                   <hr>\n");
      out.write("                   <h3>Fecha y hora del sistema: ");
      out.print( new java.util.Date() );
      out.write("</h3>\n");
      out.write("                   <hr>\n");
      out.write("                   <a href=\"altaalumnos.html\"><h3><i>Registrar otro alumno</i></h3></a>\n");
      out.write("                   ");

                   }//termina if
                   
      out.write("\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("           <!-- js Plugins -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/slick.min.js\"></script>\n");
      out.write("    <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/municipios.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/select_estados.js\"></script>\n");
      out.write("    <!-- /js Plugins -->\n");
      out.write("        \n");
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
