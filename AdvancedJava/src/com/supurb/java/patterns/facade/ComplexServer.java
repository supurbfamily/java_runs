package com.supurb.java.patterns.facade;

public class ComplexServer implements ComplexFunctions {

	//start up
	
	public ComplexServer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean startBooting() {
		System.out.println("Server Booting ... ");
		return false;
	}

	@Override
	public boolean readSystemConfigFile() {
		System.out.println("Reading config file ... ");
		return false;
	}

	@Override
	public boolean init() {
		System.out.println("System Initiallizing ... ");
		return false;
	}

	@Override
	public boolean initializeContext() {
		System.out.println("*** Initializing context ... ");
		return false;
	}

	@Override
	public boolean initializeListeners() {
		System.out.println("*** initializing listeners");
		return false;
	}

	@Override
	public boolean createSystemObjects() {
		System.out.println("Creating system Objects ... ");
		return false;
	}

	// shutdown
	
	@Override
	public boolean releaseProcesses() {
		System.out.println("Releasing Objects ... ");
		return false;
	}

	@Override
	public boolean destory() {
		System.out.println("Starting Destruction process ... ");
		return false;
	}

	@Override
	public boolean destroySystemObjects() {
		System.out.println("*** Destrying Objects ... ");
		return false;
	}

	@Override
	public boolean destoryListeners() {
		System.out.println("***destroying Listeners ... ");
		return false;
	}

	@Override
	public boolean destoryContext() {
		System.out.println("Releaseing context ... ");
		return false;
	}

	@Override
	public boolean shutdown() {
		System.out.println("Shutting down ... ");
		return false;
	}

}
