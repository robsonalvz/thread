package com.ufpb.cont;

public class TB extends Thread{
	private Contador contador;
	
	public TB(Contador c) {
		this.contador=c;
	}
	@Override
	public void run() {
		this.contador.decremente();
	}
}
