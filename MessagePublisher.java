package org.demo.observers;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
	
	List<Observers> observersList=new ArrayList<>();

	@Override
	public void attach(Observers o) {
		observersList.add(o);

	}

	@Override
	public void detach(Observers o) {
		observersList.remove(o);

	}

	@Override
	public void notifyObservers(Message m) {
	    for(Observers o: observersList) {
	    	o.update(m);
	    }

	}

}
