package com.supurb.java.patterns.facade;

abstract public interface ComplexFunctions {
	boolean startBooting();
	boolean readSystemConfigFile();
	boolean init();
	boolean initializeContext();
	boolean initializeListeners();
	boolean createSystemObjects(); 
	
	boolean releaseProcesses();
	boolean destory();
	boolean destroySystemObjects();
	boolean destoryListeners();
	boolean destoryContext();
	boolean shutdown();
}
