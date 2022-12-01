package com.bilgeadam.lesson019.bilgisayar;

public class Anakart extends DahiliDonanim {

	Islemci islemci;
	Ram ram;

	public Anakart() {
		// TODO Auto-generated constructor stub
	}

	public Anakart(Islemci islemcim, Ram ramim) {
		islemci = islemcim;
		ram = ramim;

	}

	public Anakart(Islemci islemcim) {
		islemci = islemcim;
	}
}
