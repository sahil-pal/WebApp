

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OwnerHouse1
 */
public class UserHouse1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserHouse1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    
	    try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
			Statement stmt = con.createStatement();
			String query="";
			

			 String filter = request.getParameter("f");
			 String value = request.getParameter("value");
	         if (filter.equals("location")) {
	         query = query +"select * from house where location = '"+value+"'";
	         }
	         else if(filter.equals("type")) {
		         query = query +"select * from house where type = '"+value+"'";
		      }
	         else if(filter.equals("sp")) {
		         query = query +"select * from house where sp <= '"+value+"'";
		      }
	         else if(filter.equals("area")) {
		         query = query +"select * from house where area < '"+value+"'";
		      }
	         else {
	        	 query = query +"select * from house where rp <= '"+value+"'";
	         }
	         
			
			ResultSet rs = stmt.executeQuery(query);
			
			out.print("<table border='1' width='100%'");  
			out.println("<!DOCTYPE html>"
					+ "<html>"
					+ "<body>"
					+ "<h1><center> HOUSE RENTAL MANGEMENT </center> </h2>"
					+ "<body>"
					+ "<h1><center>   SEARCHED RESULTS </center> </h1>"
					+ "<table border=\"2\">"
					+ "<tr>"
					+ "<td>LOCATION</td>"
					+ "<td>OWNER NAME</td>"
					+ "<td>CONTACT</td>"
					+ "<td>E-MAIL</td>"
					+ "<td>HOUSE TYPE</td>"
					+ "<td>AREA (in sqft.)</td>"
					+ "<TD>SELLING PRICE (RS)</TD>"
					+ "<TD>RENTAL AMOUNT (RS)</TD>"
					+ "</tr>");
			
    		while(rs.next()) {
    			 out.println("<tr>"
    			 				+"<td>"+rs.getNString(1)+"</td>"
    			 				+"<td>"+rs.getNString(2)+"</td>"
    			 				+"<td>"+rs.getNString(3)+"</td>"
    			 				+"<td>"+rs.getNString(4)+"</td>"
    			 				+"<td>"+rs.getNString(5)+"</td>"
    			 				+"<td>"+rs.getNString(6)+"</td>"
    			 				+"<td>"+rs.getNString(7)+"</td>"
    			 				+"<td>"+rs.getNString(8)+"</td>"
//    			 				
    			 			+"</tr>");      	        
    		}
    		
    		out.println("\n" + 
    				"		<a href=\"HomepageUser.jsp\">\n" + 
    				"		<span class=\"glyphicon glyphicon-trash\"></span> Go Back\n" + 
    				"		</a>\n" + 
    				"<br></br>"
    				+ "<br></br>");
    
	    }catch(Exception e)
	    {
    	 e.printStackTrace();
        } 
			
	    }
	
}



