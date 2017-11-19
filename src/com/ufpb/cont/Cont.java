package com.ufpb.cont;

public class Cont {
	private int cont;
	
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
