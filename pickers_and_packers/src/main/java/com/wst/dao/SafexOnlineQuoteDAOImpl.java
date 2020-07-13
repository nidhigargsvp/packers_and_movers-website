package com.wst.dao;

import com.wst.bean.SafexOnlineQuote;
import com.wst.connection.MyConnection1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class SafexOnlineQuoteDAOImpl implements SafexOnlineQuoteDAOI {
    public int registerUser(SafexOnlineQuote obj) {
        int result=0;
        Connection con=null;
        Statement stmt=null;
        String name=obj.getName();
        String phone=obj.getPhone();
        String email=obj.getEmail();
        String movingfrom=obj.getMoving_from();
        String movingto=obj.getMoving_to();
        String movingdate=obj.getMoving_date();
        String message=obj.getMessage();
        String companynm=obj.getCompany_name();
        String isread=obj.getIs_read();
        //String querytime=obj.getQuery_time();
        String itemqty=obj.getItems_quantity();
        con=MyConnection1.getMyConn();
        System.out.println(con);
        try{
           String insertQuery="INSERT INTO safexonlinequote(name,phone,email,moving_from,moving_to,moving_date,message,company_name,isread,items_quantity) VALUES('"+name+"','"+phone+"','"+email+"','"+movingfrom+"','"+movingto+"','"+movingdate+"','"+message+"','"+companynm+"','"+isread+"','"+itemqty+"')";
           stmt=con.createStatement();
           result=stmt.executeUpdate(insertQuery);
           System.out.println(insertQuery);
        }
        catch(Exception e)
        {
            System.out.println("Some error occured" +e);
    }
        finally{
            con=null;
            stmt=null;
        }
       return result;
    }
    public SafexOnlineQuote LoginCheck(SafexOnlineQuote obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<SafexOnlineQuote> getAllRecords() {
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        ArrayList<SafexOnlineQuote> al=new ArrayList<SafexOnlineQuote>();
        try{
            //Get Connection from MyConnection1 Class
            con=MyConnection1.getMyConn();
            System.out.println(con);
            String SelectQuery="SELECT * FROM safexonlinequote";
            stmt=con.createStatement();
            rs=stmt.executeQuery(SelectQuery);
            while(rs.next())
            {
               SafexOnlineQuote sd=new SafexOnlineQuote();
                sd.setQ_quote_id(rs.getInt("q_quote_id"));
                sd.setName(rs.getString("name"));
                sd.setPhone(rs.getString("phone"));
                sd.setEmail(rs.getString("email"));
                sd.setMoving_from(rs.getString("moving_from"));
                sd.setMoving_to(rs.getString("moving_to"));
                sd.setMoving_date(rs.getString("moving_date"));
                sd.setMessage(rs.getString("message"));
                sd.setCompany_name(rs.getString("company_name"));
                sd.setIs_read(rs.getString("isread"));
                sd.setItems_quantity(rs.getString("items_quantity"));
                al.add(sd);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some error occured"+e);
        }
        finally{
        con=null;
        stmt=null;
        }
        return al;
    }

    

   // @Override
    public SafexOnlineQuote getRecordById(int id) {
        SafexOnlineQuote obj=new SafexOnlineQuote();
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        try{
            // Get connection from my MyConnection1 class
            con=MyConnection1.getMyConn();
            stmt=con.createStatement();
            String selectQuery="SELECT * FROM safexonlinequote WHERE q_quote_id="+id;
            System.out.println(selectQuery);
            rs=stmt.executeQuery(selectQuery);
            if(rs.next())
            {
                obj.setQ_quote_id(rs.getInt("q_quote_id"));
                obj.setName(rs.getString("name"));
                obj.setPhone(rs.getString("phone"));
                obj.setEmail(rs.getString("email"));
                obj.setMoving_from(rs.getString("moving_from"));
                obj.setMoving_to(rs.getString("moving_to"));
                obj.setMoving_date(rs.getString("moving_date"));
                obj.setMessage(rs.getString("message"));
                obj.setCompany_name(rs.getString("company_name"));
                obj.setIs_read(rs.getString("isread"));
                obj.setItems_quantity(rs.getString("items_quantity"));
            }
            System.out.println(obj);
        }
        catch(Exception e)
        {
            System.out.println("Some error occured");
            e.printStackTrace();
        }
        finally{
            con=null;
            stmt=null;
        }
        return obj;
    }

    public int deleteRecordById(int id)
    {
        int result=0;
        Connection con=null;
        Statement stmt=null;
        con=MyConnection1.getMyConn();
        try
        {
            String deletequery="DELETE FROM safexonlinequote WHERE q_quote_id="+id;
            stmt=con.createStatement();
            result=stmt.executeUpdate(deletequery);
        }
        catch(Exception e)
        {
            System.out.println("Some Error Occured"+e);
        }
        finally{
            con=null;
            stmt=null;
        }
        return result;
    }
    
    
}
