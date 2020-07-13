package com.wst.servlet;

import com.wst.bean.SafexLoginDetails;
import com.wst.dao.SafexLoginDetailsImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class LoginUser2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SafexLoginDetails obj=new SafexLoginDetails();
        SafexLoginDetailsImpl daoObj=new SafexLoginDetailsImpl();
        obj.setEmail(request.getParameter("email"));
        obj.setPassword(request.getParameter("upass"));
        obj=daoObj.loginCheck(obj);
        System.out.println(obj);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            System.out.println("before rd");
            RequestDispatcher rd1=request.getRequestDispatcher("./LoginUser2.html");
            RequestDispatcher rd2=request.getRequestDispatcher("./welcome");
            System.out.println("after rd");
            if(obj.getUser_id()>0)
            {
                System.out.println("inside if");
                rd2.forward(request, response);
            }
            else
            {
                System.out.println("inside else");
                rd1.include(request, response);
            }
            out.println("</body>");
            out.println("</html>");
        } 
            finally {            
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
