package com.wst.servlet;

import com.wst.bean.SafexOnlineQuote;
import com.wst.dao.SafexOnlineQuoteDAOImpl;
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
public class allusersonlinequote extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        SafexOnlineQuoteDAOImpl daoObj=new SafexOnlineQuoteDAOImpl();
        ArrayList <SafexOnlineQuote> al=new ArrayList<SafexOnlineQuote>();
        al=daoObj.getAllRecords();
        System.out.println(al);
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet allusersonlinequote</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>All Users Record</h1>");
            out.println(" <hr>");
            out.println(" <table border=1px>");
            out.println(" <tr>");
            out.println("        <th>q_quote_id </th>");
            out.println("        <th>User Name </th>");
            out.println("        <th>User Email </th>");
             out.println("        <th>User Phone </th>");
            out.println("<th>Action</th>");
            out.println(" </tr>");
            for(int i=0;i<al.size();i++)
            {
                SafexOnlineQuote obj=new SafexOnlineQuote();
                obj=al.get(i);
                
                out.println(" <tr>");
                out.println(" <td>"+obj.getQ_quote_id()+"</td>");
                out.println(" <td>"+obj.getName()+"</td>");
                out.println(" <td>"+obj.getEmail()+"</td>");
                out.println(" <td>"+obj.getPhone()+"</td>");
                out.println("<td> <a href='./udquote?q_quote_id="+obj.getQ_quote_id()+"'>View</a></td>");
                out.println("<td> <a href='./delonline?q_quote_id="+obj.getQ_quote_id()+"'>Delete</a></td>");
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
