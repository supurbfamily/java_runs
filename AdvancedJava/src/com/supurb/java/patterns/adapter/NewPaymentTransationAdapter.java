package com.supurb.java.patterns.adapter;

import java.util.Calendar;
import java.util.Date;

import com.supurb.java.patterns.adapter.CardType;
import com.supurb.java.patterns.adapter.OldPay;

/**
 * New pay implementation
 * 
 * @author Subhojit
 *
 */
public class NewPaymentTransationAdapter implements NewPay{

	CardType cardType;
	int expirationMonth;
	int expirationYear;
	float amount;
	Date transactionDate;
	
	private final OldPay oldPay;
	
	
	
	public NewPaymentTransationAdapter(OldPay oldPay) {
		this.oldPay = oldPay;
		setProperties();
	}

	private void setProperties() {
		this.setCardType(oldPay.getCardType());
		this.setgetExpirationMonthYear4Digits(oldPay.getExpirationMonth(), oldPay.getExpirationYear());
		this.setPayAmount(oldPay.getAmount());
		this.setPayDate(oldPay.getTransactionDate());
	}

	@Override
	public CardType getCardType() {
		return this.cardType;
	}

	@Override
	public String getExpirationMonthYear4Digits() {
		return Integer.toString(this.expirationMonth) +""+ Integer.toString(this.expirationYear).substring(2, 4);
	}

	@Override
	public float getPayAmount() {
		return this.amount;
	}

	@Override
	public Date getPayDate() {
		return this.transactionDate;
	}

	@Override
	public boolean setCardType(CardType c) {
		this.cardType = c;
		return true;
	}

	@Override
	public boolean setgetExpirationMonthYear4Digits(int month, int year) {
		this.expirationMonth = month;
		this.expirationYear = year;
		return true;
	}

	@Override
	public boolean setPayAmount(float amount) {
		this.amount = amount;
		return true;
	}

	@Override
	public boolean setPayDate(Date transactionDate) {
		this.transactionDate = transactionDate;
		return false;
	}

	@Override
	public boolean validatePay() {

		try {
			
			if (this.getPayAmount() > 0 &&
				 null!=	this.getCardType() &&
				 (this.getExpirationMonth() > 0 && this.getExpirationMonth() <= 12) &&
				 this.getExpirationYear() >= (Calendar.getInstance().get(Calendar.YEAR)-1900))
			{					
			 
				System.out.println("New Validation Passed");
				return true;
			}
			else
			{
				System.out.println("New Validation Failed ... check parameters");
				return true;
			}
		}
		catch (Exception e)
		{
			System.out.println("New Validation Failed");
			System.out.println(e.getStackTrace());
		}
		
		return false;
	}

	private int getExpirationYear() {
		return this.expirationYear;
	}

	private int getExpirationMonth() {
		// TODO Auto-generated method stub
		return this.expirationMonth;
	}
	
	@Override
	public String toString() {
		return getCardType().toString() + "|" +
				getExpirationMonthYear4Digits() + "|" +
				Float.toString(getPayAmount()) ;				
	}
	
}
