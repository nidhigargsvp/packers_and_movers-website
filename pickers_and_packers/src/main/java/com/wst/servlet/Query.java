package com.wst.servlet;


import com.wst.bean.SafexQuery;
import com.wst.dao.SafexQueryDAOImpl;
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
public class Query extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("sxhname");
        String email=request.getParameter("sxhemail");
        String phone=request.getParameter("sxhphone");
        String subject=request.getParameter("sxhsubject");
        String query=request.getParameter("sxhmessage");
        String isread="No";
        SafexQuery obj= new SafexQuery();
        obj.setName(name);
        obj.setEmail(email);
        obj.setPhone(phone);
        obj.setSubject(subject);
        obj.setIs_read(isread);
        obj.setQuery(query);
        SafexQueryDAOImpl daoObj=new SafexQueryDAOImpl();
        int r=daoObj.registerUser(obj);
        PrintWriter out = response.getWriter();
        response.sendRedirect("./index.jsp?sucess=messageSent");
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Query</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(" Record Inserted "+r);
            //out.println("<h1>Servlet Query at " + request.getContextPath() + "</h1>");
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
