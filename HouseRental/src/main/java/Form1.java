import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormHandler
 */
public class Form1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();
		
		
	      response.setContentType("text/html; charset=UTF-8");
	      // Allocate a output writer to write the response message into the network socket
	      PrintWriter out = response.getWriter();
	 
	      // Write the response message, in an HTML page
	      
	         String username = request.getParameter("username");
	         
	         String password = request.getParameter("userpass");
	         
	        if(LoginDao.validateOwner(username, password)){  
	 	       request.setAttribute("userid",username);
	 	       RequestDispatcher rd= request.getRequestDispatcher("HomepageOwner.jsp");
	 	       rd.forward(request, response);
	 	    }  
	 	    else{  
	 	    	RequestDispatcher rd= request.getRequestDispatcher("redirectO.jsp");
		 	       rd.forward(request, response);
	 	        
	 	    }  
	      out.close();
	}

}
