package login.service;

import login.dao.UserDao;
import login.model.User;

public class UserService {

	UserDao userDao043 = new UserDao();
	public boolean checkUser(String username, String pass) {
		return userDao043.fetchUserByUsernameAndPassword(username,pass);
	}
	public User getUser(String username) {
		return userDao043.getUserByUsername(username);
		
	}
	public boolean editUser(User user) {
		// TODO Auto-generated method stub
		return userDao043.updateUser(user);
	}

}