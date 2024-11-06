package com.example.bean;

public class user {
	private Integer userid;
	private String userName;
	private String userRole;
	
	
	public user()
	{
		System.out.println("i am an default constructor");
	}
	public user(Integer userid, String userName, String userRole) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "user [userid=" + userid + ", userName=" + userName + ", userRole=" + userRole + "]";
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
	

}
