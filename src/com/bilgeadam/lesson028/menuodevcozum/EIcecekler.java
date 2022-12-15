package com.bilgeadam.lesson028.menuodevcozum;

public enum EIcecekler {

	AYRAN(false), KOLA(false), FANTA(false), GAZOZ(false), MEYVESUYU(false), L�MONATA(false), ICETEA(false);

	boolean atandimi;

	EIcecekler(boolean atandimi) {
		this.atandimi = atandimi;
	}

	public boolean isAtandimi() {
		return atandimi;
	}

	public void setAtandimi(boolean atandimi) {
		this.atandimi = atandimi;
	}

}
