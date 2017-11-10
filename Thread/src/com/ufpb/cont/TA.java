package com.ufpb.cont;

public class TA extends Thread{
	private Contador contador;
	
	public TA(Contador c){
		this.contador=c;
	}
	@Override
	public void run(){
		this.contador.incremente();
	}
	
}
