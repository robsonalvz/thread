package com.ufpb.start;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Oi");
		Runnable runnable = () -> {
			System.out.println("Olá, sou a primeira Runnable");
			for (int i=0;i<15;i++)System.out.println("Runnable:"+i);
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
	}
}
