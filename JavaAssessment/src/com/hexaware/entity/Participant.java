package com.hexaware.entity;

import com.hexaware.controller.IAdoptable;

public class Participant implements IAdoptable {
	private int participantId;
	private String participantName;
	private int eventId;
	
	
	public Participant() {
		
	}

	public Participant(int participantId, String participantName,int eventId) {
		super();
		this.participantId = participantId;
		this.participantName = participantName;
		this.eventId = eventId;
	}
	
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	

	@Override
	public String toString() {
		return "Participant [participantId=" + participantId + ", participantName=" + participantName + ", eventId="
				+ eventId + "]";
	}

	@Override
	public void adopt() {
		// TODO Auto-generated method stub
		
	}	
	
	
}
