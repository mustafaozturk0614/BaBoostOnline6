package com.bilgeadam.lesson023.polimorfizm;

public class Ucak extends Arac implements IUcabilir {

	@Override
	public void ilerle() {
		System.out.println("U�ak haraket ediyor");

	}

	@Override
	public void dur() {
		System.out.println("U�ak durdu");

	}

	@Override
	public void uc() {
		// TODO Auto-generated method stub

	}

}
