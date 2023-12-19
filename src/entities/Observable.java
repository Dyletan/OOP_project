package entities;

import java.util.Vector;

public class Observable {
	private Vector<Observer> subscribers;
	{
		subscribers = new Vector<Observer>();
	}
	
	public void addSubscriber(Observer subscriber) {
		subscribers.add(subscriber);
	}
	
	public void removeSubscriber(Observer subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void notifySubscribers() {
		for(Observer subscribers : subscribers) {
			subscribers.notifyNewPaper();
		}
	}

	public Vector<Observer> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(Vector<Observer> subscribers) {
		this.subscribers = subscribers;
	}
}
