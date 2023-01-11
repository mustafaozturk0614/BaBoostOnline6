package com.bilgeadam.lesson041;

public class Calisan extends Thread {

	String name;

	public Calisan(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " çalýþýyor---->" + (i + 1));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void calýs() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " calýþ metodu==>" + (i + 1));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
