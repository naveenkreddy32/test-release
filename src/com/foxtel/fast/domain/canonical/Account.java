package com.foxtel.fast.domain.canonical;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -3288687852094313952L;
	
	public String accountNo;
	public String collectionStatus;
	public String state;
	public String postalcode;
	public String rateClassDefault;

	
	public Account() {}



	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCollectionStatus() {
		return collectionStatus;
	}

	public void setCollectionStatus(String collectionStatus) {
		this.collectionStatus = collectionStatus;
	}

	public String getRateClassDefault() {
		return rateClassDefault;
	}

	public void setRateClassDefault(String rateClassDefault) {
		this.rateClassDefault = rateClassDefault;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
}
