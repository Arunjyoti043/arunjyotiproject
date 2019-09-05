//java package(Arunjyoti)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(Arunjyoti)
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTest2(Arunjyoti)
 */
@WebServlet("/ScopeTest2")
public class ScopeTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Arunjyoti)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// sharing out data among resources(Arunjyoti)
		String req043=(String) request.getAttribute("REQUEST");//will process current request(Arunjyoti)
		String ses043=(String) request.getSession().getAttribute("SESSION");//will return current session(Arunjyoti)
		//http session contains a reference to servletcontext that this seesion belong to(Arunjyoti)
		String app043=(String) request.getServletContext().getAttribute("APP");
		// returns a printwriter object that can send character text to the client(Arunjyoti)
		PrintWriter out=response.getWriter();
		out.println("Req:"+req043);
		out.println("Session:"+ses043);
		out.println("Application:"+app043);
		
	}

}
