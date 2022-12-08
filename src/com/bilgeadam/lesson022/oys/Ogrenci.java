package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Ogrenci extends Kisi {

	private String okulNo;

	private static int index;

	private double notOrt;

	private ArrayList<Ders> dersListesi;

	public Ogrenci(String isim, String soyisim, String adres) {
		super(isim, soyisim, adres);
		this.dersListesi = new ArrayList<>();
		okulNoAta();
	}

	public Ogrenci(String isim, String soyisim) {
		super(isim, soyisim);
		this.dersListesi = new ArrayList<>();
		okulNoAta();
	}

	public String getOkulNo() {
		return okulNo;
	}

	public double getNotOrt() {
		return notOrt;
	}

	public ArrayList<Ders> getDersListesi() {

		return dersListesi;
	}

	public void setOkulNo(String okulNo) {
		this.okulNo = okulNo;
	}

	public void setNotOrt(double notOrt) {
		this.notOrt = notOrt;
	}

	public void setDersListesi(ArrayList<Ders> dersListesi) {
		this.dersListesi = dersListesi;
	}

	public void okulNoAta() {

		index++;

		this.okulNo = "Ö-" + index;
	}

	@Override
	public void menu() {
		super.menu();
		System.out.println("1-Ders Kaydý Yap");
		System.out.println("2-Not ortalamasý görüntüle");
		System.out.println("3-Aldýðým dersleri listele");
	}

	@Override
	public String toString() {
		return "Ogrenci [okulNo=" + okulNo + ", notOrt=" + notOrt + ", getIsim()=" + getIsim() + ", getSoyisim()="
				+ getSoyisim() + "]";
	}

}
