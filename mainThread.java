package com.d3ti.pbolanj.thread3;

class ThreadUtama {
	public void jalan(String name) {
		for(int i=1;i<6;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread "+name+" posisi: "+i);
		}
	}

}
