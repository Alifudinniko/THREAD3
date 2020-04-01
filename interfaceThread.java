package com.d3ti.pbolanj.thread3;

public class interfaceThread extends ThreadUtama implements Runnable {
	String name;
	
	public interfaceThread (String name) {
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		jalan(name);
	}
	

}
