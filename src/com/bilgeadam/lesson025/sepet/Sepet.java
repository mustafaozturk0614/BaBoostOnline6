package com.bilgeadam.lesson025.sepet;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * "Cips", "Kola", "�eker", "Ya�", "Un", "Ekmek", "�ay", "Yumurta", "Yo�urt", "S�t"
 * bu �r�nleri enum da tutal�m 
 * 
 * 
 * daha sonra sepet clas�m�zda bir urun array� olsun bu urun aray�de 
 * urun enumunu refarans als�n (STR�NG )
 * 
 * birde sepetimiz olsun String bir liste olsun 
 * 
 * bir menumuz olsun 
 * 1-�r�nleri listele/// 1-Cips 2-kola ........ x-s�t  
 * 2-sepete urun ekle (1 e bast�g�mzda sepete Cipsi eklesin 2 ye bast��m�zda da kolay�  ) 
 * 3-sepeti yazd�r
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
			System.out.println("1-�r�nleri Listele");
			System.out.println("2-Sepete �r�n Ekle");
			System.out.println("3-Sepeti G�r�nt�le");
			secim = Utility.intDegerAlma("L�tfen Bir i�lem Seciniz");

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
		int secim = Utility.intDegerAlma("L�tfen Sepete ekleyece�iniz urunu seciniz");
		sepet.add(urunler[secim - 1]);

	}

	public void sepetiGoster() {

		for (String urun : sepet) {

			System.out.println(urun);

		}

	}

}
