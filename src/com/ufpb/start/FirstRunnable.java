package com.ufpb.start;

public class FirstRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Olá, sou a primeira Runnable");
		for (int i=0;i<15;i++)System.out.println("Runnable:"+i);
		
	}

}
