package com.bilgeadam.lesson022.oys;

public class Memur extends Calisan implements IOgrenci�sleri {

	public Memur(String isim, String soyisim, double maas, int calismaSaati) {
		super(isim, soyisim, maas, calismaSaati);

	}

	public Memur(String isim, String soyisim) {
		super(isim, soyisim);

	}

	@Override
	public Ogrenci ogrenciKayd�() {
		String isim = OysUtility.stringDegerAlma("L�tfen isminizi giriniz");
		String soyisim = OysUtility.stringDegerAlma("L�tfen soy isminizi giriniz");
		Ogrenci ogrenci = new Ogrenci(isim, soyisim);

		return ogrenci;
	}

	@Override
	public boolean ogrenciKayd�Sil(String ogrenciNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void bilgilendirmeYap(Ogrenci ogrenci) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean dersKaydiOnayla(Ders ders, Ogrenci Ogrenci) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void menu() {

		int secim;
		do {
			super.menu();
			System.out.println("1-Ogrenci Kayd� Yap");
			System.out.println("2-Ogrenci Kayd� Sil");
			System.out.println("3-Bilgilendirme");
			System.out.println("4-Ders kay�t onay�");
			System.out.println("5-Ogretmen Listesi");
			System.out.println("6-Ogrenci Listesi");
			secim = OysUtility.intDegerAlma("L�tfen bir secim yap�n�z");
			islemler(secim);
		} while (secim != 0);

	}

	public void islemler(int secim) {

		switch (secim) {
		case 1:
			Ogrenci ogrenci = ogrenciKayd�();
			Okul.ogrenciListesi.add(ogrenci);
			System.out.println(ogrenci.getIsim() + " adl� ogrenci ba�ar�l� bir �ekilde kay�t olmu�tur ");

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:
			ogrencileriListele();
			break;

		default:
			break;
		}

	}

	@Override
	public void ogrencileriListele() {

		for (Ogrenci x : Okul.ogrenciListesi) {
			System.out.println(x);
		}

	}

}
