

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
public class OwnerHouse2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwnerHouse2() {
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
	          
	    String location =request.getParameter("location");
	    String name=request.getParameter("owner");
	    String type = request.getParameter("type");
	    String email="";
	    String contact="";
	    String area = "";
	    String sp = "";
	    String rp = "";
	    
	    
	    Owner o1 = new Owner(location,name,contact,email,type,area,sp,rp);
	    
	    if(OwnerDao.delete(o1)== true){ 
	    	request.setAttribute("userid",name);
	        RequestDispatcher rd=request.getRequestDispatcher("HomepageOwner.jsp");  
	        rd.forward(request,response);  
	    }  
			else {
				out.println("<html>"); 
	 	        out.println("<body>"); 
	 	        out.println("<h2>Delete HOUSE UnSuccessfull</h2>"); 
	 	        out.println("<a href = \"HomepageOwner.jsp\"><p align = \"center\" style=\"text-align:center\">Go back</p></a>");
	 	        out.println("</html>"); 
	 	        out.println("</body>"); 
			}
			
			
	   
	    }
	
}



