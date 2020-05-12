package bean;
import java.sql.*;
public class LoginDao {

	public static boolean validate(LoginBean bean){
		boolean status=false;
		try{
			System.out.println("At DB Login Dao");
			Connection con=ConnectionProvider.getCon();
			System.out.println("stored email "+bean.getEmail());
			System.out.println("stored pass is "+bean.getPass());
			PreparedStatement ps=con.prepareStatement("select * from user432 where email=? and pass=?");
			ps.setString(1,bean.getEmail());
			ps.setString(2, bean.getPass());
						
			ResultSet rs=ps.executeQuery();
			System.out.println("resut is"+rs.getString("pass"));
			status=rs.next();
			System.out.println("status is "+status);
			
		}catch(Exception e){}
		return status;
	}
}
