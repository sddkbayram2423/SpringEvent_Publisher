package com.proje.publisher;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.proje.event.UserSendEmailEvent;
import com.proje.user.User;
@Component
public class UserSendEmailEventPublisher  {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void setMessage() {

		UserSendEmailEvent event=new UserSendEmailEvent("DOGUM GUNU MESSAJI", "DOGUM GUNUNUZ KUTLU OLSUN", 
																				new User("onurbaran@hmail.com", "****", "ONUR", "BARAN"));
		
		
		this.applicationEventPublisher.publishEvent(event);
	}
}
