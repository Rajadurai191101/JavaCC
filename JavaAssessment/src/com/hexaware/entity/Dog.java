package com.hexaware.entity;

public class Dog extends Pet {
	private String dogBreed;

	public Dog(String dogBreed) {
		super();
		this.dogBreed = dogBreed;
	}


	public Dog() {
		// TODO Auto-generated constructor stub
	}


	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

}
