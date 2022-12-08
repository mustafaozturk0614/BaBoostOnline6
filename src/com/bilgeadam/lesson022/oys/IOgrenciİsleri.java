package com.bilgeadam.lesson022.oys;

public interface IOgrenciÝsleri {

	Ogrenci ogrenciKaydý();

	boolean ogrenciKaydýSil(String ogrenciNo);

	void bilgilendirmeYap(Ogrenci ogrenci);

	boolean dersKaydiOnayla(Ders ders, Ogrenci Ogrenci);

	void ogrencileriListele();

}
