package com.hexaware.entity;

public class Cat extends Pet{
	private String catColor;
	
	//Constructor
	public Cat(String catColor) {
		super();
		this.catColor = catColor;
	}

	
	public Cat() {
		// TODO Auto-generated constructor stub
	}


	//Getters and Setters
	public String getCatColor() {
		return catColor;
	}
	
	public void setCatColor(String catColor) {
		this.catColor = catColor;
	}


	@Override
	public String toString() {
		return "Cat [catColor=" + catColor + "]";
	}
	
	
}
