package com.ness.eshop.event;

import org.springframework.stereotype.Component;

@Component
public class EventListener {
	
	@org.springframework.context.event.EventListener
	public void handle(PersonCreated event) {
		
		System.out.println("Status: " + event.message);
	}
	
}
