package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanLifeCycle/springConfig.xml");
		
		((AbstractApplicationContext)context).registerShutdownHook();//this line here to shutdown the bean cycle
		
		Restaurant res=(Restaurant) context.getBean("restaurantBean");
		System.out.println(res.getMyMessage());
		
		
		

	}

}
