package com.bilgeadam.lesson035.sepet;

public enum EUrun {
	CIPS(20), KOLA(25), SEKER(30), YAG(90), UN(40.4), EKMEK(5), CAY(80), YUMURTA(20), YOGURT(30), SÜT(52);

	double fiyat;

	EUrun(double fiyat) {

		this.fiyat = fiyat;

	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}
