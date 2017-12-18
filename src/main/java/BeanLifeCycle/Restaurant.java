package BeanLifeCycle;

public class Restaurant {
	
	private String myMessage;

	public String getMyMessage() {
		return myMessage;
	}

	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}
	
	public void myInit(){
		System.out.println("Bean Init!!");
		
	}
	
	public void myDestroy(){
		System.out.println("Bean Destroy!!");
	}

}
