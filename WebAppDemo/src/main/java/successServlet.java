

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class successServlet
 */
public class successServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public successServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		String fname = request.getParameter("user_fname");
//		String lname = request.getParameter("user_lname");
//		String gender = request.getParameter("user_gender");
//		String course = request.getParameter("user_course");
		
		boolean flag = false;
		String fname = request.getParameter("name");
		String lname = "";
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies == null) {
			out.println("<h1 style='text-align:center; font-size:20px;'> YOU ARE A NEW USER  </h1>"
					+ "<a href='Homepage1.html'><p>Fill Form</p></a>");
			return;
		}
		else {
				for(Cookie c : cookies) {
					String tname = c.getName();
					if(tname.equals("user_fname")) {
						flag  = true;
						fname = c.getValue();
					}
					else if(tname.equals("user_lname")){
						flag = true;
						lname = c.getValue();
					}
					else {
						
					}
		
				}
		}
		
		if(flag == true) {
		out.println("<html>"
				+ "<h1 style='text-align:center; font-size:20px;'> WELCOME BACK </h1>"
						+ "<body>"
						+ "<h2 style='text-align:left;'>Cookie details are : </h2>"
						+ "First name : "+fname
						+ "<br></br>Last name : "+lname
				+ "</html>");
		}
		else {
			out.println("<h1 style='text-align:center; font-size:20px;'> YOU ARE A NEW USER  </h1>"
					+ "<a href='Homepage1.html'><p>Fill Form</p></a>");
		}
		
		
		
	}

}
