//java package(Arunjyoti)
package com.maren.myproject.controller;
//importing all the classes from the packages(Arunjyoti)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.myproject.model.Profile;


@WebServlet("/ProfileSaveCtrl")     
public class ProfileSaveCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(Arunjyoti)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//creating a new object profile043 of the class(Arunjyoti)
		Profile profile043 = new Profile();
		// the set method would set the value and get method will return the variable value(Arunjyoti)
		profile043.setUserid(request.getParameter("userid"));
		profile043.setName(request.getParameter("name"));
		profile043.setEmail(request.getParameter("email"));
		//here long class is use parse the charsequence argument as a signed long with specified radix(Arunjyoti)
		profile043.setMobile(Long.parseLong(request.getParameter("mobile")));
		// save in database
		int res = new com.maren.myfirstproject.dao.ProfileDao().save(profile043);
		//to set the attribute
		request.setAttribute("RES", res);
		//getrequestdispatecher provides the facility of dispatching the request to another resource i.e. servlet,jsp or html(Arunjyoti)
		request.getRequestDispatcher("/ProfileViewCtrl").forward(request, response);
	}

}
