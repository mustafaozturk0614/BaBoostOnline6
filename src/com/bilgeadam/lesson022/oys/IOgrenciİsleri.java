package com.bilgeadam.lesson022.oys;

public interface IOgrenci�sleri {

	Ogrenci ogrenciKayd�();

	boolean ogrenciKayd�Sil(String ogrenciNo);

	void bilgilendirmeYap(Ogrenci ogrenci);

	boolean dersKaydiOnayla(Ders ders, Ogrenci Ogrenci);

	void ogrencileriListele();

}
