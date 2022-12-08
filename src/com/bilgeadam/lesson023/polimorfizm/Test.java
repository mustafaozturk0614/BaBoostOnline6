package com.bilgeadam.lesson023.polimorfizm;

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

		Arac arac = new Arac();

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
		Bisiklet bisiklet = new Bisiklet();
		hareketEt(arac1);
		hareketEt(arac2);
//		
		hareketEt(arac3);
		hareketEt(bisiklet);
		hareketEt2(arac1);
		hareketEt2(arac2);
		hareketEt2(arac3);

		IHaraket haraket = new Bisiklet();

		hareketEt(haraket);

		sýnýfHaraketi = new Ucak();

		hareketEt(sýnýfHaraketi);

	}

	public static void hareketEt(IHaraket arac) {
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
