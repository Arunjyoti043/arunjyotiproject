//java package(Arunjyoti)
package com.maren.myproject.model;
//class profile(Arunjyoti)
    
public class Profile
 {
	//private access specifier so that it can be only accessed inside the same class(Arunjyoti)
	private String userid;

	private String name;

	private String email;

	private long mobile;
      	
	
	//deafault contsructor(Arunjyoti)
public Profile() {

	}
//copy constructor(Arunjyoti)
	public Profile(String userid, String name, String email, long mobile) {
//super keyword is the reference variable that is used to refer parent class objects(Arunjyoti)
		super();
//this keyword works as a refernce for the current object(Arunjyoti)
	this.userid = userid;

	this.name = name;
	
	this.email = email;

		this.mobile = mobile;
	
}
	//returns the value of variable userid(Arunjyoti)
	public String getUserid()
 {
		return userid;

	}
	//sets the value of userid(Arunjyoti)
	public void setUserid(String userid) {

		this.userid = userid;
	
	}
	//returns the value of variable name(Arunjyoti)
	public String getName() {
	
	return name;
	
	}
   //sets the value of name(Arunjyoti)
	public void setName(String name) {

		this.name = name;
	
}
    //returns the value of variable email(Arunjyoti)
	public String getEmail() {

	return email;

	}
    //sets the value of email(Arunjyoti)
	public void setEmail(String email) {

		this.email = email;
	}
	//return the value of variable mobile(Arunjyoti)
	public long getMobile() {
		return mobile;
	}
	//sets the value of variable mobile(Arunjyoti)
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}

