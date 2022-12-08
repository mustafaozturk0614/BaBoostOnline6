package com.bilgeadam.lesson024.abstractornek;

/**
 * Polimorfizm final abstract // soyut sýnýf
 * 
 * 
 * 
 * 
 * @author musty
 *
 */
public class Test {

	static IHaraket sýnýfHaraketi;

	public static void main(String[] args) {

		// Arac arac = new Arac();

		Arac arac1 = new Ucak();

		Arac arac2 = new Araba();

//		arac.ilerle();
//		arac.dur();
//		arac1.ilerle();
//		arac1.dur();
//
//		arac2.ilerle();
//		arac2.dur();
//
//		arac3.ilerle();
//		arac3.dur();
		Arac arac3 = new Bisiklet();
		arac3.hýz = 20;
		arac2.hýz = 100;
		Bisiklet bisiklet = new Bisiklet();
		hareketEt(arac1);
		hareketEt(arac2);
		hareketEt(arac3);
		hareketEt(bisiklet);
		hareketEt2(arac1);
		hareketEt2(arac2);
		hareketEt2(arac3);

		arac2.hýzýGoster();
		arac3.hýzýGoster();

	}

	public static void hareketEt(Arac arac) {
		arac.ilerle();
	}

	public static void hareketEt2(Arac arac) {
		if (arac instanceof Bisiklet) {
			System.out.println("Bisiklet hareket ediyor");
		} else if (arac instanceof Araba) {
			System.out.println("Araba hareket ediyor");
		} else {
			System.out.println("Ucak hareket ediyor");
		}
	}

}
