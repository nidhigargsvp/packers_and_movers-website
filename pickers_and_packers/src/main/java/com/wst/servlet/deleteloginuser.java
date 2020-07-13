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
public class deleteloginuser extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String str=request.getParameter("user_id");
        int id=Integer.parseInt(str);
         SafexLoginDetailsImpl daoObj=new SafexLoginDetailsImpl();
         SafexLoginDetails obj=new SafexLoginDetails();
         obj.setUser_id(id);
         int user=daoObj.deleteRecordById(id);
         if(user>0)
         {
        response.sendRedirect("./allusers");
         }
         
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet deleteloginuser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet deleteloginuser at " + request.getContextPath() + "</h1>");
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
