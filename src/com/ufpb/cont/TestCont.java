package com.ufpb.cont;

public class TestCont {
	public static void main(String[] args) {
		Cont cont = new Cont();
		System.out.println(cont.getValor());
		TA ta = new TA(cont);
		TB tb = new TB(cont);
		TB tb2 = new TB(cont);
		tb2.start();
		ta.start();
		tb.start();
		//System.out.println("o valor de cont é: "+cont.getValor());
		try {
			ta.join();
			tb.join();
			tb2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(cont.getValor());
		
	}

}
