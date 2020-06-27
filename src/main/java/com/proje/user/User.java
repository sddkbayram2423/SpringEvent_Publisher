package com.proje.user;

public class User {
	private String email;
	private String password;
	private String name;
	private String lastName;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	

	public User(String email, String password, String name, String lastName) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", name=" + name + ", lastName=" + lastName + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	

}
