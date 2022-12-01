package com.bilgeadam.lesson019.bilgisayar;

public class Test {

	public static void main(String[] args) {

		Islemci ýslemci = new Islemci();
		ýslemci.hýz = 200;
		Ram ram = new Ram();
		Anakart anakart = new Anakart(ýslemci, ram);
		Klavye klavye = new Klavye();
		Mouse mouse = new Mouse();
		Monitor monitor = new Monitor();
		Kasa kasa = new Kasa();
		HariciDonanim[] hariciDonanims = new HariciDonanim[15];
		hariciDonanims[0] = mouse;
		hariciDonanims[1] = monitor;
		hariciDonanims[2] = klavye;

		Bilgisayar bilgisayar = new Bilgisayar(anakart, hariciDonanims, kasa);

		System.out.println(bilgisayar.anakart);
		System.out.println(bilgisayar.kasa);
		System.out.println(bilgisayar.hariciDonanimlar[0]);
		System.out.println(bilgisayar.hariciDonanimlar[1]);
		System.out.println(bilgisayar.hariciDonanimlar[2]);
		System.out.println(bilgisayar.anakart.islemci.hýz);

	}

}
