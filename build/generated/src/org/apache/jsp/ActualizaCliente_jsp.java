package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.Clientes;

public final class ActualizaCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("          ");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\" ></script>");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>          \n");
      out.write("       <body style=\"overflow-y: hidden;\">  \n");
      out.write("           <form id=\"formCliente\" method=\"POST\" action=\"Clientes\">\n");
      out.write("        <div>\n");
      out.write("        ");
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
      out.write("            <li><a href=\"ActualizarCliente.jsp\">Actualizar</a></li>       \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("       <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Trabajadores <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"RegistrarTrabajadores.jsp\">Registrar</a></li>\n");
      out.write("            <li><a href=\"ActualizarTrabajadores.jsp\">Actualizar</a></li>       \n");
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
      out.write("        ");

             Clientes cliente=new Clientes();
             int id=Integer.parseInt(request.getParameter("btnSubmit"));
             cliente=cliente.getClientes(id);//submit que viene del formulario TablaClientes.jsp
       
              pageContext.setAttribute("cliente", cliente);
        
      out.write("\n");
      out.write("    \n");
      out.write("        <div class=\"container\" style=\"margin-top: 3em; height:500px; overflow-y: scroll\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">\n");
      out.write("                <div class=\"col-lg-12\"><h3>Nombres</h3></div>\n");
      out.write("                <div class=\"col-lg-5\"> <input type=\"text\" name=\"txtNombres\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required=\"\"/></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">\n");
      out.write("                <div class=\"col-lg-12\"><h3>Apellidos</h3></div>\n");
      out.write("                <div class=\"col-lg-5\"> <input type=\"text\" name=\"txtApellidos\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getApellidos()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required=\"\"/></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">\n");
      out.write("                <div class=\"col-lg-12\"><h3>Tipo de Documento</h3></div>\n");
      out.write("                <div class=\"col-lg-5\"> <select name=\"ddlTipoDocumento\" class=\"form-control\">\n");
      out.write("                        <option>CC</option>\n");
      out.write("                        <option>CE</option>\n");
      out.write("                        <option>Pasaporte</option>\n");
      out.write("                    </select> </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">\n");
      out.write("                <div class=\"col-lg-12\"><h3>Numero de Documento</h3></div>\n");
      out.write("                <div class=\"col-lg-5\"> <input type=\"text\" name=\"txtNumDocumento\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getNum_documento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required=\"\"/></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">\n");
      out.write("                <div class=\"col-lg-12\"><h3>Direccion</h3></div>\n");
      out.write("                <div class=\"col-lg-5\"> <input type=\"text\" name=\"txtDireccion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required=\"\"/></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">\n");
      out.write("                <div class=\"col-lg-12\"><h3>Telefono</h3></div>\n");
      out.write("                <div class=\"col-lg-5\"> <input type=\"number\" name=\"txtTelefono\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" required=\"\"/></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">\n");
      out.write("                <div class=\"col-lg-12\"><h3>Email</h3></div>\n");
      out.write("                <div class=\"col-lg-5\"> <input type=\"email\" name=\"txtEmail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" /></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">            \n");
      out.write("                <div class=\"col-lg-5\"> <input type=\"text\" name=\"txtClienteId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getClienteId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"  readonly=\"\"/></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2em;\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <input type=\"submit\" value=\"Actualizar\" name=\"btnSubmit\"  class=\"btn btn-primary\"/>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>                \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("                                               \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\" ></script>");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
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
