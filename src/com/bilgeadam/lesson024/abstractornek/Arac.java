package com.bilgeadam.lesson024.abstractornek;

public abstract class Arac {

	double hız;

	public void hızıGoster() {

		System.out.println("Aracınızın hızı= " + hız);
	}

	public abstract void ilerle();

	public abstract void dur();

}
