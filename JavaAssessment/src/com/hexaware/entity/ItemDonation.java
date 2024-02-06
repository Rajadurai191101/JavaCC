package com.hexaware.entity;

public class ItemDonation extends Donation {
	private String itemType;

	public ItemDonation(String donarName, float amount, String itemType) {
		super(donarName, amount);
		this.itemType = itemType;
	}
	

	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	@Override
	void recordDonation() {
		System.out.println("Donar name"+getDonarName()+"\nAmout:"+getAmount()+"\nItemType: "+getItemType());

		
	}
	
}
