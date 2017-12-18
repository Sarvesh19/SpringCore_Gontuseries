package setterWay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("setterWay/springConfigSetter.xml");
		Restaurant restaurantObj = (Restaurant) context.getBean("setterBean");
		restaurantObj.RestaurantPrepareDrink();	

	}

}
