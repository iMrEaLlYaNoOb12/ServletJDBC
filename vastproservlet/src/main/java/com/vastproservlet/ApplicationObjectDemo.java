package com.vastproservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet("/appdemo")
public class ApplicationObjectDemo extends HttpServlet {
	ServletContext application;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			this.application = config.getServletContext();

			String url = application.getInitParameter("url");
			String username = application.getInitParameter("username");
			String password = application.getInitParameter("password");

			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	synchronized protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ServletContext is the application object
		this.application = request.getServletContext();
		application.setAttribute("myatt", "my att Svalue...");
		System.out.println("set successfully");
	}
}
