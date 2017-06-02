package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum = num1 + num2;

		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("<title>This is the response</title>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("<body>");

		resp.getWriter().println("The sum of  [" + num1 + " + " + num2 + "] =  " + sum );

		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}