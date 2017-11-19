package com.ufpb.object;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {		
		List<String> messages= new ArrayList<String>();
		messages.add("Robson");
		MessageProducter mp = new MessageProducter(messages);
		MessageConsumer mc1 = new MessageConsumer(messages);
		MessageConsumer mc2 = new MessageConsumer(messages);
		MessageConsumer mc3 = new MessageConsumer(messages);
		mp.start();
		mc1.start();
		mc2.start();
		mc3.start();
		
		try {
			mp.join();
			mc1.join();
			mc2.join();
			mc3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized(messages){
			for (String lista : messages) {
				System.out.println(lista);
			}
		}
		
	}
}
