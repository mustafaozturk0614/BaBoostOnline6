package com.bilgeadam.lesson022.oys;

public interface IOgrenciİsleri {

	Ogrenci ogrenciKaydı();

	boolean ogrenciKaydıSil(String ogrenciNo);

	void bilgilendirmeYap(Ogrenci ogrenci);

	boolean dersKaydiOnayla(Ders ders, Ogrenci Ogrenci);

}
