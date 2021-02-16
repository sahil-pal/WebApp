import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserDao {

	public static boolean update(User o1){  
		boolean status=false;  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
			Statement stmt = con.createStatement();
			String query = "update user_credential set phone='"+o1.getphone()+"', email='"+o1.getEmail()+"',state='"+o1.getState()+"', city='"+o1.getCity()+"' where UserId = '"+o1.getUserID()+"'";
			if(stmt.executeUpdate(query) == 1) {
				 System.out.println("update succesfull");
				 status = true;
			 }
			 else {
				 System.out.println("update failed");
			 }
			
			
			
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  

}
