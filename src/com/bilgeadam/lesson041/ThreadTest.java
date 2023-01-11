package com.bilgeadam.lesson041;

public class ThreadTest {

	public static void main(String[] args) {

		Calisan calisan1 = new Calisan("Mustafa");
		Calisan calisan2 = new Calisan("Ece");

		calisan1.start();
		calisan2.start();
		calisan1.calıs();
		calisan2.calıs();

	}
}
