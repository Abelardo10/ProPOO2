/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Habitacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ACER
 */
@WebServlet(name = "Habitacion", urlPatterns = {"/Habitacion"})
public class HabitacionController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String operacion = request.getParameter("btnSubmit");

        switch (operacion) {
            case "Registrar":
                
                Habitacion habitacion = new Habitacion();

                habitacion.setNumero(request.getParameter("txtNumero"));
                habitacion.setPiso(request.getParameter("txtPiso"));
                habitacion.setCaracteristicas(request.getParameter("txtCaracteristicas"));
                habitacion.setPrecio_diario(request.getParameter("txtPrecioDiario"));
                habitacion.setEstado(request.getParameter("txtEstado"));
                habitacion.setTipo_habitacion(request.getParameter("txtTipoHabitacion"));                

                String result = habitacion.insertar(habitacion);

                // para crear variables que se envian por el response
                request.setAttribute("mensaje", result);
                //para redicionar y enviar las variables
                request.getRequestDispatcher("RegistrarHabitacion.jsp").forward(request, response);

                break;

            case "Actualizar":
                
                habitacion = new Habitacion();

                habitacion.setNumero(request.getParameter("txtNumero"));
                habitacion.setPiso(request.getParameter("txtPiso"));
                habitacion.setCaracteristicas(request.getParameter("txtCaracteristicas"));
                habitacion.setPrecio_diario(request.getParameter("txtPrecioDiario"));
                habitacion.setEstado(request.getParameter("txtEstado"));
                habitacion.setTipo_habitacion(request.getParameter("txtTipoHabitacion"));
                              

                result = habitacion.actualizar(habitacion.getHabitacionId(), habitacion);

                // para crear variables que se envian por el response
                request.setAttribute("result", result);
                //para redicionar y enviar las variables
                request.getRequestDispatcher("TablaHabitacion.jsp").forward(request, response);
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
