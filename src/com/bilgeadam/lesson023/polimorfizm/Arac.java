package com.bilgeadam.lesson023.polimorfizm;

public class Arac implements IHaraket {

	@Override
	public void ilerle() {
		System.out.println("Arac haraket ediyor");

	}

	@Override
	public void dur() {
		System.out.println("Arac durdu");

	}

}
