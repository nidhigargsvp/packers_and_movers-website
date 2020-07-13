package com.wst.servlet;

import com.wst.bean.SafexQuickQuote;
import com.wst.dao.SafexQuickQuoteDAOImpl;
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
public class Alluserquickquote extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        SafexQuickQuoteDAOImpl daoObj=new SafexQuickQuoteDAOImpl();
        ArrayList<SafexQuickQuote>al=new ArrayList<SafexQuickQuote>();
        al=daoObj.getAllRecord();
        System.out.println(al);
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet alluserquickquote</title>");            
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
                SafexQuickQuote obj=new SafexQuickQuote();
                obj=al.get(i);
                out.println(" <tr>");
                out.println(" <td>"+obj.getQ_quote_id()+"</td>");
                out.println("<td>"+obj.getName()+"</td>");
                out.println("<td>"+obj.getEmail()+"</td>");
                out.println("<td> <a href='./udqq?q_quote_id="+obj.getQ_quote_id()+"'>View</a></td>");
                out.println("<td> <a href='./delqq?q_quote_id="+obj.getQ_quote_id()+"'>Delete</a></td>");
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
