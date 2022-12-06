package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Okul {

	private String isim;
	private String adress;
	private ArrayList<Ogrenci> ogrenciListesi;
	private ArrayList<Ogretmen> ogretmenListesi;
	private ArrayList<Memur> memurListesi;

	public Okul(String isim, String adress) {
		super();
		this.isim = isim;
		this.adress = adress;
		this.ogrenciListesi = new ArrayList<>();
		this.ogretmenListesi = new ArrayList<>();
		this.memurListesi = new ArrayList<>();
	}

	public String getIsim() {
		return isim;
	}

	public String getAdress() {
		return adress;
	}

	public ArrayList<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}

	public ArrayList<Ogretmen> getOgretmenListesi() {
		return ogretmenListesi;
	}

	public ArrayList<Memur> getMemurListesi() {
		return memurListesi;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setOgrenciListesi(ArrayList<Ogrenci> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}

	public void setOgretmenListesi(ArrayList<Ogretmen> ogretmenListesi) {
		this.ogretmenListesi = ogretmenListesi;
	}

	public void setMemurListesi(ArrayList<Memur> memurListesi) {
		this.memurListesi = memurListesi;
	}

}
