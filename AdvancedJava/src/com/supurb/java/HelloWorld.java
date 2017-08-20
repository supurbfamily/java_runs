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
	}

}
