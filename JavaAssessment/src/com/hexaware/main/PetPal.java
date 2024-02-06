package com.hexaware.main;

import java.util.Scanner;

import com.hexaware.controller.AdoptionEvent;
import com.hexaware.controller.PetShelter;
import com.hexaware.entity.Cat;
import com.hexaware.entity.Dog;
import com.hexaware.entity.Pet;

public class PetPal {

	public static void main(String[] args) {
		PetShelter ps = new PetShelter();
		AdoptionEvent ae = new AdoptionEvent();
		Pet dog = new Dog();
		Pet cat = new Cat();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("*********");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ps.addPet(dog);
				break;
			case 2:
				ps.addPet(cat);
				break;
			case 3:
				int id = sc.nextInt();
				ps.removePet(id);
				break;
			case 4:
				ps.listAvailablePet();
				break;
			case 5:
				ae.registerParticipant();
				break;
			case 6:
				ae.viewParticipant();
				break;
			case 7:
				ae.hostEvent();
				break;
			}
		}while(true);
		
	}

}
