package com.gontuserises.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaruant implements InitializingBean, DisposableBean {

	public void greetCustomer(){
		System.out.println("Wellcome dear customer!! This is the LifeCycle demo");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Restaruant Bean is going through afterPropertiesSet");
	}

	public void destroy() throws Exception {
		System.out.println("Restaruant Bean is destroying now");
	}
}
