<%-- 
    Document   : TablaTrabajador
    Created on : 6/12/2017, 09:57:18 PM
    Author     : ACER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Models.Trabajadores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla Trabajadores</title>
         <%@include file="header.html" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    </head>
    <body>
        <%@include file="navar.html" %>
        
<%
    Trabajadores trabajadores=new Trabajadores();
     ArrayList<Trabajadores> lista=trabajadores.getTrabajadores();
    
     
     pageContext.setAttribute("lista", lista);
%>
        <form id="formActulizaTrabajador" action="ActualizarTrabajador.jsp" method="POST">
        <div class="container">
            <div class="row" style="margin: 1em;">
                <h1>Atualizar Trabajador</h1>                    
            </div>            
            
            
            <div class="row" style="margin: 1em;">
                <table class="table table-responsive table-hover table-bordered">
                    <thead>
                        <tr>
                            <th>Identificación</th>
                            <th>Nombres</th>
                            <th>Apellidos</th>
                            <th>TrabajadorId</th>                                                       
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="lista" items="${lista}">
                      
                        <tr>
                            <td> <input type="text" name="txtNumDocumento" value="${lista.getNum_documento()}" class="form-control"  readonly/></td>
                            <td> <input type="text" name="txtNombres" value="${lista.getNombres()}" required="" class="form-control" readonly /> </td>
                            <td> <input type="text" name="txtApellidos" value="${lista.getApellidos()}" required="" class="form-control" readonly /></td>
                           
                            <td>
                                <button type="submit" value="${lista.getTrabajadoresId()}" name="btnSubmit" class="btn btn-warning">Actualizar</button>
                                
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

