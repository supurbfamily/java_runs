package com.supurb.java.patterns.adapter;

import java.util.Date;

import com.supurb.java.patterns.adapter.CardType;

/**
 * New Contracct for the new pay mechanism that needs to be used.
 * 
 * @author Subhojit
 *
 */
abstract interface NewPay {
	abstract CardType getCardType();
	abstract String getExpirationMonthYear4Digits();
	abstract float getPayAmount();
	abstract Date getPayDate();
	
	abstract boolean setCardType(CardType c);
	abstract boolean setgetExpirationMonthYear4Digits(int month, int year);
	abstract boolean setPayAmount(float amount);
	abstract boolean setPayDate(Date transactionDate);
	
	abstract boolean validatePay();
}