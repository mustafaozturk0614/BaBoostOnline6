package com.bilgeadam.lesson041;

/*
 * 
 * ogretmen s�n�f�n� thread yapal�m
 * 
 * run metodu yazal�m run metodunda 10 kere donsun��kt� olarakta 
 * 
 * ogretmenismi --->  1.ogrencinin notlra�n� okudu
 * ogretmenismi --->  2.ogrencinin notlra�n� okudu
 * 
 * OgretmenTest olustural�m 
 * burda test edece�iz 2 tane ogretmen olustural�m 
 * ve threadleri �al��t�ral�m 
 * 
 * 
 * ogretmenler ayn� dosya uzerinde okuma yap�p okudukler� verileri 
 * kendi s�n�flar� i�erisinde tutuklar� ogrenci listesine ekleyecekler
 * bunu bir thread yap�s� uzerinden kuracag�z 
 * 
 * ogretmenTest s�n�f�nda 2 tane ogretmenimiz olucak bu threadleri �al��t�rcag�z 
 * en sonundada ka�tane ogrencinin notunu okumuslar onu gosterce�iz
 * 
 * 
 * 
 * 
 * 
 */
public class Ogretmen extends Thread {

	String name;

	public Ogretmen(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println(name + " ogretmen " + (i + 1) + ". �grencinin notlar�n� okudu");
			try {
				sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
