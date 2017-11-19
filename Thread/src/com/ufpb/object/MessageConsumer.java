package com.ufpb.object;

import java.util.List;

public class MessageConsumer extends Thread{
	private List<String> messages;
	
	public MessageConsumer(List<String> messages) {
		this.messages = messages;
	}
	@Override
	public void run() {
		
	}
}
