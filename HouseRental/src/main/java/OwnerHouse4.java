

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
public class OwnerHouse4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwnerHouse4() {
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
	          
	    String location =request.getParameter("location")
;	    String name=request.getParameter("name");
	   
	    
	    try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
			Statement stmt = con.createStatement();
			String query="";
			if(location.equals(null) == false) {
			query = query + "select * from house where name = '"+name+"' and location = '"+location+"'";
			}
			else {
			query = query + "select * from house where name = '"+name+"'";
			}
			
			
			ResultSet rs = stmt.executeQuery(query);
			
			out.print("<table border='1' width='100%'");  
			out.println("<!DOCTYPE html>"
					+ "<html>"
					+ "<body>"
					+ "<h1><center> HOUSE RENTAL MANGEMENT </center> </h2>"
					+ "<body>"
					+ "<h1><center> OWNER HOUSES INFORMATION </center> </h1>"
					+ "<table border=\"2\">"
					+ "<tr>"
					+ "<td>LOCATION</td>"
					+ "<td>OWNER NAME</td>"
					+ "<td>CONTACT</td>"
					+ "<td>E-MAIL</td>"
					+ "<td>HOUSE TYPE</td>"
					+ "<td>AREA (in sqft)</td>"
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
    			 		    	+"</tr>");      	        
    		}
    		
    		out.println("\n" + 
    				"		<a href=\"HomepageOwner.jsp\">\n" + 
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



