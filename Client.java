package org.demo.observers;

public class Client {

	public static void main(String[] args) {
		MessagePublisher publisher=new MessagePublisher();
		
		MessageConsumer consumer=new MessageConsumer();
		MessageConsumer2 consumer2=new MessageConsumer2();
		
		publisher.attach(consumer);
		publisher.attach(consumer2);
		
		publisher.notifyObservers(new Message("hi"));
		
		publisher.detach(consumer2);
		
		publisher.notifyObservers(new Message("hi"));
	}
}
