package com.hexaware.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.EventDAO;
import com.hexaware.dao.ParticipantDAO;
import com.hexaware.entity.Participant;

public class AdoptionEvent{

	public List<IAdoptable> participants = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Participant part = new Participant();
	ParticipantDAO partdao = new ParticipantDAO();
	EventDAO edao = new EventDAO();
	public void hostEvent() {
		edao.showEvent();
	}
	
	public void registerParticipant() {
		part = new Participant();
		System.out.println("Enter Participant Name: ");
		String partName = sc.next();
		part.setParticipantName(partName);
		System.out.println("Enter event id:");
		int eid = sc.nextInt();
		part.setEventId(eid);
		
		participants.add(part);
		partdao.addPart(part);
	}
	
	public void viewParticipant() {
		
		for(IAdoptable part : participants) {
			System.out.println(part);
		}
		partdao.showPart();
	}

}
