<%-- 
    Document   : ActualizarHabitacion
    Created on : 8/12/2017, 06:36:04 PM
    Author     : ACER
--%>

<%@page import="Models.Habitacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Habitaciones</title>
        <%@include file="header.html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    </head>          
    <body style="overflow-y: hidden;"> 
        <div>
            <%@include file="navar.html" %>  
        </div>
        <%
            Habitacion habitacion = new Habitacion();
            int id = Integer.parseInt(request.getParameter("btnSubmit"));
            habitacion = habitacion.getHabitacion(id);//submit que viene del formulario TablaHabitacion.jsp

            pageContext.setAttribute("habitacion", habitacion);
        %>
        <form id="formHabitacion" method="POST" action="Habitacion">      

            <div class="container" style="width: 50%">

                <div class="panel panel-primary">
                    <div class="panel-heading">Actualización de Habitaciones</div>
                    <div class="panel-body" style="height:400px; overflow-y: scroll; ">
                        <div class="row">
                            <div class="col">
                                <div class="col-lg-12" style="margin-top: 0em;"> <!-- Primer panel-->
                                     
                                    <div>            
                                        <div class="col-lg-2"> <input type="text" name="txtHabitacionId" value="${habitacion.getHabitacionId()}" class="form-control"  readonly=""/></div>
                                    Id de la Habitación:
                                    </div>
                                </div>
                            </div>

                            <div class="col-lg-12" style="margin-top: 1em;"> <!-- Primer panel-->

                                <div class="col-lg-12">
                                    <div class="form-group">
                                        Número:
                                        <input type="number" name="txtNumero" required="Campo requerido" class="form-control" value="${habitacion.getNumero()}" />
                                    </div>  

                                    <div class="form-group">
                                        Piso:
                                        <input type="number" name="txtPiso" required="Campo requerido" class="form-control" value="${habitacion.getPiso()}" />
                                    </div> 

                                    <div class="form-group">
                                        Caracteristicas:
                                        <textarea type="text" name="txtCaracteristicas" required="Campo requerido" class="form-control" value="${habitacion.getCaracteristicas()}" >
                                            
                                        </textarea>
                                    </div>                    

                                    <div class="form-group">
                                        Precio Diario:
                                        <input type="text" name="txtPrecioDiario" required="Campo requerido" class="form-control" value="${habitacion.getPrecio_diario()}" />
                                    </div>   
                                    <div class="form-group">
                                            Estado:
                                            <select name="ddlEstado" class="form-control">
                                                <option>Disponible</option>
                                                <option>Ocupada</option>
                                                <option>Limpieza</option>
                                            </select> 
                                        </div>   
                                     <div class="form-group">
                                            Tipo:
                                            <select name="ddlTipoHabitacion" class="form-control">
                                                <option>Sencilla</option>
                                                <option>Doble</option>
                                                <option>Triple</option>
                                            </select> 
                                        </div>


                                    <div class="form-group">
                                        <input type="submit" value="Actualizar" name="btnSubmit"  class="btn btn-primary" Width="100%"/>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>

            </div>

        </form>
    </body>

    <%@include file="header.html" %>


</html>
