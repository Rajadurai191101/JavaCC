package com.hexaware.entity;

public abstract class Donation {
	private String donarName;
	private float Amount;
	
	public Donation(String donarName, float amount) {
		super();
		this.donarName = donarName;
		Amount = amount;
	}



	public String getDonarName() {
		return donarName;
	}



	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}



	public float getAmount() {
		return Amount;
	}



	public void setAmount(float amount) {
		Amount = amount;
	}



	abstract void recordDonation();
}
