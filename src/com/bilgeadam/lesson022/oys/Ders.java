package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Ders {

	private int kontenjan;
	private String isim;
	private ArrayList<Ogretmen> ogretmenListesi;
	private ArrayList<Ogrenci> ogrenciListesi;

	public Ders(int kontenjan, String isim) {
		super();
		this.kontenjan = kontenjan;
		this.isim = isim;
		this.ogrenciListesi = new ArrayList<>();
		this.ogretmenListesi = new ArrayList<>();
	}

	public int getKontenjan() {
		return kontenjan;
	}

	public String getIsim() {
		return isim;
	}

	public ArrayList<Ogretmen> getOgretmenListesi() {
		return ogretmenListesi;
	}

	public ArrayList<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}

	public void setKontenjan(int kontenjan) {
		this.kontenjan = kontenjan;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setOgretmenListesi(ArrayList<Ogretmen> ogretmenListesi) {
		this.ogretmenListesi = ogretmenListesi;
	}

	public void setOgrenciListesi(ArrayList<Ogrenci> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}

}
