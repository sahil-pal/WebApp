

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
public class OwnerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwnerRegister() {
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
	          
	    String userid =request.getParameter("userid");
	    String pass=request.getParameter("password");
	    String cpass=request.getParameter("cpassword");
	    
	    if(userid.length() > 15) {
	    	out.println("<html>"); 
 	        out.println("<body>"); 
 	        out.println("<h2>Registeration Unsuccessful</h2>");
 	        out.println("<h2>User id limit exceeded !!!  Enter UserID Again</h2>");
 	        out.println("<a href = \"RegisterOwner.jsp\"><p align = \"center\" style=\"text-align:center\">Enter Again</p></a>");
 	        out.println("</html>"); 
 	        out.println("</body>"); 
	    }
	    else if(userid.length() < 16 && pass.equals(cpass)) {
	    	
 	       try{  
 				Class.forName("com.mysql.jdbc.Driver");  
 				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/houserental","root","Admin@12345");  
 				Statement stmt = con.createStatement();
 				String query="insert into owner values('"+userid+"','"+pass+"')";
 				
 				if(stmt.executeUpdate(query) == 1) {
 					   request.setAttribute("userid",userid);
 			 	       RequestDispatcher rd= request.getRequestDispatcher("loginOwner.jsp");
 			 	       rd.forward(request, response);
 				 }
 				 else {
 					    out.println("<html>"); 
 			 	        out.println("<body>"); 
 			 	        out.println("<h2>ERROR IN REGISTERING</h2>"); 
 			 	        out.println("<a href = \"RegisterOwner.jsp\"><p align = \"center\" style=\"text-align:center\">LOGIN OWNER</p></a>");
 			 	        out.println("</html>"); 
 			 	        out.println("</body>"); 
 				 }
 				
 	    
 		    }catch(Exception e)
 		    {
 	    	 e.printStackTrace();
 	        } 
 	        
	    }
	    else {
	    	out.println("<html>"); 
 	        out.println("<body>"); 
 	        out.println("<h2>Registeration Unsuccessful</h2>"); 
 	        out.println(" Confirm password do not match the entered password");
 	        out.println("<a href = \"RegisterOwner.jsp\"><p align = \"center\" style=\"text-align:center\">Enter Again</p></a>");
 	        out.println("</html>"); 
 	        out.println("</body>"); 
	    }

	    
	   
			
	    }
	
}



