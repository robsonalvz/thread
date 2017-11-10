package com.ufpb.cont;

public class Contador {
	private int cont=0;
	
	public synchronized void incremente(){
		cont++;
	}
	public synchronized void decremente(){
		cont--;
	}
	public synchronized int getValor(){
		return this.cont;
	}

}
