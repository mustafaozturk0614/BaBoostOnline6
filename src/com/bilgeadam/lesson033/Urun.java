package com.bilgeadam.lesson033;

/*
 * 
 * �r�n s�n�f�==> isim fiyat ve int son kullanma tarihi 1970,2022
 * daha sonra 
 * urunManager ==> s�nf�� olustural�m 
 * bu s�n�fta urun yarata metodumuz olsun 
 * eger urun �sm� yoksa ve fiyat� 0ve 0dan kucuk ise null donecek 
 * bu kosullar�n aksinda bir urun olusturup onu donecegiz
 * 
 * 
 * 
 * 
 * 
 */
public class Urun {

	private String isim;
	private double fiyat;
	private int sonKullanamTarihi;

	public Urun(String isim, double fiyat, int sonKullanamTarihi) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.sonKullanamTarihi = sonKullanamTarihi;
	}

	public String getIsim() {
		return isim;
	}

	public double getFiyat() {
		// System.out.println(fiyat);
		return fiyat;
	}

	public int getSonKullanamTarihi() {
		return sonKullanamTarihi;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public void setSonKullanamTarihi(int sonKullanamTarihi) {
		this.sonKullanamTarihi = sonKullanamTarihi;
	}

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + ", sonKullanamTarihi=" + sonKullanamTarihi + "]";
	}

}
