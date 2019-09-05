//java package(Arunjyoti)
package com.maren.myfirstproject.controller;
//importing all the classes from the packages(Arunjyoti)
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloCtrl(Arunjyoti)
 */
@WebServlet("/HelloCtrl")
public class HelloCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(arunjyoti043)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// returns a printwriter object that can send character text to the client here it is hello servlet(arunjyoti043)
		response.getWriter().append("Hello Servlet ");
		ServletContext app043 = getServletContext();
		app043.setAttribute("s1","arunjyoti043");
		app043.setAttribute("s1", "bhagyashree023");
		app043.removeAttribute("s1");
		
	}

}
