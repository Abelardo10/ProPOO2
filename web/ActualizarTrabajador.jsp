<%-- 
    Document   : ActualizarTrabajador
    Created on : 6/12/2017, 02:36:02 PM
    Author     : ACER
--%>

<%@page import="Models.Trabajadores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="header.html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <title>Atualizar Trabajadores</title>
    </head>
    <body style="overflow-y: hidden;">
        
       

        <div>
            <%@include file="navar.html" %>  
        </div>
         <%
             Trabajadores t=new Trabajadores();
             int id=Integer.parseInt(request.getParameter("btnSubmit"));
             t=t.getTrabajadores(id);//submit que viene del formulario TablaClientes.jsp
       
              pageContext.setAttribute("t", t);
        %>
        <form id="formActualizarTrabajadores" method="POST" action="Trabajadores">

        <div class="contnt-header">
            <h1 style="text-align:center">
                Atualizar Trabajadores
            </h1>
        </div>

        <table Width="100%">
            <tr>
                <td Width="25%">
                   
                        <div class="content"> <!-- Inicio del panel de busquedad -->
                            <div class="row">
                                <div class="col-lg-12" style="margin-top: 1em;"> <!-- Primer panel-->
                                    <div class="box-body"><!--inivio de la clase box-body -->                                        
                                        <div class="row" style="margin-top: 2em;">            
                                            <div class="col-lg-5"> <input type="text" name="txtTrabajadoresId" value="${t.getTrabajadoresId()}" class="form-control"  readonly=""/></div>
                                        </div>

                                    </div>
                                    
                                </div>
                            </div>
                        </div> <!-- Fin del panel de busquedad -->
                  

                </td>
                <td Width="75%">
                    

                        <div class="content"> <!-- Inici del Primer panel -->
                            <div class="row">
                                <div class="col-lg-12" style="margin-top: 2em;"> <!-- Primer panel-->
                                    <div class="box box-primary">
                                        <div class="box-body"><!--inivio de la clase box-body -->
                                            <div class="col-lg-6">

                                                <div class="form-group">
                                                    <input type="text" name="txtNombres" required="Campo requerido" class="form-control" value="${t.getNombres()}" />
                                                </div>  

                                                <div class="form-group">
                                                    <input type="text" name="txtApellidos" required="Campo requerido" class="form-control" value="${t.getApellidos()}"/>
                                                </div> 

                                                <div>
                                                    <select name="ddlTipoDocumento" class="form-control">
                                                        <option>CC</option>
                                                        <option>CE</option>
                                                        <option>Pasaporte</option>
                                                    </select> 
                                                </div>                    

                                                <div class="form-group" style="margin-top: 1em;">
                                                    <input type="text" name="txtNumDocumento" required="Campo requerido" class="form-control" value="${t.getNum_documento()}" />
                                                </div>  

                                                <div class="form-group">
                                                    <input type="text" name="txtDireccion" required="Campo requerido" class="form-control" value="${t.getDireccion()}" />
                                                </div> 

                                                <div class="form-group">
                                                    <input type="number" name="txtTelefono" required="Campo requerido" class="form-control" value="${t.getTelefono()}" />
                                                </div> 
                                                 <div class="form-group">
                            <input type="submit" value="Actualizar" name="btnSubmit"  class="btn btn-primary" Width="50%"/>
                        </div>

                                            </div>
                                            <div class="content"> <!-- Inici del segundo panel -->

                                                <div class="box-body"><!--inivio de la clase box-body -->
                                                    <div class="col-lg-6">
                                                        <div class="form-group">
                                                            <input type="email" name="txtEmail" required="Campo requerido" class="form-control" value="${t.getEmail()}" />
                                                        </div>                              

                                                        <div class="form-group">
                                                            <input type="number" name="txtSueldo" required="Campo requerido" class="form-control" value="${t.getSueldo()}" />
                                                        </div>  

                                                        <div class="form-group">
                                                            <input type="text" name="txtRol" required="Campo requerido" class="form-control" value="${t.getRol()}" />
                                                        </div> 

                                                        <div class="form-group">
                                                            <input type="text" name="txtLogin" required="Campo requerido" class="form-control" value="${t.getLogin()}" />
                                                        </div> 
                                                        <div class="form-group">
                                                            <input type="password" name="txtPassword" required="Campo requerido" class="form-control" value="${t.getPassword()}" />
                                                        </div> 

                                                    </div>
                                                </div> <!--fin de la clase box-body -->

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div> <!--fin de la clase box-body -->
                        </div>
                        
                        <script>
                            $(document).ready(function () {

                                try {
                                    var respuesta = '${mensaje}';
                                    if (respuesta == "") {
                                    } else {
                                        alert(respuesta);
                                    }
                                } catch (e) {

                                }
                            });

                        </script>
                        
                    </form>
                </td>
            </tr>
        </table>





    </body>
    <%@include file="header.html" %>
</html>
