package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Okul {

	private String isim;
	private String adress;
	public final static ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();
	public final static ArrayList<Ogretmen> ogretmenListesi = new ArrayList<>();
	public final static ArrayList<Memur> memurListesi = new ArrayList<>();

	public Okul(String isim, String adress) {
		super();
		this.isim = isim;
		this.adress = adress;

	}

	public String getIsim() {
		return isim;
	}

	public String getAdress() {
		return adress;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
