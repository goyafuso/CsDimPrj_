package EXAMPLES;

public class MessageStore {
	private String message;
	
	public MessageStore(){
		setMessage("Hello! From the Store Thing");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
