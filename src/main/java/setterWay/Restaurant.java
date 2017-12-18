package setterWay;

public class Restaurant {
	
	IHotDrink iHotDrink;	
	
	public IHotDrink getiHotDrink() {
		return iHotDrink;
	}

	public void setiHotDrink(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}
	public void RestaurantPrepareDrink(){
		this.iHotDrink.PrepareDrink();
	}
	
	

}
