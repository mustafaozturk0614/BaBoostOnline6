package com.bilgeadam.lesson022.cal�san;

public class InsanKaynaklar� extends Calisan implements IInsanKaynaklari {

	public InsanKaynaklar�(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);

	}

	public InsanKaynaklar�(String isim, String soyisim) {
		super(isim, soyisim);

	}

	@Override
	public void zamYap(Calisan calisan, double zamOran�) {

		double zamliUcret = calisan.getMaas() + (calisan.getMaas() * zamOran� / 100) + calisan.getBonus();

		// 1. y�ntem
//		if (calisan.getClass().getSimpleName().equals("Muhendis")) {
//
//			zamliUcret += 250;
//		}
		// 2.y�ntem
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
