package com.bilgeadam.lesson022.oys;

public class Kisi {

	private String isim;
	private String soyisim;
	private String adres;

	public Kisi(String isim, String soyisim, String adres) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.adres = adres;
	}

	public Kisi(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public Kisi() {

	}

	public String getIsim() {
		return isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public String getAdres() {
		return adres;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public void menu() {
		System.out.println(isim + " O.Y.S  hoþgeldiniz");
	}

}
