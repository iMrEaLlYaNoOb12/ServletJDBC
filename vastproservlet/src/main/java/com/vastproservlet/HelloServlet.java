package com.vastproservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(initParams = {
		@WebInitParam(name = "mykey",value = "myvalue"),
		@WebInitParam(name = "mykey2" , value = "myvalue2222")
}, urlPatterns = {"/ben","/muthu","*.mat"})

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method called...");
		String m = config.getInitParameter("mykey");
		System.out.println("Config value..:" + m);
		System.out.println(config.getInitParameter("mykey2"));
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Destroy method call");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do get called...");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("do post called....");
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
//		ServletOutputStream out = response.getOutputStream();
//		out.println("<h1>" + username + ":" + password + "</h1>");
		// response.sendRedirect("views/anotherpage.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("views/anotherpage.jsp");
		rd.forward(request, response);
	}

}
