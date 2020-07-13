package com.wst.servlet;

import com.wst.bean.SafexLoginDetails;
import com.wst.dao.SafexLoginDetailsImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class allusers extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        SafexLoginDetailsImpl daoObj=new SafexLoginDetailsImpl();
        ArrayList <SafexLoginDetails> al=new ArrayList<SafexLoginDetails>();
        al=daoObj.getAllRecords();
        System.out.println(al);
        PrintWriter out=response.getWriter();
        try {
            
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet allusers</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>All Users Record</h1>");
            out.println(" <hr>");
            out.println(" <table border=1px>");
            out.println(" <tr>");
            out.println("        <th>User ID </th>");
            out.println("        <th>User Name </th>");
            out.println("        <th>User Email </th>");
        
            out.println("<th>Action</th>");
            out.println(" </tr>");
            for(int i=0;i<al.size();i++)
            {
                SafexLoginDetails obj=new SafexLoginDetails();
                obj=al.get(i);
                out.println(" <tr>");
                out.println(" <td>"+obj.getUser_id()+"</td>");
                out.println("<td>"+obj.getName()+"</td>");
                out.println("<td>"+obj.getPassword()+"</td>");
                out.println("<td> <a href='./ud?user_id="+obj.getUser_id()+"'>View</a></td>");
                out.println("<td> <a href='./dul?user_id="+obj.getUser_id()+"'>Delete</a></td>");
                out.println("  </tr>   ");   
            }  
                out.println("   </table>");
                out.println("</body>");
                out.println("</html>");
         }
            finally {            
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