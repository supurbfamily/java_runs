/**
 * 
 */
package com.supurb.java.patterns.adapter;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Subhojit
 *
 */
public class SimpleAdapter {

	/**
	 * 
	 */
	
	PaymentTransaction pt;
	
	public SimpleAdapter() {
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create new transaction
		
		OldPay oP = new PaymentTransaction();
		oP.setCardType(CardType.VISA);
		oP.setAmount((float)100.00);
		oP.setExpirationMonth(12);
		oP.setExpirationYear(2050);
		oP.setTransactionDate(Calendar.getInstance().getTime());
		if (oP.validateTransaction())
		{
			System.out.println(oP);
		}
		
		// now lets use the new paytype using the old 
		
		NewPay  np = new NewPaymentTransationAdapter(oP);
		System.out.println("New style");
		System.out.println(np);
	}

		
	
	
	
	
	

	
	
	
		
}
