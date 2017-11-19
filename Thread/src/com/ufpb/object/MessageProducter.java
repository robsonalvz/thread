package com.ufpb.object;

import java.util.List;

public class MessageProducter extends Thread{
	
	private List<String> messages;
	
	public MessageProducter(List<String> messages) {
		this.messages=messages;
	}
	
	public void run(){
		for (int i=1;i<=5;i++){
			synchronized (messages) {
				System.out.println("Colocando mensagens na lista");
				messages.add("Oi "+i);
				try {
					messages.wait(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void addMessage(String message){
		this.messages.add(message);
		try {
			messages.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	
}
