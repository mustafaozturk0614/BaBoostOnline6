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
		PizzaSiparis pizzaSiparis = new PizzaSiparis();
		System.out.println(pizzaSiparis.boyutuSec());

//		hamurTipiSec();
	}

	public void menu() {
		System.out.println("Pizza Sipariþ Menusu");
		Pizza pizza = pizzaSec();
		siparisHazýrlama(pizza);
	}

	public Pizza pizzaSec() {
		ETur tur = turSec();
		EBoyut boyut = boyutuSec();
		EHamurTipi hamurTipi = hamurTipiSec();
		Pizza pizza = new Pizza(tur, boyut, hamurTipi);
		return pizza;
	}

	public void siparisHazýrlama(Pizza pizza) {
		System.out.println("Siparisþiniz ==>" + pizza.toString());
		System.out.println("Hazýrlanýyor .....");
	}

	public ETur turSec() {
		for (ETur tur : ETur.values()) {
			System.out.println((tur.ordinal() + 1) + "-" + tur);
		}
		int secim = Utility.intDegerAlma("Lütfen bir pizza türü seciniz");

		switch (secim) {
		case 1:
			return ETur.TONBALIKLI;
		case 2:
			return ETur.KARISIK;
		case 3:
			return ETur.AKDENÝZ;
		default:
			return null;
		}

	}

	public EBoyut boyutuSec() {
		for (EBoyut boyut : EBoyut.values()) {
			System.out.println((boyut.ordinal() + 1) + "-" + boyut);// 1- KUCUK 2-Orta 3-buyuk
		}

		int secim = Utility.intDegerAlma("Lütfen Pizza boyutunu seciniz");
//		switch (secim) {
//		case 1:
//			return EBoyut.KUCUK;
//		case 2:
//			return EBoyut.ORTA;
//		case 3:
//			return EBoyut.BUYUK;
//		default:
//			return null;
//		}

		return EBoyut.values()[secim - 1];

	}

	public EHamurTipi hamurTipiSec() {
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
