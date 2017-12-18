package Tu01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
		Restaurant restaurantObj=(Restaurant) context.getBean("restaurantBean");
		restaurantObj.greetingCustomer();
		

	}

}
