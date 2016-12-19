package com.gontuserises.springcore;


public class Restaruant {

	String wellcomeNote;

	public void setWellcomeNote(String wellcomeNote) {
		this.wellcomeNote = wellcomeNote;
	}

	public void greetCustomer(){
		System.out.println(wellcomeNote);
	}

}
