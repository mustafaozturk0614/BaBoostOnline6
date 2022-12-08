package com.bilgeadam.lesson024.enumornek;

public class PizzaSiparis {
	/**
	 * 
	 * pizzam�z�n hamur tipini .boyutunu ve turunu secip bize bir pizza olarak d�nen
	 * metodu yazal�m ve pizzay� yazd�ral�m
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println(hamurTipiSec());

		// DI�ardan girilen string de�re g�re bize enumun degerini donuyor
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

		System.out.println("Pizza Sipari� Menusu");

	}

	public static EHamurTipi hamurTipiSec2(String tip) {
		return EHamurTipi.valueOf(tip);
	}

	public static EHamurTipi hamurTipiSec() {
		for (EHamurTipi tip : EHamurTipi.values()) {
			System.out.println((tip.ordinal() + 1) + "-" + tip);
		}

		int secim = Utility.intDegerAlma("L�tfen Hamur Tipi Secimi");

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
