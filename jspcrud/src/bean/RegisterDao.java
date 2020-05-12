/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;

public class RegisterDao
{
    public static int register(User u)
    {
        int status=0;
        try{
            Connection con=ConnectionProvider.getCon();
            System.out.println("con is "+con);
            PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
            ps.setString(1,u.getId()); 
            ps.setString(2,u.getName());
            ps.setString(3,u.getSal());
            status=ps.executeUpdate();
        }catch(Exception e){}
        return status;
    }
    
    public static ResultSet display()
    {
        ResultSet rs = null;
        try{
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("select * from emp");
            rs = ps.executeQuery();
            
            
        }catch(Exception e){}
        return rs;
    }
}
