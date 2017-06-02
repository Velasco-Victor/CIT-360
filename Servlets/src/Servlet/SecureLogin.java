package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecureLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		String email = req.getParameter("password");

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
