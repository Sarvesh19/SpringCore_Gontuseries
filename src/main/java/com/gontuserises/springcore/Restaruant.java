package com.gontuserises.springcore;

import org.apache.regexp.RE;

/**
 * Created by KV on 18/12/2016.
 */
public class Restaruant {
	IHotDrink hotDrink;

	public Restaruant(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
	}
}
