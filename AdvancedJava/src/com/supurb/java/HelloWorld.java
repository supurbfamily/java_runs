package com.supurb.java;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This i a simple Hello world class to check-out Git
 * @author Subhojit
 *
 */

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world ... this is my first file commit to git");
		Logger myLogger =  Logger.getLogger("Subhojit's Logger");
		myLogger.log(Level.INFO, "THis is my first calss with a logger in Git branch");
		System.out.println("Wow! it worked.");
		System.out.println("This should not be in the main, but in the branch");
		System.out.println("One more time ... fixed config");
		/* Lets see where it goes */
		System.out.println("This goes to master");
		/* this is the real test now that I have setup the local bracnhes appropriately and mapeed them to git */
	}

}
