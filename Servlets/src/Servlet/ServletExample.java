package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

		String name = request.getParameter("userName");
		String email = request.getParameter("password");

		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("<title>This is the response</title>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("<body>");

		resp.getWriter().println("Welcome Back " + name + "!" +  "<br>");

		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
