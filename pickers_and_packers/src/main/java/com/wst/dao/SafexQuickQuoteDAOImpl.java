package com.wst.dao;

import com.wst.bean.SafexQuickQuote;
import com.wst.connection.MyConnection1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class SafexQuickQuoteDAOImpl implements SafexQuickQuoteDAOI{
     public int registerUser(SafexQuickQuote obj) {
        int result=0;
        Connection con=null;
        Statement stmt=null;
        String name=obj.getName();
        String email=obj.getEmail();
        String phone=obj.getPhone();
        String movingfrom=obj.getMoving_from();
        String movingto=obj.getMoving_to();
        String movingdate=obj.getMoving_date();
        String message=obj.getMessage();
        String isread=obj.getIs_read();
        con=MyConnection1.getMyConn();
         System.out.println(con);
        try
        {
          String insertQuery="INSERT INTO safexquickquote(name,email,phone,moving_from,movingto,moving_date,message,isread) VALUES('"+name+"','"+email+"','"+phone+"','"+movingfrom+"','"+movingto+"','"+movingdate+"','"+message+"','"+isread+"')";
          stmt=con.createStatement();
          result=stmt.executeUpdate(insertQuery);
          System.out.println(insertQuery);
        }
        catch(Exception e)
        {
            System.out.println("Some error Occured");
            e.printStackTrace();
        }
        finally
        {
            con=null;
            stmt=null;
        }
        return result;
    }

    public SafexQuickQuote LoginCheck(SafexQuickQuote obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<SafexQuickQuote> getAllRecord() {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        ArrayList<SafexQuickQuote>al=new ArrayList<SafexQuickQuote>();
        try
        {
            con=MyConnection1.getMyConn();
            System.out.println(con);
            String selectquery="SELECT * FROM safexquickquote";
            stmt=con.createStatement();
            rs=stmt.executeQuery(selectquery);
            while(rs.next())
            {
                SafexQuickQuote sd=new SafexQuickQuote();
                sd.setQ_quote_id(rs.getInt("q_quote_id"));
                sd.setName(rs.getString("name"));
                sd.setPhone(rs.getString("phone"));
                sd.setEmail(rs.getString("email"));
                sd.setMoving_from(rs.getString("moving_from"));
                sd.setMoving_to(rs.getString("movingto"));
                sd.setMoving_date(rs.getString("moving_date"));
                sd.setMessage(rs.getString("message"));
                sd.setIs_read(rs.getString("isread"));
                al.add(sd);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some Error Occured "+e);
            e.printStackTrace();
        }
        finally{
        con=null;
        stmt=null;
        }
        return al;
    }

   // @Override
    public SafexQuickQuote getRecordById(int id) {
        SafexQuickQuote obj=new SafexQuickQuote();
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        try{
            // Get connection from my MyConnection1 class
            con=MyConnection1.getMyConn();
            stmt=con.createStatement();
            String selectQuery="SELECT * FROM safexquickquote WHERE q_quote_id="+id;
            System.out.println(selectQuery);
            rs=stmt.executeQuery(selectQuery);
            if(rs.next())
            {
                obj.setQ_quote_id(rs.getInt("q_quote_id"));
                obj.setName(rs.getString("name"));
                obj.setPhone(rs.getString("phone"));
                obj.setEmail(rs.getString("email"));
                obj.setMoving_from(rs.getString("moving_from"));
                obj.setMoving_to(rs.getString("movingto"));
                obj.setMoving_date(rs.getString("moving_date"));
                obj.setMessage(rs.getString("message"));
                obj.setIs_read(rs.getString("isread"));
                
            }
            System.out.println(obj);
        }
        catch(Exception e)
        {
            System.out.println("Some error occured"+e);
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
            String deletequery="DELETE FROM safexquickquote WHERE q_quote_id="+id;
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
