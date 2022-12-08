package com.bilgeadam.lesson023.polimorfizm;

public class Araba extends Arac {

	@Override
	public void ilerle() {
		System.out.println("Araba hareket ediyor");
	}

	@Override
	public void dur() {
		System.out.println("Araba duruyor");
	}
}
