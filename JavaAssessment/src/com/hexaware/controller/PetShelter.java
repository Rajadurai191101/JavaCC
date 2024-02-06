package com.hexaware.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.PetShelterDAO;
import com.hexaware.entity.Pet;

public class PetShelter {
	PetShelterDAO pdao = new PetShelterDAO();
	public List<Pet> availablePets = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Pet pet;
	
	public void addPet(Pet pet) {
		pet = new Pet();
		
		System.out.println("Enter Pet Name: ");
		String pname = sc.next();
		pet.setName(pname);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		pet.setAge(age);
		System.out.println("Enter Breed: ");
		String breed =sc.next();
		pet.setBreed(breed);
		System.out.println("Enter Color");
		String color = sc.next();
		pet.setColor(color);
		
		availablePets.add(pet);
		System.out.println(availablePets);
		pdao.addPet(pet);
	}
	
	public void removePet(int id) {
		Iterator<Pet> it = availablePets.iterator();
		while(it.hasNext()) {
			Pet pet = (Pet) it.next();
			if(pet.getId() == id) {
				it.remove();
			}
		}
		pdao.removePet(id);
	}
	
	public void listAvailablePet() {
		for(Pet pet : availablePets) {
			System.out.println(pet);
		}
		pdao.listPet();
	}

}
