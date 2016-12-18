package com.gontuserises.springcore;


import java.util.List;

/**
 * Created by KV on 18/12/2016.
 */
public class Restaruant {
	private List restaruantWaiterList;

	public void setRestaruantWaiterList(List restaruantWaiterList) {
		this.restaruantWaiterList = restaruantWaiterList;
	}

	public void displayWaiterNames(){
		System.out.println("All waiter working in Restaruant: " + restaruantWaiterList);
	}
}
