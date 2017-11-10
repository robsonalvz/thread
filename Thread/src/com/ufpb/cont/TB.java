package com.ufpb.cont;

public class TB extends Thread{
	private Cont contador;
	
	public TB(Cont c) {
		this.contador=c;
	}
	@Override
	public void run() {
		this.contador.decremente();
	}
}
