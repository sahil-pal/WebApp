import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;  
  
public class OwnerDao {  
	
	
	
public static boolean add(Owner o1){  
		boolean status=false;  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
			Statement stmt = con.createStatement();
			String query = "insert into house values(";
			query = query + "'"+o1.getLocation()+"',";
			query = query + "'"+o1.getOwner_name()+"',";
			query = query + "'"+o1.getContact_number()+"',";
			query = query + "'"+o1.getEmail()+"',";
			query = query + "'"+o1.getType()+"',";
			query = query + "'"+o1.getArea()+"',";
			query = query + "'"+o1.getSp()+"',";
			query = query + "'"+o1.getRp()+"')";
			
			if(stmt.executeUpdate(query) == 1) {
				 System.out.println("Insertion successful!");
				 status = true;
			 }
			 else {
				 System.out.println("Insertion failed");
			 }
			
			
		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
 
public static boolean delete(Owner o1){  
	boolean status=false;  
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
		Statement stmt = con.createStatement();
		String query = "delete from house where location = '"+o1.getLocation()+"' and name = '"+o1.getOwner_name()+"'";
		if(stmt.executeUpdate(query) >= 1) {
			 System.out.println("deletion successful!");
			 status = true;
		 }
		 else {
			 System.out.println("deletion failed");
		 }
		
		
		
	}catch(Exception e){System.out.println(e);}  
	return status;  
} 


public static boolean update(Owner o1){  
	boolean status=false;  
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
		Statement stmt = con.createStatement();
		String query = "update house set type = '"+o1.getType()+"' , area = '"+o1.getArea()+"', sp = '"+o1.getSp()+"' and '"+o1.getRp()+"' where location = '"+o1.getLocation()+"' and name = '"+o1.getOwner_name()+"'";
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