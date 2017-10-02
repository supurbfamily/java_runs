package com.supurb.java.patterns.adapter;

import java.util.Date;

/**
 * This is the old style that is implemented as Original
 * 
 * @author Subhojit
 *
 */
abstract interface OldPay {
	abstract CardType getCardType();
	abstract int getExpirationMonth();
	abstract int getExpirationYear();
	abstract float getAmount();
	abstract Date getTransactionDate();
	
	abstract boolean setCardType(CardType c);
	abstract boolean setExpirationMonth(int month);
	abstract boolean setExpirationYear(int year);
	abstract boolean setAmount(float amount);
	abstract boolean setTransactionDate(Date transactionDate);
	
	abstract boolean validateTransaction();
}
