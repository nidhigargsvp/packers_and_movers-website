package com.wst.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wst.bean.SafexOnlineQuote;
import com.wst.dao.SafexOnlineQuoteDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class userdetailquote extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String str=request.getParameter("q_quote_id");
        int id=Integer.parseInt(str.trim());
        
        SafexOnlineQuoteDAOImpl daoObj=new SafexOnlineQuoteDAOImpl();
        SafexOnlineQuote obj=new SafexOnlineQuote();
        obj.setQ_quote_id(id);
        obj=daoObj.getRecordById(id);
        System.out.println("Servlet"+obj);
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userdetailquote</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(" <table border=1px>");
            out.println(" <tr>");
            out.println("        <th>q_quote_ID </th>");
            out.println("        <th>Name </th>");
            out.println("        <th>Email </th>");
            out.println("        <th>Phone </th>");           
            out.println(" </tr>");
            out.println(" <tr>");
            out.println("<td>"+obj.getQ_quote_id()+"</td>");
            out.println("<td>"+obj.getName()+"</td>");           
            out.println("<td>"+obj.getEmail()+"</td>");
            out.println("<td>"+obj.getPhone()+"</td>");
            out.println("  </tr>    "); 
            out.println("   </table>");
            out.println("<h1>Servlet userdetailquote at " + request.getContextPath() + "</h1>");
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
