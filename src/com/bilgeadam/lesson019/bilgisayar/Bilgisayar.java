package com.bilgeadam.lesson019.bilgisayar;

public class Bilgisayar {
	// bilgisayar bir donanıma sahiptir bu kompozisyon

	// anakart bir donanımdır buda kalıtım
	Anakart anakart;
	HariciDonanim[] hariciDonanimlar;
	Kasa kasa;

	public Bilgisayar() {
		// TODO Auto-generated constructor stub
	}

	public Bilgisayar(Anakart anakartım, HariciDonanim[] haricidonanimlarim, Kasa kasam) {

		anakart = anakartım;
		hariciDonanimlar = haricidonanimlarim;
		kasa = kasam;

	}

}
