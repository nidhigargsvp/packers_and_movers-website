package com.wst.servlet;

import com.wst.bean.SafexOnlineQuote;
import com.wst.dao.SafexOnlineQuoteDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OnlineQuote extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("Name");
        String phone=request.getParameter("phone");
        String email=request.getParameter("Email");
        String movingfrom=request.getParameter("Sendfrom");
        String movingto=request.getParameter("Sendto");
        String movingdate=request.getParameter("MoveDate");
        String message=request.getParameter("SpecifyyourInquiry");;
        String companynm=request.getParameter("CompanyName");
        String isread="No";
        //String querytime=request.getParameter("querytime");
        
        String[] qty=new String[100];
        qty=request.getParameterValues("ckbok[]");
        int i;
        String item="";
        String itemqty="";
        for(i=0;i<qty.length;i++)
        {
            itemqty=qty[i]+"-qty";
           item=item+" <br>"+qty[i]+" - "+request.getParameter(itemqty);
           
           // out.println(item); 
        }
        
        
        
        
     
        SafexOnlineQuote obj1=new SafexOnlineQuote();
        obj1.setName(name);
        obj1.setPhone(phone);
        obj1.setEmail(email);
        obj1.setMoving_from(movingfrom);
        obj1.setMoving_to(movingto);
        obj1.setMoving_date(movingdate);
        obj1.setMessage(message);
        obj1.setCompany_name(companynm);
        obj1.setIs_read(isread);
        //obj1.setQuery_time(querytime);
        obj1.setItems_quantity(item);
        SafexOnlineQuoteDAOImpl daoObj1=new SafexOnlineQuoteDAOImpl();
        int r=daoObj1.registerUser(obj1);
        
         response.sendRedirect("./index.jsp?sucess=messageSent");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OnlineQuote</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Record Inserted: " +r);
            
            //out.println("<h2> welcome " +name);
            
            //out.println("<h1>Servlet OnlineQuote at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }
}

   