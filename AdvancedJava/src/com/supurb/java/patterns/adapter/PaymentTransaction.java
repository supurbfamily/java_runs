package com.supurb.java.patterns.adapter;

import java.util.Calendar;
import java.util.Date;

public class PaymentTransaction implements OldPay{

	public PaymentTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	CardType cardType;
	int expirationMonth;
	int expirationYear;
	float amount;
	Date transactionDate;
	
	@Override
	public CardType getCardType() {
		return cardType;
	}

	@Override
	public int getExpirationMonth() {
		return expirationMonth;
	}

	@Override
	public int getExpirationYear() {
		return expirationYear;
	}

	@Override
	public float getAmount() {
		return amount;
	}

	@Override
	public Date getTransactionDate() {
		return transactionDate;
	}

	@Override
	public boolean setCardType(CardType c) {
		this.cardType = c;
		return false;
	}

	@Override
	public boolean setExpirationMonth(int month) {
		this.expirationMonth = month;
		return false;
	}

	@Override
	public boolean setExpirationYear(int year) {
		this.expirationYear = year;
		return false;
	}

	@Override
	public boolean setAmount(float amount) {
		this.amount = amount;
		return false;
	}

	@Override
	public boolean setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
		return false;
	}

	@Override
	public boolean validateTransaction() {
		// TODO Auto-generated method stub
		
		try {
			
			if (this.getAmount() > 0 &&
				 null!=	this.getCardType() &&
				 (this.getExpirationMonth() > 0 && this.getExpirationMonth() <= 12) &&
				 this.getExpirationYear() >= (Calendar.getInstance().get(Calendar.YEAR)-1900))
			{					
			 
				System.out.println("Validation Passed");
				return true;
			}
			else
			{
				System.out.println("Validation Failed ... check parameters");
				return true;
			}
		}
		catch (Exception e)
		{
			System.out.println("Validation Failed");
			System.out.println(e.getStackTrace());
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		return getCardType().toString() + "|" +
				getExpirationMonth() + "|" +
				getExpirationYear() + "|" +
				Float.toString(getAmount()) ;				
	}
}
