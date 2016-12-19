package com.gontuserises.springcore;


public class Restaruant {

	public void greetCustomer(){
		System.out.println("Wellcome dear customer!! This is the LifeCycle demo");
	}

	public void init(){
		System.out.println("Restaruant Bean is going through init");
	}

	public void destroy(){
		System.out.println("Bean will destroy now");
	}
}
