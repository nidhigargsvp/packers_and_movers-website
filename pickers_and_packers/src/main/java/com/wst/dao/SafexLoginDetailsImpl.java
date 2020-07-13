package com.wst.dao;

import com.wst.bean.SafexLoginDetails;
import com.wst.connection.MyConnection1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SafexLoginDetailsImpl implements SafexLoginDetailsDAOI{
    
   public int registerUser(SafexLoginDetails obj) {
        int result=0;
        Connection con=null;
        Statement stmt=null;
        String name= obj.getName();
        String email=obj.getEmail();
        String pass=obj.getPassword();
        String st=obj.getStatus();
        String ut=obj.getUser_type();
        con=MyConnection1.getMyConn();
        System.out.println(con);
        try
        {
            String insertQuery="INSERT INTO safexlogindetails(email,password,name,user_type,status) VALUES('"+email+"','"+pass+"','"+name+"','"+ut+"','"+st+"')";
            stmt=con.createStatement();
            result=stmt.executeUpdate(insertQuery);
            System.out.println(insertQuery);
        }
        catch(Exception e)
        {
            System.out.println("Some error occured"+e);
        }
        finally
                {
                    con=null;
                    stmt=null;
                }
        return result;
   }


    public ArrayList<SafexLoginDetails> getAllRecords() {
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        ArrayList<SafexLoginDetails> al=new ArrayList<SafexLoginDetails>();
        try{
            //Get Connection from MyConnection1 Class
            con=MyConnection1.getMyConn();
            System.out.println(con);
            String SelectQuery="SELECT * FROM safexlogindetails";
            stmt=con.createStatement();
            rs=stmt.executeQuery(SelectQuery);
            while(rs.next())
            {
                SafexLoginDetails sd=new SafexLoginDetails();
                sd.setUser_id(rs.getInt("user_id"));
                sd.setName(rs.getString("name"));
                sd.setEmail(rs.getString("email"));
                sd.setPassword(rs.getString("password"));
                sd.setUser_type(rs.getString("user_type"));
                sd.setStatus(rs.getString("status"));
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
    public SafexLoginDetails getRecordById(int id) {
        SafexLoginDetails obj=new SafexLoginDetails();
        ResultSet rs=null;
        Connection con=null;
        Statement stmt=null;
        try{
            // Get connection from my MyConnection1 class
            con=MyConnection1.getMyConn();
            stmt=con.createStatement();
            String selectQuery="SELECT * FROM safexlogindetails WHERE user_id="+id;
            System.out.println(selectQuery);
            rs=stmt.executeQuery(selectQuery);
            if(rs.next())
            {
                obj.setUser_id(rs.getInt("user_id"));
                obj.setEmail(rs.getString("email"));
                obj.setPassword(rs.getString("password"));
                obj.setName(rs.getString("name"));
                obj.setUser_type(rs.getString("user_type"));
                obj.setStatus(rs.getString("status"));
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
        try
        {
            con=MyConnection1.getMyConn();
            String deletequery="DELETE FROM safexlogindetails WHERE user_id="+id;
            stmt=con.createStatement();
            result=stmt.executeUpdate(deletequery);
        }
        catch(Exception e)
        {
            System.out.println("Some Error Occured"+e);
            e.printStackTrace();
        }
        finally{
            con=null;
            stmt=null;
        }
        return result;
    }
    public SafexLoginDetails loginCheck(SafexLoginDetails obj) {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        String email=obj.getEmail();
        String pass=obj.getPassword();
        try
        {
            con=MyConnection1.getMyConn();
            
            String logincheckQuery=" SELECT user_id,email FROM safexlogindetails "+" WHERE (email='"+email+"' AND password='"+pass+"')";    
            stmt=con.createStatement();
            rs=stmt.executeQuery(logincheckQuery);
            if(rs.next()) 
            {
                obj.setUser_id(rs.getInt(1));
                 obj.setName(rs.getString(4));
                  obj.setEmail(rs.getString(2));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error on login details method SQL \n"+e);
            e.printStackTrace();
            
        }
        return obj;
    }


	
}    
