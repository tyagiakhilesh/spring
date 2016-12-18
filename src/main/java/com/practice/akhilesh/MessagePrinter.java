package com.practice.akhilesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
	final private MessageService messageService;
	
	@Autowired
	public MessagePrinter(final MessageService aMessageService) {
		this.messageService = aMessageService;
	}
	
	public void printMessage() {
		System.out.println(this.messageService.getMessage());
	}
}
