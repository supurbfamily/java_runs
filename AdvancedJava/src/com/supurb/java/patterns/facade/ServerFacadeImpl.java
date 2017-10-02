package com.supurb.java.patterns.facade;

public class ServerFacadeImpl implements ServerFacade
{

	final ComplexFunctions cf;
	
	public ServerFacadeImpl(ComplexFunctions cs) {
		this.cf = cs;
	}

	@Override
	public boolean start() {
		cf.startBooting();
		cf.readSystemConfigFile();
		cf.init();
		cf.initializeContext();
		cf.initializeListeners();
		cf.createSystemObjects();

		return true;
	}

	@Override
	public boolean stop() {
		cf.releaseProcesses();
		cf.destory();
		cf.destroySystemObjects();
		cf.destoryListeners();
		cf.destoryContext();
		cf.shutdown();
		return true;
	}
	
	

}
