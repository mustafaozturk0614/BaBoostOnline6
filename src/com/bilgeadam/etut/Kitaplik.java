package com.bilgeadam.etut;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Kitap listesi=> Arraylist kitap.yazar; for dongusunde donerken dýsardan
 * aldýgým yazar isimini listedekei yazar simi ile karþýlastýrýrý eþit ise
 * donerim
 * 
 * 
 *
 * YazaraGorekitapalistesi=> Map ismiGoreKitapListesi=>Map <ýsim kitaplistsi>
 * 
 * yazarListesi set olarak tutalým
 * 
 * 
 */
public class Kitaplik {

	private List<Kitap> kitaplar;
	private Map<String, List<Kitap>> yazarIsmineGoreKitaplar;
	private Map<String, List<Kitap>> ismeGoreKitaplar;
//	private Map<Integer, List<Kitap>> idyeGoreKitaplar;
//	private Set<Yazar> yazarlar;
	private Map<String, Yazar> ismeGoreYazarlar;

	public Kitaplik() {
		this.kitaplar = new ArrayList<>();
		this.yazarIsmineGoreKitaplar = new LinkedHashMap<>();
		this.ismeGoreKitaplar = new LinkedHashMap<>();
		this.ismeGoreYazarlar = new LinkedHashMap<>();
	}

	public List<Kitap> getKitaplar() {
		return kitaplar;
	}

	public Map<String, List<Kitap>> getYazaraGoreKitaplar() {
		return yazarIsmineGoreKitaplar;
	}

	public Map<String, List<Kitap>> getIsmeGoreKitaplar() {
		return ismeGoreKitaplar;
	}

	public Map<String, Yazar> getIsmeGoreYazarlar() {
		return ismeGoreYazarlar;
	}

	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}

	public void setYazaraGoreKitaplar(Map<String, List<Kitap>> yazarIsmineGoreKitaplar) {
		this.yazarIsmineGoreKitaplar = yazarIsmineGoreKitaplar;
	}

	public void setIsmeGoreKitaplar(Map<String, List<Kitap>> ismeGoreKitaplar) {
		this.ismeGoreKitaplar = ismeGoreKitaplar;
	}

	public void setIsmeGoreYazarlar(Map<String, Yazar> ismeGoreYazarlar) {
		this.ismeGoreYazarlar = ismeGoreYazarlar;
	}

}
