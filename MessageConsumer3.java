package org.demo.observers;

public class MessageConsumer3 implements Observers {

	@Override
	public void update(Message m) {
		System.out.println("Message received"+m.getMessage());

	}

}
