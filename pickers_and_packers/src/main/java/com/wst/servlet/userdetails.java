package com.wst.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wst.bean.SafexLoginDetails;
import com.wst.dao.SafexLoginDetailsImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class userdetails extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String str=request.getParameter("user_id");
        int user_id=Integer.parseInt(str.trim());
        
        SafexLoginDetailsImpl daoObj=new SafexLoginDetailsImpl();
        SafexLoginDetails obj=new SafexLoginDetails();
        obj.setUser_id(user_id);
        obj=daoObj.getRecordById(user_id);
        System.out.println("Servlet"+obj);
        
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userdetails</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(" <table border=1px>");
            out.println(" <tr>");
            out.println("        <th>User ID </th>");
            out.println("        <th> Name </th>");
            out.println("        <th>Email </th>");
            out.println("        <th> Password </th>");
            out.println("        <th> Status </th>");
            
            out.println(" </tr>");
            
            
          
                out.println(" <tr>");
                out.println("<td>"+obj.getUser_id()+"</td>");
                out.println("<td>"+obj.getName()+"</td>");           
                out.println("<td>"+obj.getEmail()+"</td>");
                out.println("<td>"+obj.getPassword()+"</td>");
                out.println("<td>"+obj.getStatus()+"</td>");
                out.println("  </tr>    "); 
                out.println("   </table>");
                out.println("<h1>Servlet userdetails at " + request.getContextPath() + "</h1>");
                out.println("</body>");
                out.println("</html>");
        } finally {            
            out.close();
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
