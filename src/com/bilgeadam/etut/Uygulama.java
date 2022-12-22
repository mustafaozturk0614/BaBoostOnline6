package com.bilgeadam.etut;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Uygulama implements ICrud {

	Kitaplik kitaplik;

	public Uygulama(Kitaplik kitaplik) {
		super();
		this.kitaplik = kitaplik;
	}

	public Uygulama() {
		super();
		this.kitaplik = new Kitaplik();
	}

	@Override
	public void kitapEkle() {
		String ad = Utility.stringDegerAlma("L�tfen kitap ismini giriniz");
		int sayfaSayisi = Utility.intDegerAlma("L�tfen kitab�n sayfa say�s�n� giriniz");
		String yazarIs�mSoyIs�m = Utility.stringDegerAlma("L�tfen Yazar ismini giriniz");
		Yazar yazar = yazarKontrol(yazarIs�mSoyIs�m);
		Kitap kitap = new Kitap(ad, sayfaSayisi, yazar);

		kitaplik.getKitaplar().add(kitap);
		yazar.getKitaplar().add(kitap);
		kitaplik.getYazaraGoreKitaplar().put(yazarIs�mSoyIs�m, yazar.getKitaplar());
		ismeGorekitapEkle(kitap, ad, kitaplik.getIsmeGoreKitaplar());

	}

	private void ismeGorekitapEkle(Kitap kitap, String ad, Map<String, List<Kitap>> map) {
		List<Kitap> kitaplar = new ArrayList<>();

		if (map.containsKey(ad)) {
			kitaplar = map.get(ad);
			kitaplar.add(kitap);
		} else {
			kitaplar.add(kitap);
		}

		map.put(ad, kitaplar);

//		List<Kitap> kitaplar = new ArrayList<>();
//		for (int i = 0; i < kitaplik.getKitaplar().size(); i++) {
//
//			if (kitaplik.getKitaplar().get(i).getIsim().equalsIgnoreCase(ad)) {
//				kitaplar.add(kitaplik.getKitaplar().get(i));
//			} else {
//				kitaplar.add(kitaplik.getKitaplar().get(i));
//			}
//		}

	}

	public Yazar yazarKontrol(String yazarIsmi) {

		if (kitaplik.getIsmeGoreYazarlar().containsKey(yazarIsmi)) {
			System.out.println("Daha once Eklenmi� Yazar");
			return kitaplik.getIsmeGoreYazarlar().get(yazarIsmi);
		} else {
			int yas = Utility.intDegerAlma("Yazar�n yas�n� giriniz");
			Yazar yazar = new Yazar(yazarIsmi, yas);
			kitaplik.getIsmeGoreYazarlar().put(yazarIsmi, yazar);
			return yazar;
		}

	}

	@Override
	public void kitapSil() {
		// TODO Auto-generated method stub

	}

	@Override
	public Kitap ismeGoreKitapBul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kitap> yazarinKitaplariniBul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kitap> kitaplariListele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Yazar> yazarlariListele() {
		// TODO Auto-generated method stub
		return null;
	}

}
