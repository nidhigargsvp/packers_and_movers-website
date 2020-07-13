package com.wst.servlet;

import java.util.Arrays;
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
public class onlineQuotationListItem extends HttpServlet {

    
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        String[] qty=new String[100];
        qty=request.getParameterValues("ckbok[]");
        int i;
        String item="";
        String itemqty="";
        for(i=0;i<qty.length;i++)
        {
            itemqty=qty[i]+"-qty";
           item=item+" "+qty[i]+" - "+request.getParameter(itemqty);
           
           // out.println(item); 
        }
        RequestDispatcher rd1=request.getRequestDispatcher("./online-quotation.jsp?items="+item );
           rd1.include(request, response);
        //PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet onlineQuotationListItem</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Servlet onlineQuotationListItem at " + qty[i] + "</h1>");
            
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
