package CollectioInject;

import java.util.List;

public class Restaurant {
	
	private List<String> waitersList;

	public List<String> getWaitersList() {
		return waitersList;
	}

	public void setWaitersList(List<String> waitersList) {
		this.waitersList = waitersList;
	}
	
	public void waiterList(){
		System.out.println("The waiter name list:"+this.waitersList);
	}

}
