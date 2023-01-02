package com.bilgeadam.lesson035.sepet;

public class Urun {

	private String isim;
	private double fiyat;

	public Urun() {

	}

	public Urun(String isim, double fiyat) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
	}

	public String getIsim() {
		return isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + "]";
	}

}
