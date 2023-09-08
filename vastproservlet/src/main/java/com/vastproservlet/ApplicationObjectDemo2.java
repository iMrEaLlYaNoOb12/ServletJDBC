package com.vastproservlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApplicationObjectDeo
 */
@WebServlet("/appdemo2")
public class ApplicationObjectDemo2 extends HttpServlet {
	ServletContext application;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.application = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ServletContext is the application object
		this.application = request.getServletContext();
		String str = (String) application.getAttribute("myatt");
		System.out.println("Attribute...:" + str);
	}
}
