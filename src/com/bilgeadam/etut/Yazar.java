package com.bilgeadam.etut;

import java.util.ArrayList;
import java.util.List;

public class Yazar {
	private int id;
	private String isimSoyisim;
	private int yas;
	List<Kitap> kitaplar;

	public Yazar(String isimSoyisim, int yas) {
		super();
		this.isimSoyisim = isimSoyisim;
		this.yas = yas;
		this.id = Utility.yazarId + 1;
		this.kitaplar = new ArrayList<>();

	}

	public List<Kitap> getKitaplar() {
		return kitaplar;
	}

	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}

	public String getisimSoyisim() {
		return isimSoyisim;
	}

	public int getYas() {
		return yas;
	}

	public void setisimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Yazar [id=" + id + ", isimSoyisim=" + isimSoyisim + ", yas=" + yas + "]";
	}

}
