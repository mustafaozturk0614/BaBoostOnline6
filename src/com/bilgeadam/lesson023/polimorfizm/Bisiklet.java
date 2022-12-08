package com.bilgeadam.lesson023.polimorfizm;

public class Bisiklet extends Arac implements IBinilebilir {

	@Override
	public void ilerle() {
		System.out.println("Bisiklet hareket ediyor");

	}

	@Override
	public void dur() {
		System.out.println("Bisiklet  duruyor");

	}

	@Override
	public void bin() {
		// TODO Auto-generated method stub

	}

}
