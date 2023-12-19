package entities;

import messages.Inbox;
import messages.Message;
import messages.Order;
import messages.Priority;

public abstract class Employee extends User {
	private Inbox inbox;
	
	public Employee() {
		
	}
	
	public Employee(String userId, Login login, String email, String name, String surname, Inbox inbox) {
		super(userId, login, email, name, surname);
        this.inbox = inbox;
    }
	
	public Inbox getInbox() {
        return inbox;
    }
	
	public void sendMessages(String title, String message, Employee recipient) {
		Message newMessage = new Message(title, message, recipient, this);
		recipient.getInbox().getReceivedMessages().add(newMessage);
        this.inbox.getSentMessages().add(newMessage);
	}
	
	public void sendRequest(String title, String message, Employee recipient, Priority priority) {
		//hz	
        
	}
	
	public void sendOrder(String title, String message, TechSupport techSupport) {
		Order order = new Order(title, message, techSupport, this);
        techSupport.addOrder(order);
    }
		
}

