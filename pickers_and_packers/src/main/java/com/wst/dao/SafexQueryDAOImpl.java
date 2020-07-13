package com.wst.dao;

import com.wst.bean.SafexQuery;
import com.wst.connection.MyConnection1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class SafexQueryDAOImpl implements SafexQueryDAOI {
    public int registerUser(SafexQuery obj) {
        int result=0;
        Connection con=null;
        Statement stmt=null;
        
        String name=obj.getName();
        String email=obj.getEmail();
        String phone=obj.getPhone();
        String subject=obj.getSubject();
        String query=obj.getQuery();
        String isread=obj.getIs_read();
        con=MyConnection1.getMyConn();
        System.out.println(con);
        try{
          String insertQuery="INSERT INTO safexquery(name,email,phone,subject,query,isread) VALUES('"+name+"','"+email+"','"+phone+"','"+subject+"','"+query+"','"+isread+"')";
          stmt=con.createStatement();
          result=stmt.executeUpdate(insertQuery);
            System.out.println(insertQuery);
          
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
        return result;
    }

    public SafexQuery LoginCheck(SafexQuery obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<SafexQuery> getAllRecords() {
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        ArrayList<SafexQuery> al=new ArrayList<SafexQuery>();
        try{
            //Get Connection from MyConnection1 Class
            con=MyConnection1.getMyConn();
            System.out.println(con);
            String SelectQuery="SELECT * FROM safexquery";
            stmt=con.createStatement();
            rs=stmt.executeQuery(SelectQuery);
            while(rs.next())
            {
               SafexQuery sd=new SafexQuery();
                sd.setQuery_id(rs.getInt("query_id"));
                sd.setName(rs.getString("name"));
                sd.setEmail(rs.getString("email"));
                sd.setPhone(rs.getString("phone"));
                sd.setSubject(rs.getString("subject"));
                sd.setQuery(rs.getString("query"));
                sd.setIs_read(rs.getString("isread"));
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

    

    //@Override
    public SafexQuery getRecordById(int id) {
        SafexQuery obj=new SafexQuery();
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        try{
            // Get connection from my MyConnection1 class
            con=MyConnection1.getMyConn();
            stmt=con.createStatement();
            String selectQuery="SELECT * FROM safexquery WHERE query_id="+id;
            System.out.println(selectQuery);
            rs=stmt.executeQuery(selectQuery);
            if(rs.next())
            {
                obj.setQuery_id(rs.getInt("query_id"));
                obj.setName(rs.getString("name"));
                obj.setPhone(rs.getString("phone"));
                obj.setEmail(rs.getString("email"));
                obj.setSubject(rs.getString("subject"));
                obj.setQuery(rs.getString("query")); 
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
            String deletequery="DELETE FROM safexquery WHERE query_id="+id;
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