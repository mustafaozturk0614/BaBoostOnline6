package com.bilgeadam.marathon2cozum.entity;

import java.time.LocalDate;

public class Kiralama {

	private int id;
	private Kitap kitap;
	private Musteri musteri;
	private Kasiyer kasiyer;
	private LocalDate date;

	public Kiralama(int id, Kitap kitap, Musteri musteri, Kasiyer kasiyer) {
		super();
		this.id = id;
		this.kitap = kitap;
		this.musteri = musteri;
		this.kasiyer = kasiyer;
		this.date = LocalDate.now();
	}

	public int getId() {
		return id;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public Kasiyer getKasiyer() {
		return kasiyer;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public void setKasiyer(Kasiyer kasiyer) {
		this.kasiyer = kasiyer;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Kiralama [id=" + id + ", kitap=" + kitap + ", musteri=" + musteri + ", kasiyer=" + kasiyer + ", date="
				+ date + "]";
	}

}
