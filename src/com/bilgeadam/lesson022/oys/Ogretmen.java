package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Ogretmen extends Calisan {

	private ArrayList<Ders> dersListesi;
	private boolean nobetciMi;

	public Ogretmen(String isim, String soyisim) {
		super(isim, soyisim);

	}

	public Ogretmen(String isim, String soyisim, double maas, int calismaSaati) {
		super(isim, soyisim, maas, calismaSaati);

	}

	public ArrayList<Ders> getDersListesi() {

		if (dersListesi == null) {
			this.dersListesi = new ArrayList<>();
		}

		return dersListesi;
	}

	public boolean isNobetciMi() {
		return nobetciMi;
	}

	public void setDersListesi(ArrayList<Ders> dersListesi) {
		this.dersListesi = dersListesi;
	}

	public void setNobetciMi(boolean nobetciMi) {
		this.nobetciMi = nobetciMi;
	}

}
