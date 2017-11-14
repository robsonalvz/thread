package com.ufpb.object;

public class Main {
	public static void main(String[] args) {		
		MessageProducter mp = new MessageProducter();
		MessageConsumer mc1 = new MessageConsumer();
		MessageConsumer mc2 = new MessageConsumer();
		MessageConsumer mc3 = new MessageConsumer();
		mp.start();
		mc1.start();
		mc2.start();
		mc3.start();
		
	}
}
