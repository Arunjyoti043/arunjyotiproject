package login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.service.UserService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username043 = request.getParameter("username");
		String pass043 = request.getParameter("password");
		// check for user validation
		UserService userService = new UserService();
		boolean flag043 = userService.checkUser(username043, pass043);
		RequestDispatcher rd = null;
		if(flag043) {
			rd = request.getRequestDispatcher("/ProfileController");
			request.getSession().setAttribute("username", username043);
		}else {
			rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("error", "Username or password incorrect");
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}