package com.bilgeadam.lesson022.calısan;

public class InsanKaynakları extends Calisan implements IInsanKaynaklari {

	public InsanKaynakları(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);

	}

	public InsanKaynakları(String isim, String soyisim) {
		super(isim, soyisim);

	}

	@Override
	public void zamYap(Calisan calisan, double zamOranı) {

		double zamliUcret = calisan.getMaas() + (calisan.getMaas() * zamOranı / 100) + calisan.getBonus();

		// 1. yöntem
//		if (calisan.getClass().getSimpleName().equals("Muhendis")) {
//
//			zamliUcret += 250;
//		}
		// 2.yöntem
//		if (calisan.getUnvan().contains("Muhendis")) {
//
//			zamliUcret += 250;
//		}

		calisan.setMaas(zamliUcret);

	}

	@Override
	public void unvanBelirle() {
		// TODO Auto-generated method stub

	}
}
