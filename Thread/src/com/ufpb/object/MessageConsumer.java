package com.ufpb.object;

import java.util.List;

public class MessageConsumer extends Thread{
	private List<String> messages;
	
	public MessageConsumer(List<String> messages) {
		this.messages = messages;
	}
	@Override
	public void run() {
		synchronized(messages){
			boolean consumer = false;
			while (!consumer){
				if (messages.size()>0){
					System.out.println("Consuming..."+messages.get(0)+" "+Thread.currentThread());
					messages.remove(0);
					consumer = true;
				}else{
					System.out.println("i'm a messageConsumer and i haven't messages");
					try {
						messages.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	}
}
