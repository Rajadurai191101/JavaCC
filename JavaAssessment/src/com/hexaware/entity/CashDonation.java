package com.hexaware.entity;

import java.time.LocalDate;

public class CashDonation extends Donation {
	private LocalDate donationDate;

	public CashDonation(String donarName, float amount, LocalDate donationDate) {
		super(donarName, amount);
		this.donationDate = donationDate;
	}

	

	public LocalDate getDonationDate() {
		return donationDate;
	}



	public void setDonationDate(LocalDate donationDate) {
		this.donationDate = donationDate;
	}



	@Override
	void recordDonation() {
		System.out.println("Donar name"+getDonarName()+"\nAmout:"+getAmount()+"\nDate: "+getDonationDate());
		
	}
	
}
