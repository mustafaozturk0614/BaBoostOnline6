package com.bilgeadam.lesson013;

public class TestDatabase {

	public static void main(String[] args) {
		Database.veriTaban�Baslang�cDegerleri();
		Kullanici[] kullaniciListesi = Database.kullaniciListesi;
		for (int i = 0; i < kullaniciListesi.length; i++) {
			if (kullaniciListesi[i] != null) {
				System.out.println(kullaniciListesi[i].isim + "-" + kullaniciListesi[i].id);
			}
		}
	}

}
