package org.demo.observers;

public interface Subject {

	
	public void attach(Observers o);
	
	public void detach(Observers o);
	
	public void notifyObservers(Message m);
}
