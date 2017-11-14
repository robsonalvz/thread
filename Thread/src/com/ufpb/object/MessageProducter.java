package com.ufpb.object;

import java.util.List;

public class MessageProducter extends Thread{
	private List<String> messages;
	public void addMessage(String message){
		this.messages.add(message);
		try {
			messages.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	
}
