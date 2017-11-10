package com.ufpb.start;
public class Teste1 {
	public static void main(String[] args) {
		Thread thread = new FirstThread();
		Thread thread2 = new Thread(new FirstRunnable());
		thread2.start();
		try {
			thread.sleep((long)1.0001);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.start();
		System.out.println("Fim");
	}
}
