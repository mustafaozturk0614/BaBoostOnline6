package com.bilgeadam.lesson024.enumornek;

public class PizzaSiparis {
	/**
	 * 
	 * pizzamýzýn hamur tipini .boyutunu ve turunu secip bize bir pizza olarak dönen
	 * metodu yazalým ve pizzayý yazdýralým
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println(hamurTipiSec());

		// DIþardan girilen string deðre göre bize enumun degerini donuyor
		// System.out.println(EHamurTipi.valueOf("INCE"));

		// System.out.println(hamurTipiSec2("INCE"));

//		System.out.println(EHamurTipi.KALIN.name());
//		System.out.println(EHamurTipi.NORMAL.ordinal());
//		System.out.println(EHamurTipi.KALIN.toString());

//		EHamurTipi[] hamurtipleri = EHamurTipi.values();
//
//		for (EHamurTipi tip : hamurtipleri) {
//
//			System.out.println(tip);
//		}

		hamurTipiSec();
	}

	public void menu() {

		System.out.println("Pizza Sipariþ Menusu");

	}

	public static EHamurTipi hamurTipiSec2(String tip) {
		return EHamurTipi.valueOf(tip);
	}

	public static EHamurTipi hamurTipiSec() {
		for (EHamurTipi tip : EHamurTipi.values()) {
			System.out.println((tip.ordinal() + 1) + "-" + tip);
		}

		int secim = Utility.intDegerAlma("Lütfen Hamur Tipi Secimi");

		switch (secim) {
		case 1:
			return EHamurTipi.INCE;
		case 2:
			return EHamurTipi.NORMAL;
		case 3:
			return EHamurTipi.KALIN;
		default:
			return null;
		}

	}

}
