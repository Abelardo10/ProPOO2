<%-- 
    Document   : RegistrarTrabajadores
    Created on : 6/12/2017, 11:52:21 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="header.html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <title>Registro de Trabajadores</title>
    </head>
    <body style="overflow-y: hidden;">
        <form id="formTrabajadores" method="POST" action="Trabajadores">
            <div>
                <%@include file="navar.html" %>  
            </div>

            <div class="container" style="width: 80%">

                <div class="panel panel-primary">
                    <div class="panel-heading">Registro de Trabajadores</div>
                    <div class="panel-body" style="height:450px; overflow-y: scroll; ">
                        <div class="row">
                            <div class="col">
                                <div class="col-lg-6" style="margin-top: 2em;"> <!-- Primer panel-->                                
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <input type="text" name="txtNombres" required="Campo requerido" class="form-control" placeholder="Nombres" />
                                        </div>  

                                        <div class="form-group">
                                            <input type="text" name="txtApellidos" required="Campo requerido" class="form-control" placeholder="Apellidos" />
                                        </div> 

                                        <div>
                                            <select name="ddlTipoDocumento" class="form-control">
                                                <option>CC</option>
                                                <option>CE</option>
                                                <option>Pasaporte</option>
                                            </select> 
                                        </div>                    

                                        <div class="form-group" style="margin-top: 1em;">
                                            <input type="text" name="txtNumDocumento" required="Campo requerido" class="form-control" placeholder="Numero de Documento" />
                                        </div>  

                                        <div class="form-group">
                                            <input type="text" name="txtDireccion" required="Campo requerido" class="form-control" placeholder="Dirección" />
                                        </div> 

                                        <div class="form-group">
                                            <input type="number" name="txtTelefono" required="Campo requerido" class="form-control" placeholder="Teléfono" />
                                        </div> 


                                        <div class="form-group">
                                            <input type="submit" value="Registrar" name="btnSubmit"  class="btn btn-primary" Width="50%"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="col-lg-6" style="margin-top: 2em;"> <!-- Primer panel--> 
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <input type="email" name="txtEmail" required="Campo requerido" class="form-control" placeholder="Email" />
                                        </div>                              

                                        <div class="form-group">
                                            <input type="number" name="txtSueldo" required="Campo requerido" class="form-control" placeholder="Salario" />
                                        </div>  

                                        <div class="form-group">
                                            <input type="text" name="txtRol" required="Campo requerido" class="form-control" placeholder="Rol" />
                                        </div> 

                                        <div class="form-group">
                                            <input type="text" name="txtLogin" required="Campo requerido" class="form-control" placeholder="Nombre de Usuario" />
                                        </div> 
                                        <div class="form-group">
                                            <input type="password" name="txtPassword" required="Campo requerido" class="form-control" placeholder="Password" />
                                        </div> 
                                    </div>
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
    </body>
    <%@include file="header.html" %>
</html>
