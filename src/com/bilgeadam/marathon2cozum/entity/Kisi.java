package com.bilgeadam.marathon2cozum.entity;

public abstract class Kisi {

	private int id;
	private String isim;

	public Kisi(int id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
	}

	public int getId() {
		return id;
	}

	public String getIsim() {
		return isim;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Kisi [id=" + id + ", isim=" + isim + "]";
	}

}
