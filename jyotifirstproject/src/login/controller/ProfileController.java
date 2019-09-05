package login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.model.User;
import login.service.UserService;

/**
 * Servlet implementation class ProfileController
 */
@WebServlet("/ProfileController")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username043 = (String)request.getSession().getAttribute("username");
		RequestDispatcher rd043 = null;
		if(username043 == null) {
			rd043 = request.getRequestDispatcher("index.jsp");
			request.setAttribute("error", "Unauthorised User");
		}else {
			UserService userService043 = new UserService();
			User user043 = userService043.getUser(username043);
			rd043 = request.getRequestDispatcher("profile.jsp");
			request.getSession().setAttribute("user", user043);
		}
		rd043.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}