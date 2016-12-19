package com.gontuserises.springcore;


public class Restaruant {

	public String wellcomeNote;

	public void setWellcomeNote(String wellcomeNote) {
		this.wellcomeNote = wellcomeNote;
	}

	public void greetCustomer(){
		System.out.println(wellcomeNote);
	}
}
