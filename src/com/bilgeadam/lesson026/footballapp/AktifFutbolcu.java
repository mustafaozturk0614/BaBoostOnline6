package com.bilgeadam.lesson026.footballapp;

public abstract class AktifFutbolcu extends Futbolcu {

	public AktifFutbolcu(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);

	}

	public boolean pasVer() {
		int pasSkor = pasSkor();

		if (pasSkor > 68) {

			return true;
		} else {

			return false;
		}
	}

	public boolean golVurusu(int kurtaris) {
		int golSkor = golSkor(kurtaris);

		if (golSkor > 68) {

			return true;
		} else {

			return false;
		}
	}

	public abstract int pasSkor();

	public abstract int golSkor(int kurtaris);

}
