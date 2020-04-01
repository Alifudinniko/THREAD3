package com.d3ti.pbolanj.thread3;

public class EksekusiThread extends Thread{
	public EksekusiThread(String name) {
		super(name);
	}
	public static synchronized void display(String nama) {
		for(int i=1;i<6;i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("thread "+nama+" posisi: "+i);
		}
	}
	
	public void run() {
		display(getName());
	}

	public static void main(String args[]) {
		Thread L1 = new Thread(new EksekusiThread("L1"));
		Thread L3 = new Thread(new EksekusiThread("L3"));
		Thread L2 = new Thread(new interfaceThread("L2"));
		Thread L4 = new Thread(new interfaceThread("L4"));
	
		L1.start();
		L2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		L3.start();
		try {
			Thread.sleep(1000);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		L4.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
