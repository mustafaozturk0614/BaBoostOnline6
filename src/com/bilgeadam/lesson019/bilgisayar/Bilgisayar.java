package com.bilgeadam.lesson019.bilgisayar;

public class Bilgisayar {
	// bilgisayar bir donan�ma sahiptir bu kompozisyon

	// anakart bir donan�md�r buda kal�t�m
	Anakart anakart;
	HariciDonanim[] hariciDonanimlar;
	Kasa kasa;

	public Bilgisayar() {
		// TODO Auto-generated constructor stub
	}

	public Bilgisayar(Anakart anakart�m, HariciDonanim[] haricidonanimlarim, Kasa kasam) {

		anakart = anakart�m;
		hariciDonanimlar = haricidonanimlarim;
		kasa = kasam;

	}

}
