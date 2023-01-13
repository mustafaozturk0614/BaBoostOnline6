package com.bilgeadam.marathon2cozum.entity;

public class Kitap {

	private long id;
	private String name;
	private boolean kiradaMi;

	public Kitap(long id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.kiradaMi = false;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isKiradaMi() {
		return kiradaMi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKiradaMi(boolean kiradaMi) {
		this.kiradaMi = kiradaMi;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", name=" + name + ", kiradaMi=" + kiradaMi + "]";
	}

}
