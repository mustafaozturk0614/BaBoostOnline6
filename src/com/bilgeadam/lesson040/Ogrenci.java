package com.bilgeadam.lesson040;

import java.io.Serializable;

public class Ogrenci implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2826470125135260897L;

	private String isim;
	private int yas;

	public Ogrenci(String isim, int yas) {
		super();
		this.isim = isim;
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public int getYas() {
		return yas;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", yas=" + yas + "]";
	}

}
