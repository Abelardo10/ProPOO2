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
        <title>JSP Page</title>
          <%@include file="header.html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    </head>          
       <body style="overflow-y: hidden;">  
           <form id="formHabitacion" method="POST" action="Habitacion">
        
        <%
             Habitacion habitacion=new Habitacion();
             int id=Integer.parseInt(request.getParameter("btnSubmit"));
             habitacion=habitacion.getHabitacion(id);//submit que viene del formulario TablaHabitacion.jsp
       
              pageContext.setAttribute("habitacion", habitacion);
        %>
    
       <body style="overflow-y: hidden;">
        <form id="formHabitacion" method="POST" action="Habitacion">
            <div>
                <%@include file="navar.html" %>  
            </div>

           
            <div class="container" style="width: 50%">
                
            <div class="panel panel-primary">
            <div class="panel-heading">Actualización de Habitaciones</div>
            <div class="panel-body" style="height:400px; overflow-y: scroll; ">
                <div class="row">
                    
                    <div class="col-lg-12" style="margin-top: 1em;"> <!-- Primer panel-->
                        <div class="box box-primary">
                            <div class="box-body"><!--inivio de la clase box-body -->
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <input type="number" name="txtNumero" required="Campo requerido" class="form-control" value="${habitacion.getNumero()}" />
                                    </div>  
                               
                                    <div class="form-group">
                                        <input type="number" name="txtPiso" required="Campo requerido" class="form-control" value="${habitacion.getPiso()}" />
                                    </div> 
                                   
                                    <div class="form-group">
                                        <textarea type="text" name="txtCaracteristicas" required="Campo requerido" class="form-control" value="${habitacion.getCaracteristicas()}" >
                                            
                                        </textarea>
                                    </div>                    
                               
                                    <div class="form-group">
                                        <input type="text" name="txtPrecioDiario" required="Campo requerido" class="form-control" value="${habitacion.getPrecio_diario()}" />
                                    </div>   
                                    <div class="form-group">
                                        <input type="text" name="txtEstado" required="Campo requerido" class="form-control" value="${habitacion.getEstado()}" />
                                    </div> 
                                    <div class="form-group">
                                        <input type="text" name="txtTipoHabitacion" required="Campo requerido" class="form-control" value="${habitacion.getTipo_habitacion()}" />
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
        
    </form>
</body>

    <%@include file="header.html" %>
    
    
</html>
