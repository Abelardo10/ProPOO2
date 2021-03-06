package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Models.Clientes;

public final class TablaClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/navar.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("         ");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\" ></script>");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Productos <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"RegistrarProducto.jsp\">Registrar</a></li>\n");
      out.write("            <li><a href=\"TablaProducto.jsp\">Actualizar</a></li>       \n");
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
      out.write('\n');

    Clientes cliente=new Clientes();
     ArrayList<Clientes> lista=cliente.getClientes();
    
     
     pageContext.setAttribute("lista", lista);

      out.write("\n");
      out.write("        <form id=\"formActulizaCliente\" action=\"ActualizaCliente.jsp\" method=\"POST\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" style=\"margin: 1em;\">\n");
      out.write("                <h1>Atualizar Cliente</h1>                    \n");
      out.write("            </div>            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\"margin: 1em;\">\n");
      out.write("                <table class=\"table table-responsive table-hover table-bordered\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Identificacion</th>\n");
      out.write("                            <th>Nombres</th>\n");
      out.write("                            <th>Apellidos</th>\n");
      out.write("                            <th>Tipo_Documento</th>\n");
      out.write("                            <th>Direccion</th>\n");
      out.write("                            <th>Telefono</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>ClienteId</th>                                                       \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>            \n");
      out.write("   \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("        </div>\n");
      out.write("       </form>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                \n");
      out.write("               try {\n");
      out.write("                var respuesta='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("                \n");
      out.write("                if(respuesta==\"\"){}\n");
      out.write("                else{alert(respuesta);}\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                } catch (e) {\n");
      out.write("\n");
      out.write("                }               \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("     ");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\" ></script>");
      out.write("\n");
      out.write("     \n");
      out.write("   \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("lista");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      \n");
          out.write("                        <tr>\n");
          out.write("                            <td> <input type=\"text\" name=\"txtIdentificacion\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.getNum_documento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\"  readonly/></td>\n");
          out.write("                            <td> <input type=\"text\" name=\"txtNombres\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required=\"\" class=\"form-control\" readonly /> </td>\n");
          out.write("                            <td> <input type=\"text\" name=\"txtApellidos\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.getApellidos()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required=\"\" class=\"form-control\" readonly /></td>\n");
          out.write("                            <td> <select name=\"ddlTipoDocumento\" id=\"ddlTipoDocumento\" class=\"form-control\"  >\n");
          out.write("                                    <option>CC</option>\n");
          out.write("                                    <option>CE</option>\n");
          out.write("                                    <option>PASAPORTE</option>\n");
          out.write("                                </select>\n");
          out.write("                                \n");
          out.write("                            </td>                  \n");
          out.write("                            <td> <input type=\"text\" name=\"txtDireccion\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required=\"\" class=\"form-control\" readonly /> </td>\n");
          out.write("                            <td> <input type=\"text\" name=\"txtTelefono\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required=\"\" class=\"form-control\" readonly /> </td>\n");
          out.write("                            <td> <input type=\"text\" name=\"txtEmail\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" required=\"\" class=\"form-control\" readonly=\"\" /> </td>                          \n");
          out.write("                            <td>\n");
          out.write("                                <button type=\"submit\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista.getClienteId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"btnSubmit\" class=\"btn btn-warning\">Actualizar</button>\n");
          out.write("                                \n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
