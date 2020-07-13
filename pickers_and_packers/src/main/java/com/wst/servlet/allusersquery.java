package com.wst.servlet;

import com.wst.bean.SafexOnlineQuote;
import com.wst.bean.SafexQuery;
import com.wst.dao.SafexQueryDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * /auqueryy
 */
public class allusersquery extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        SafexQueryDAOImpl daoObj=new SafexQueryDAOImpl();
        ArrayList <SafexQuery> al=new ArrayList<SafexQuery>();
        al=daoObj.getAllRecords();
        System.out.println(al);
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet allusersquery</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>All Users Record</h1>");
            out.println(" <hr>");
            out.println(" <table border=1px>");
            out.println(" <tr>");
            out.println("        <th>query_id </th>");
            out.println("        <th>User Name </th>");
            out.println("        <th>User Email </th>");
             out.println("        <th>User Phone </th>");
            out.println("<th>Action</th>");
            out.println(" </tr>");
            for(int i=0;i<al.size();i++)
            {
                SafexQuery obj=new SafexQuery();
                obj=al.get(i);
                
                out.println(" <tr>");
                out.println(" <td>"+obj.getQuery_id()+"</td>");
                out.println(" <td>"+obj.getName()+"</td>");
                out.println(" <td>"+obj.getEmail()+"</td>");
                out.println(" <td>"+obj.getPhone()+"</td>");
                out.println("<td> <a href='./udquery?query_id="+obj.getQuery_id()+"'>View</a></td>");
                out.println("<td> <a href='./delquery?query_id="+obj.getQuery_id()+"'>Delete</a></td>");
                out.println("  </tr>   ");
            }
                out.println("   </table>");
           
            out.println("<h1>Servlet allusersquery at " + request.getContextPath() + "</h1>");
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
