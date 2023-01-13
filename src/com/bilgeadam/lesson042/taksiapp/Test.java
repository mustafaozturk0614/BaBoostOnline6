package com.bilgeadam.lesson042.taksiapp;

public class Test {

	public static void main(String[] args) {

		Durak durak = new Durak();

		durak.taksiler.forEach(x -> x.start());

	}

}
