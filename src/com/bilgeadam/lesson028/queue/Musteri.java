package com.bilgeadam.lesson028.queue;

public class Musteri implements Comparable<Musteri> {

	private String isim;
	private int yas;
	int id;

	public Musteri(String isim, int yas, int id) {
		super();
		this.isim = isim;
		this.yas = yas;
		this.id = id;
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
		return "Musteri [isim=" + isim + ", yas=" + yas + " hascode=" + hashCode() + "id=" + id + "]";
	}

	@Override
	public int compareTo(Musteri o) {

		if (o.getYas() >= 65) {

			return 1;

		}
		return -1;

	}

}
