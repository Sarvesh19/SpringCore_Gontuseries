package constructorWay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorWay/springConfigConstruct.xml");
		Restaurant restaurantObj = (Restaurant) context.getBean("constructorBean");
		System.out.println(restaurantObj);
		Restaurant restaurantObj1 = (Restaurant) context.getBean("constructorBean");
		System.out.println(restaurantObj1);
		restaurantObj.RestaurantPrepareDrink();

	}
	
}
