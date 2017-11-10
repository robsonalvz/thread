package com.ufpb.cont;

public class TesteContador {
	public static void main(String[] args) {
		Contador contador = new Contador();
		TA ta = new TA(contador);
		TB tb = new TB(contador);
		ta.start();
		tb.start();
		try {
			ta.join();
			tb.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(contador.getValor());
		
	}

}
