package Tu01;

public class Restaurant {
	
	private String welcomeMessage;
	
	
	public void greetingCustomer(){
		System.out.println(this.getWelcomeMessage());
	}


	public String getWelcomeMessage() {
		return welcomeMessage;
	}


	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

}
