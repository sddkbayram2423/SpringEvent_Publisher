package com.proje.event;

import org.springframework.context.ApplicationEvent;

import com.proje.user.User;

public class UserSendEmailEvent extends ApplicationEvent {
	
	
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String message;
	private User user;
	
	public UserSendEmailEvent(String title, String message, User user) {
		super(user);
		this.title = title;
		this.message = message;
		this.user = user;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserSendEmailEvent [title=" + title + ", message=" + message + ", user=" + user + "]";
	}
	
	
	


}
