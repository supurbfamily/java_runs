package com.supurb.java.patterns.facade;

public class SimpleFacadeRunner {

	
	public static void main(String[] args) {
		
		// regular style needs calling plenty of steps in particular order
		ComplexFunctions cf = new ComplexServer();
		
		//starting server ... need to remember the order and all the calls
		
		System.out.println("................ starting Server!!!");

		cf.startBooting();
		cf.readSystemConfigFile();
		cf.init();
		cf.initializeContext();
		cf.initializeListeners();
		cf.createSystemObjects();
		
		// Shut down ... need to remember the order and all the calls
		System.out.println("................ starting shutdown!!!");

		cf.releaseProcesses();
		cf.destory();
		cf.destroySystemObjects();
		cf.destoryListeners();
		cf.destoryContext();
		cf.shutdown();
		
		// Using Facade ... simplifies the calls and removes complexity ... 
		// the caller does not have to remember the complex order of operations. Phew!!!
		
		ServerFacade sf = new ServerFacadeImpl(cf);
		
		System.out.println("................ starting Server using facade!!!");
		sf.start(); // START
		
		System.out.println("................ starting SHUTDOWN using facade!!!");
		sf.stop(); // STOP
	}
	
}
