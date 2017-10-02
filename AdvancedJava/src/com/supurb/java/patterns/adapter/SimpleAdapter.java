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
		
		PaymentTransaction pt = new PaymentTransaction();
		pt.setCardType(CardType.VISA);
		pt.setAmount((float)100.00);
		pt.setExpirationMonth(12);
		pt.setExpirationYear(2050);
		pt.setTransactionDate(Calendar.getInstance().getTime());
		if (pt.validateTransaction())
		{
			System.out.println(pt);
		}
		
		// now lets use the new paytype using the old 
		
		NewPay  np = new NewPaymentTransationAdapter(pt);
		System.out.println("New style");
		System.out.println(np);
	}

		
	
	
	
	
	

	
	
	
		
}
