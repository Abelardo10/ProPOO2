<%-- 
    Document   : TablaHabitacion
    Created on : 8/12/2017, 05:58:03 PM
    Author     : ACER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Models.Habitacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla Habitación</title>
         <%@include file="header.html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    </head>
    <body>
        <%@include file="navar.html" %>
        
<%
    Habitacion h=new Habitacion();
     ArrayList<Habitacion> lista=h.getHabitaciones();
    
     
     pageContext.setAttribute("lista", lista);
%>
        <form id="formActulizaTrabajador" action="ActualizarHabitacion.jsp" method="POST">
        <div class="container">
            <div class="row" style="margin: 1em;">
                <h1>Atualizar Habitación</h1>                    
            </div>            
            
            
            <div class="row" style="margin: 1em;">
                <table class="table table-responsive table-hover table-bordered">
                    <thead>
                        <tr>
                            <th>Número de Habitación</th>
                            <th>Piso de la Habitación</th>
                            <th>Estado</th>
                            <th>HabitacionId</th>                                                       
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="lista" items="${lista}">
                      
                        <tr>
                            <td> <input type="text" name="txtNumero" value="${lista.getNumero()}" class="form-control"  readonly/></td>
                            <td> <input type="text" name="txtPiso" value="${lista.getPiso()}" required="" class="form-control" readonly /> </td>
                            <td> <input type="text" name="txtEstado" value="${lista.getEstado()}" required="" class="form-control" readonly /></td>
                           
                            <td>
                                <button type="submit" value="${lista.getHabitacionId()}" name="btnSubmit" class="btn btn-warning">Actualizar</button>
                                
                            </td>
                        </tr>
                         </c:forEach> 
                    </tbody>
                </table>

                
                
            </div>            
   
                
                    
        </div>
       </form>
        <script>
            $(document).ready(function(){
                
               try {
                var respuesta='${result}';
                
                if(respuesta==""){}
                else{alert(respuesta);}
                
                
                } catch (e) {

                }               
            });
            
        </script>
  
    </body>
     <%@include file="header.html" %>
     
   
</html>
