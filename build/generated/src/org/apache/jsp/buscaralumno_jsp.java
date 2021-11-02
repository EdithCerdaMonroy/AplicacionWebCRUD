package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import conexion.Conexion;

public final class buscaralumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page BuscarEditar  Alumno CerdaMonroy</title>\r\n");
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
                      //manejo de sesiones para identificar el registro que se busca
               String numero = request.getParameter("matricula");
               int numeroCuenta = Integer.parseInt(numero);
               session.setAttribute("num", numero);
               //cursor consultar o recorrer una tabla  e identificar un campo distintivo
            String consultaBusqueda="SELECT * from talumnos where matricula = '"+numeroCuenta+"'";
                    ResultSet rs = conexion.ejecutaSelect(consultaBusqueda);
                           if(rs.next()){//inicia if


        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("           <div class=\"jumbotron\">\r\n");
      out.write("               <center><h2>Sistema de Control Buscar Alumna CerdaMonroy</h2></center>\r\n");
      out.write("               <hr>\r\n");
      out.write("               <div class=\"thumbnail\">\r\n");
      out.write("                   <center>\r\n");
      out.write("                       <h1>Formulario para modificar Registros alumnos</h1>\r\n");
      out.write("                       <h3><i>(Cambia la informacion en los campos de texto)</i></h3>\r\n");
      out.write("                       <hr>\r\n");
      out.write("                       <form method=\"post\" action=\"actualizar22.jsp\">\r\n");
      out.write("                           <div class=\"form-group\">    \r\n");
      out.write("                       <h3>Nombre: </h3>\r\n");
      out.write("                       <input type=\"text\" name=\"nombre\" class=\"form-control\" value=\"");
      out.print( rs.getString(2) );
      out.write("\"/>\r\n");
      out.write("                        <h3>Apellido paterno: </h3>\r\n");
      out.write("                       <input type=\"text\" name=\"ap1\" class=\"form-control\" value=\"");
      out.print( rs.getString(3) );
      out.write("\"/>\r\n");
      out.write("                        <h3>Apellido materno: </h3>\r\n");
      out.write("                       <input type=\"text\" name=\"ap2\" class=\"form-control\" value=\"");
      out.print( rs.getString(4) );
      out.write("\"/>   \r\n");
      out.write("                              <br>\r\n");
      out.write("                       <input type=\"submit\" class=\"btn btn-info btn-block\" value=\"Modificar datos\"/>\r\n");
      out.write("                           </div>\r\n");
      out.write("                       </form>\r\n");
      out.write("                       <hr>\r\n");
      out.write("                      \r\n");
      out.write("                       ");

                           }else{//inicia else
                       
      out.write("\r\n");
      out.write("                       <h1>Error alumno no encontrado</h1>\r\n");
      out.write("                       <hr>\r\n");
      out.write("                       <h3>Fecha y hora del sistema: ");
      out.print( new java.util.Date());
      out.write(" </h3>\r\n");
      out.write("                       <a href=\"editaralumno.html\"><h4>Regresar a Menu Principal</h4></a>\r\n");
      out.write("                       ");

                           }//termina else
                       
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                   </center>  \r\n");
      out.write("                      \r\n");
      out.write("               </div>\r\n");
      out.write("                        <h3>Fecha y hora del sistema: ");
      out.print( new java.util.Date());
      out.write(" </h3>\r\n");
      out.write("           </div>\r\n");
      out.write("       </div>\r\n");
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
