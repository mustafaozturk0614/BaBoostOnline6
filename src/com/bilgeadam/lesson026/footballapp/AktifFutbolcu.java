package com.bilgeadam.lesson026.footballapp;

public abstract class AktifFutbolcu extends Futbolcu {

	public AktifFutbolcu(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);

	}

	public boolean pasVer() {
		int pasSkor = pasSkor();
		System.out.println("passkoru= " + pasSkor);
		if (pasSkor > 65) {
			System.out.println("Baþarýlý Pas");
			return true;
		} else {
			System.out.println("Baþarýsýz Pas");
			return false;
		}
	}

	public abstract int pasSkor();

}
