

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String fname = request.getParameter("user_fname");
		String lname = request.getParameter("user_lname");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String checkbox = request.getParameter("terms");
		
		if(checkbox != null) {
			
			Cookie cookie1 = new Cookie("user_fname",fname);
			Cookie cookie2 = new Cookie("user_lname",lname);
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
			out.println("<html>"
			+ "<h1 style='text-align:center; font-size:20px;'>DEAR, "+fname+" "+lname+" DATA IS SUCCESSFULLY REGISTERD</h1>"
			+ "<body>"
			+ "<h2 style='text-align:left;'>Your Details are : </h2>"
			+ "<p>gender : "+gender+"</p>"
			+ "<p>course : "+course+"</p>"
			+ "<a href='successServlet?name="+fname+"'><p>Check Cookies Concept</p></a>"
					+ "</html>");
			
		}
		else {
				
				out.println("<html>"
						+ "<h1 style='text-align : center; font-size : 20px;'>You did not checked the check box</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("Homepage1.html");
				rd.include(request,response);
				
		}
		
		
	}

}
