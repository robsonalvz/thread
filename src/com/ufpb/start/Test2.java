package com.ufpb.start;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Oi");
		Thread thread = new Thread(new FirstRunnable());
		thread.start();
	}
}