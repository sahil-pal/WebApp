

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OwnerHouse1
 */
public class UserHouse2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserHouse2() {
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
	          
	    String fname = "";
	    String lname="";
	    String userid= request.getParameter("userid");
	    String email=request.getParameter("email");
	    String state=request.getParameter("state");
	    String phone=request.getParameter("phone");
	    String city=request.getParameter("city");
	    String pass = "";
	    
	    
	    User o1 = new User(phone,fname,lname,pass,userid,email,state,city);
	    
	    if(UserDao.update(o1)== true){ 
	    	request.setAttribute("userid",userid);
	        RequestDispatcher rd=request.getRequestDispatcher("HomepageUser.jsp");  
	        rd.forward(request,response);  
	    }  
	    else{  
	    	out.println("<html>"); 
 	        out.println("<body>"); 
 	        out.println("<h2>UPDATE PROFILE UnSuccessfull</h2>"); 
 	        out.println("<a href = \"HomepageUser.jsp\"><p align = \"center\" style=\"text-align:center\">Go Back</p></a>");
 	        out.println("</html>"); 
 	        out.println("</body>"); 
	    }  
	          
	    out.close();  
	    }  
	}


