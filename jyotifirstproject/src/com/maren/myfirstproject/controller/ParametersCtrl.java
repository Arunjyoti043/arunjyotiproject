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
 * Servlet implementation class ParametersCtrl(Arunjyoti)
 */
@WebServlet("/ParametersCtrl")
public class ParametersCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(Arunjyoti)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//retrieve request parameter (Arunjyoti)
		String name043=request.getParameter("txtName");
		String pass043=request.getParameter("pass");
		// returns a printwriter object that can send character text to the client(Arunjyoti)
		PrintWriter out=response.getWriter();
		//name and password would simply print(Arunjyoti)
		out.print("<b> Name <b>:"+name043);
		out.print("<b> Password <b>:"+pass043);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(Arunjyoti)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
