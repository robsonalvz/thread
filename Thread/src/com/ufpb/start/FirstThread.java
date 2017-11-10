package com.ufpb.start;

public class FirstThread extends Thread{
		
	@Override
	public void run() {
		System.out.println("Olá, sou a primeira Thread!");
		System.out.println("Vou acabar!");
		for (int i=0;i<15;i++)System.out.println("Thread:"+i);
			
	}
}
