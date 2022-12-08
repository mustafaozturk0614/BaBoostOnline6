package com.bilgeadam.lesson024.abstractornek;

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
