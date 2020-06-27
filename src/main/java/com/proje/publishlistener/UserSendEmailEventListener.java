package com.proje.publishlistener;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.proje.event.UserSendEmailEvent;

@Component
public class UserSendEmailEventListener implements ApplicationListener<UserSendEmailEvent> {
	

	@Override
	public void onApplicationEvent(UserSendEmailEvent event) {
		System.out.println(event.getUser());
		System.out.println("----------------------------------------");
		System.out.println("Title: "+event.getTitle());
		System.out.println("Message: "+event.getMessage()+"!");
		
	}

}
