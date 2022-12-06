package com.bilgeadam.lesson022.oys;

public class Memur extends Calisan implements IOgrenciÝsleri {

	public Memur(String isim, String soyisim, double maas, int calismaSaati) {
		super(isim, soyisim, maas, calismaSaati);

	}

	public Memur(String isim, String soyisim) {
		super(isim, soyisim);

	}

	@Override
	public Ogrenci ogrenciKaydý() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ogrenciKaydýSil(String ogrenciNo) {
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

}
