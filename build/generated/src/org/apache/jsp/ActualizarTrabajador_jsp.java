package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.Trabajadores;

public final class ActualizarTrabajador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/navar.html");
  }

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
      			null, true, 8192, true);
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\" ></script>");
      out.write("\n");
      out.write("        \n");
      out.write("        <title>Atualizar Trabajadores</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"overflow-y: hidden;\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");
      out.write("\n");
      out.write("  <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Hotel Summer</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Clientes <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"RegistrarCliente.jsp\">Registrar</a></li>\n");
      out.write("            <li><a href=\"TablaClientes.jsp\">Actualizar</a></li>       \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("       <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Trabajadores <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"RegistrarTrabajadores.jsp\">Registrar</a></li>\n");
      out.write("            <li><a href=\"TablaTrabajador.jsp\">Actualizar</a></li>       \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      <li><a href=\"#\">Registro Reservas</a></li>\n");
      out.write("      <li><a href=\"#\">Pedidos</a></li>\n");
      out.write("      <li><a href=\"#\">Reportes</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav> \n");
      out.write("\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         ");

             Trabajadores t=new Trabajadores();
             int id=Integer.parseInt(request.getParameter("btnSubmit"));
             t=t.getTrabajadores(id);//submit que viene del formulario TablaClientes.jsp
       
              pageContext.setAttribute("t", t);
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"contnt-header\">\n");
      out.write("            <h1 style=\"text-align:center\">\n");
      out.write("                Atualizar Trabajadores\n");
      out.write("            </h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <table Width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td Width=\"25%\">\n");
      out.write("                   \n");
      out.write("                        <div class=\"content\"> <!-- Inicio del panel de busquedad -->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-12\" style=\"margin-top: 1em;\"> <!-- Primer panel-->\n");
      out.write("                                    <div class=\"box-body\"><!--inivio de la clase box-body -->                                        \n");
      out.write("                                        <div class=\"row\" style=\"margin-top: 2em;\">            \n");
      out.write("                                            <div class=\"col-lg-5\"> <input type=\"text\" name=\"txtTrabajadoresId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getTrabajadoresId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"  readonly=\"\"/></div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> <!-- Fin del panel de busquedad -->\n");
      out.write("                  \n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td Width=\"75%\">\n");
      out.write("                    <form id=\"formActualizarTrabajadores\" method=\"POST\" action=\"Trabajadores\">\n");
      out.write("\n");
      out.write("                        <div class=\"content\"> <!-- Inici del Primer panel -->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-12\" style=\"margin-top: 2em;\"> <!-- Primer panel-->\n");
      out.write("                                    <div class=\"box box-primary\">\n");
      out.write("                                        <div class=\"box-body\"><!--inivio de la clase box-body -->\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"text\" name=\"txtNombres\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                </div>  \n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"text\" name=\"txtApellidos\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getApellidos()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                </div> \n");
      out.write("\n");
      out.write("                                                <div>\n");
      out.write("                                                    <select name=\"ddlTipoDocumento\" class=\"form-control\">\n");
      out.write("                                                        <option>CC</option>\n");
      out.write("                                                        <option>CE</option>\n");
      out.write("                                                        <option>Pasaporte</option>\n");
      out.write("                                                    </select> \n");
      out.write("                                                </div>                    \n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\" style=\"margin-top: 1em;\">\n");
      out.write("                                                    <input type=\"text\" name=\"txtNumDocumento\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getNum_documento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                </div>  \n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"text\" name=\"txtDireccion\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                </div> \n");
      out.write("\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"number\" name=\"txtTelefono\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                </div> \n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"content\"> <!-- Inici del segundo panel -->\n");
      out.write("\n");
      out.write("                                                <div class=\"box-body\"><!--inivio de la clase box-body -->\n");
      out.write("                                                    <div class=\"col-lg-6\">\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <input type=\"email\" name=\"txtEmail\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                        </div>                              \n");
      out.write("\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <input type=\"number\" name=\"txtSueldo\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getSueldo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                        </div>  \n");
      out.write("\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <input type=\"text\" name=\"txtRol\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getRol()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                        </div> \n");
      out.write("\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <input type=\"text\" name=\"txtLogin\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getLogin()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                        </div> \n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <input type=\"password\" name=\"txtPassword\" required=\"Campo requerido\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getPassword()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                                        </div> \n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div> <!--fin de la clase box-body -->\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div> <!--fin de la clase box-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <script>\n");
      out.write("                            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                                try {\n");
      out.write("                                    var respuesta = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("                                    if (respuesta == \"\") {\n");
      out.write("                                    } else {\n");
      out.write("                                        alert(respuesta);\n");
      out.write("                                    }\n");
      out.write("                                } catch (e) {\n");
      out.write("\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                        </script>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"submit\" value=\"Actualizar\" name=\"btnSubmit\"  class=\"btn btn-primary\" Width=\"50%\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\" ></script>");
      out.write("\n");
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
