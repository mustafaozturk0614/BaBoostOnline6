package com.bilgeadam.lesson022.oys;

/*
 * 
 * memur 
 * 1-ogrenci kayd� yap
 * 2-ogrenci kaydi sil 
 * 3-bilgilendirme yap
 * 4-derskayd�onayla
 * 5-Ogretmenler listesi
 * 6-Ogrenciler listesi
 * ogrenci
 * 1-ders kayd�
 * 2-not ort goruntule
 * 3-ald���m dersleri listele
 * 
 * -ogretmen
 * 1-girdi�im dersleri listele
 * 2-noboetcilik durumu sorgula
 * 
 */
public class Manager {

	Okul okul;

	public Manager() {

	}

	public void memurMeunusu() {
		System.out.println("1-Ogrenci Kayd� Yap");
		System.out.println("2-Ogrenci Kayd� Sil");
		System.out.println("3-Bilgilendirme");
		System.out.println("4-Ders kay�t onay�");
		System.out.println("5-Ogretmen Listesi");
		System.out.println("6-Ogrenci Listesi");
	}

	public void ogrenciMenusu() {
		System.out.println("1-Ders Kayd� Yap");
		System.out.println("2-Not ortalamas� g�r�nt�le");
		System.out.println("3-Ald���m dersleri listele");
	}

	public void ogretmenMenusu() {
		System.out.println("1-Girdi�im dersleri Listele");
		System.out.println("2-N�betcilik durumu sorgula");
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
