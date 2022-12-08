package com.bilgeadam.lesson022.oys;

/*
 * 
 * memur 
 * 1-ogrenci kaydý yap
 * 2-ogrenci kaydi sil 
 * 3-bilgilendirme yap
 * 4-derskaydýonayla
 * 5-Ogretmenler listesi
 * 6-Ogrenciler listesi
 * ogrenci
 * 1-ders kaydý
 * 2-not ort goruntule
 * 3-aldýðým dersleri listele
 * 
 * -ogretmen
 * 1-girdiðim dersleri listele
 * 2-noboetcilik durumu sorgula
 * 
 */
public class Manager {

	Okul okul;

	public Manager() {

	}

	public void memurMeunusu() {
		System.out.println("1-Ogrenci Kaydý Yap");
		System.out.println("2-Ogrenci Kaydý Sil");
		System.out.println("3-Bilgilendirme");
		System.out.println("4-Ders kayýt onayý");
		System.out.println("5-Ogretmen Listesi");
		System.out.println("6-Ogrenci Listesi");
	}

	public void ogrenciMenusu() {
		System.out.println("1-Ders Kaydý Yap");
		System.out.println("2-Not ortalamasý görüntüle");
		System.out.println("3-Aldýðým dersleri listele");
	}

	public void ogretmenMenusu() {
		System.out.println("1-Girdiðim dersleri Listele");
		System.out.println("2-Nöbetcilik durumu sorgula");
	}

	public void menu(Kisi kisi) {

		if (kisi instanceof Memur) {
			memurMeunusu();
		} else if (kisi.getClass().getSimpleName().equals("Ogrenci")) {

			ogrenciMenusu();

		} else {
			ogretmenMenusu();
		}

	}

	public void menu2(Kisi kisi) {
		kisi.menu();
	}

}
