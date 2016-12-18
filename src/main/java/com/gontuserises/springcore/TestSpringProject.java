package com.gontuserises.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by KV on 18/12/2016.
 */
public class TestSpringProject {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Restaruant restaruantObj = (Restaruant) context.getBean("restaruantBean");

		restaruantObj.greetCustomer();
	}


}
