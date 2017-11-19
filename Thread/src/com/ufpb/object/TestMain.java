package com.ufpb.object;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestMain {

	@Test
	public void test() {
		List<String> messages= new ArrayList<String>();
		MessageProducter producter = new MessageProducter(messages);
		MessageConsumer mc1 = new MessageConsumer(messages);
		MessageConsumer mc2 = new MessageConsumer(messages);
		MessageConsumer mc3 = new MessageConsumer(messages);
		
		producter.start();
		mc1.start();
		mc2.start();
		mc3.start();
		
		try {
			producter.join();
			mc1.join();
			mc2.join();
			mc3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertEquals(messages.size(),2);
	}

}
