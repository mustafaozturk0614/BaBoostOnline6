package com.bilgeadam.lesson039.com.bilgeadam;

public class Yonetmen {

	private String isim;
	private String country;

	public Yonetmen(String isim, String country) {
		super();
		this.isim = isim;
		this.country = country;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Yonetmen [isim=" + isim + ", country=" + country + "]";
	}

}
