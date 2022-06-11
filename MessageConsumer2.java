package org.demo.observers;

public class MessageConsumer2 implements Observers {

	@Override
	public void update(Message m) {
		System.out.println("Message received::Consumer2"+m.getMessage());

	}

}
