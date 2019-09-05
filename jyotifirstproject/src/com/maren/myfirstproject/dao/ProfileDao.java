//java package(Arunjyoti)
package com.maren.myfirstproject.dao;
//importing all the classes from the packages(Arunjyoti)
import java.sql.Connection;
import java.lang.ClassNotFoundException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maren.myproject.model.Profile;
//class profiledao (Arunjyoti)
public class ProfileDao {

	public static Connection getConnection()throws ClassNotFoundException,SQLException {
		//database mysql connection(Arunjyoti)
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1158:orcl", "sys as sysdba", "little");

	}
	//save is the method for class profile(Arunjyoti)
	public int save(Profile profile) {
		//connection and statement has been kept null(Arunjyoti)
		Connection con043 = null;
		Statement st043 = null;
		int res043 = 0;
		//exception handling(Arunjyoti)
		try {
			//getting connection with datadabse(Arunjyoti)
			con043 = getConnection();
			//creating statements(Arunjyoti)
			st043 = con043.createStatement();
			//executing queries(Arunjyoti)
			res043 = st043.executeUpdate("INSERT INTO test.profile (userid, name, email, mobile) VALUES ('"+profile.getUserid()+"', '"+profile.getName()+"', '"+profile.getEmail()+"', "+profile.getMobile()+")"); 
		}catch (ClassNotFoundException | SQLException e) {
			//this method prints a stack trace for this throwable object on the standard error output stream(Arunjyoti)
			e.printStackTrace();
		}finally {
			try {
				st043.close();
				con043.close();
			} catch (SQLException e) {
	//this method prints a stack trace for this throwable object on the standard error output stream(Arunjyoti)
				e.printStackTrace();
			}
		}
		//terminates the execution of a function and return control to the calling function(Arunjyoti)
		return res043;
	}
	//fetches all remaining row in the result set(Arunjyoti)
	public List<Profile> fetchAll() {
		//connection and statement has been kept null(Arunjyoti)
		List<Profile> list043=null;
		Connection con043 = null;
		Statement st043 = null;
		//exception handling(Arunjyoti)
		try {
			//getting connection with datadabse(Arunjyoti)
			con043 = getConnection();
			//creating statements(Arunjyoti)
			st043 = con043.createStatement();
			//executing queries(Arunjyoti)
			ResultSet rs043 = st043.executeQuery("SELECT * FROM test.profile");
			if(rs043 != null)
				//creating an array for the storage(Arunjyoti)
				list043 = new ArrayList<>();
			while(rs043.next()) {
				////creating a new object profile043 of the class(Arunjyoti)
				Profile pr = new Profile();
				// the set method would set the value and get method will return the variable value(Arunjyoti)
				pr.setUserid(rs043.getString("userid"));
				pr.setName(rs043.getString("name"));
				pr.setEmail(rs043.getString("email"));
				pr.setMobile(rs043.getLong("mobile"));
				list043.add(pr);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st043.close();
				con043.close();
			} catch (SQLException e) {
//this method prints a stack trace for this throwable object on the standard error output stream(Arunjyoti)
				e.printStackTrace();
			}
			
		}
//terminates the execution of a function and return control to the calling function(Arunjyoti)
		return list043;
	}
	//main function(Arunjyoti)
	public static void main(String[] args) {
		Connection con043 = null;
		Statement st043 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con043 = DriverManager.getConnection("jdbc:mysql://localhost:3360/test", "root", "root");
			st043 = con043.createStatement();
			ResultSet rs043 = st043.executeQuery("SELECT * FROM test.student");
			while(rs043.next()) {
				String id = rs043.getString("userid");
				String name = rs043.getString("name");
				String email = rs043.getString("email");
				long mobile = rs043.getLong("mobile");
				System.out.println("Id : " +id + "\tName : "+ name+ "\tEmail : " +email + "\tMobile : " +mobile );
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st043.close();
				con043.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
