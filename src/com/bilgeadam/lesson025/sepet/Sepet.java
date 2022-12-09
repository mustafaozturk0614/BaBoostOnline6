package com.bilgeadam.lesson025.sepet;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * "Cips", "Kola", "Þeker", "Yað", "Un", "Ekmek", "Çay", "Yumurta", "Yoðurt", "Süt"
 * bu ürünleri enum da tutalým 
 * 
 * 
 * daha sonra sepet clasýmýzda bir urun arrayý olsun bu urun arayýde 
 * urun enumunu refarans alsýn (STRÝNG )
 * 
 * birde sepetimiz olsun String bir liste olsun 
 * 
 * bir menumuz olsun 
 * 1-ürünleri listele/// 1-Cips 2-kola ........ x-süt  
 * 2-sepete urun ekle (1 e bastýgýmzda sepete Cipsi eklesin 2 ye bastýðmýzda da kolayý  ) 
 * 3-sepeti yazdýr
 * 
 * 
 * 
 */
public class Sepet {

	String[] urunler;
	List<String> sepet;

	public Sepet() {
		urunListesiOlustur();
		this.sepet = new ArrayList<>();
	}

	public void menu() {
		int secim = 0;
		do {
			System.out.println("1-Ürünleri Listele");
			System.out.println("2-Sepete Ürün Ekle");
			System.out.println("3-Sepeti Görüntüle");
			secim = Utility.intDegerAlma("Lütfen Bir iþlem Seciniz");

			switch (secim) {
			case 1:
				urunleriListele();
				break;
			case 2:
				urunEkle();
				break;
			case 3:
				sepetiGoster();
				break;

			default:
				break;
			}

		} while (secim != 0);

	}

	public void urunleriListele() {
		int i = 1;
		for (String urun : urunler) {
			System.out.println(i + "-" + urun);
			i++;
		}

	}

	public void urunListesiOlustur() {

		urunler = new String[EUrun.values().length];

		for (int i = 0; i < EUrun.values().length; i++) {
			urunler[i] = EUrun.values()[i].toString();
		}

	}

	public void urunEkle() {
		urunleriListele();
		int secim = Utility.intDegerAlma("Lütfen Sepete ekleyeceðiniz urunu seciniz");
		sepet.add(urunler[secim - 1]);

	}

	public void sepetiGoster() {

		for (String urun : sepet) {

			System.out.println(urun);

		}

	}

}
