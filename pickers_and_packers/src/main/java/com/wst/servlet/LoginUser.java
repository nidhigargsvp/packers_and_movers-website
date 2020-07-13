package com.wst.servlet;

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
public class LoginUser extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("uname");
        String email=request.getParameter("email");
        String pass=request.getParameter("upass");
        String utype=request.getParameter("utype");
        //String status=request.getParameter("ustatus");
        SafexLoginDetails obj=new SafexLoginDetails();
        obj.setName(name);
        obj.setEmail(email);
        obj.setPassword(pass);
        obj.setUser_type(utype);
        obj.setStatus("Active");
        SafexLoginDetailsImpl daoObj=new SafexLoginDetailsImpl(); 
        
        int r=daoObj.registerUser(obj);
        PrintWriter out = response.getWriter();
        response.sendRedirect("./index.jsp?sucess=messageSent");
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Record Inserted "+r);
            //out.println("Record Inserted "+r+"<h1>"+obj+"</h1>");
            //out.println("<h1>Servlet LoginUser at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   
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
