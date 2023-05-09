/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servelet;

import entity.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.StudentService;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "StudentController", urlPatterns = {"/StudentController"})
public class StudentController extends HttpServlet {

    @EJB
    private StudentService studentDAO;
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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            // Display student list
            List<Student> students = studentDAO.getAll();
            request.setAttribute("students", students);
            request.getRequestDispatcher("student-list.jsp").forward(request, response);
        } else if (action.equals("add")) {
            // Display add student form
            request.getRequestDispatcher("student-add.jsp").forward(request, response);
        } else if (action.equals("edit")) {
            // Display edit student form
            int id = Integer.parseInt(request.getParameter("id"));
            Student student = studentDAO.getById(id);
            request.setAttribute("student", student);
            request.getRequestDispatcher("student-edit.jsp").forward(request, response);
        } else if (action.equals("delete")) {
            // Display delete student confirmation page
            int id = Integer.parseInt(request.getParameter("id"));
            Student student = studentDAO.getById(id);
            request.setAttribute("student", student);
            request.getRequestDispatcher("student-delete.jsp").forward(request, response);
        }

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
        String action = request.getParameter("action");
        if (action.equals("add")) {
            // Add new student
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Student student = new Student(id, name);
            studentDAO.create(student);
            response.sendRedirect("student");
        } else if (action.equals("update")) {
            // Update student
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            Student student = studentDAO.getById(id);
            student.setName(name);
            studentDAO.update(student);
            response.sendRedirect("student");
        } else if (action.equals("delete")) {
            // Delete student
            int id = Integer.parseInt(request.getParameter("id"));
//            Student student = studentDAO.getById(id);
            studentDAO.delete(id);
            response.sendRedirect("student");
        }

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
