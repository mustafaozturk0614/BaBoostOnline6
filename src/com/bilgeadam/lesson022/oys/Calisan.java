package com.bilgeadam.lesson022.oys;

public class Calisan extends Kisi {

	private String sicilNo;

	private int calismaSaati;

	private double maas;

	public Calisan(String isim, String soyisim) {
		super(isim, soyisim);

	}

	public Calisan(String isim, String soyisim, double maas, int calismaSaati) {
		super(isim, soyisim);
		this.maas = maas;
		this.calismaSaati = calismaSaati;

	}

	public String getSicilNo() {
		return sicilNo;
	}

	public int getCalismaSaati() {
		return calismaSaati;
	}

	public double getMaas() {
		return maas;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}

	public void setCalismaSaati(int calismaSaati) {
		this.calismaSaati = calismaSaati;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

}
