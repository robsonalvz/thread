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
				System.out.println("Adding messages in list "+Thread.currentThread());
				messages.add("Hello "+i);
				messages.notifyAll();
				try {
					messages.wait(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
