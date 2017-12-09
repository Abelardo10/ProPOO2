<%-- 
    Document   : RegistrarHabitacion
    Created on : 7/12/2017, 08:48:43 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="header.html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <title>Registro de Habitación</title>
    </head>
    <body style="overflow-y: hidden;">
        <form id="formHabitacion" method="POST" action="Habitacion">
            <div>
                <%@include file="navar.html" %>  
            </div>

           
            <div class="container" style="width: 50%">
                
            <div class="panel panel-primary">
            <div class="panel-heading">Registro de Habitaciones</div>
            <div class="panel-body" style="height:400px; overflow-y: scroll; ">
                <div class="row">
                    
                    <div class="col-lg-12" style="margin-top: 1em;"> <!-- Primer panel-->
                        <div class="box box-primary">
                            <div class="box-body"><!--inivio de la clase box-body -->
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <input type="number" name="txtNumero" required="Campo requerido" class="form-control" placeholder="Número de Habitación" />
                                    </div>  
                               
                                    <div class="form-group">
                                        <input type="number" name="txtPiso" required="Campo requerido" class="form-control" placeholder="Piso de la Habitación" />
                                    </div> 
                                   
                                    <div class="form-group">
                                        <textarea type="text" name="txtCaracteristicas" required="Campo requerido" class="form-control" placeholder="Caracteristicas" >
                                            
                                        </textarea>
                                    </div>                    
                               
                                    <div class="form-group">
                                        <input type="text" name="txtPrecioDiario" required="Campo requerido" class="form-control" placeholder="Precio Diario" />
                                    </div>   
                                    <div class="form-group">
                                        <input type="text" name="txtEstado" required="Campo requerido" class="form-control" placeholder="Estado" />
                                    </div> 
                                    <div class="form-group">
                                        <input type="text" name="txtTipoHabitacion" required="Campo requerido" class="form-control" placeholder="Tipo de Habitación" />
                                    </div> 
                               

                                <div class="form-group">
                                <input type="submit" value="Registrar" name="btnSubmit"  class="btn btn-primary" Width="50%"/>
                                </div>
                         
                                    

                                </div>
                        </div> <!--fin de la clase box-body -->

                        </div>
                    </div>
                        
                 </div>
          </div>
           </div>
                   
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

