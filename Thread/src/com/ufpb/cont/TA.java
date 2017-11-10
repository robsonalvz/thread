package com.ufpb.cont;

public class TA extends Thread{
	private Cont contador;
	
	public TA(Cont c){
		this.contador=c;
	}
	@Override
	public void run(){
		this.contador.incremente();
	}
	
}
