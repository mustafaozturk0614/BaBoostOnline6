package com.bilgeadam.lesson041;

/*
 * 
 * ogretmen sýnýfýný thread yapalým
 * 
 * run metodu yazalým run metodunda 10 kere donsunçýktý olarakta 
 * 
 * ogretmenismi --->  1.ogrencinin notlraýný okudu
 * ogretmenismi --->  2.ogrencinin notlraýný okudu
 * 
 * OgretmenTest olusturalým 
 * burda test edeceðiz 2 tane ogretmen olusturalým 
 * ve threadleri çalýþtýralým 
 * 
 * 
 * ogretmenler ayný dosya uzerinde okuma yapýp okuduklerý verileri 
 * kendi sýnýflarý içerisinde tutuklarý ogrenci listesine ekleyecekler
 * bunu bir thread yapýsý uzerinden kuracagýz 
 * 
 * ogretmenTest sýnýfýnda 2 tane ogretmenimiz olucak bu threadleri çalýþtýrcagýz 
 * en sonundada kaçtane ogrencinin notunu okumuslar onu gosterceðiz
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

			System.out.println(name + " ogretmen " + (i + 1) + ". ögrencinin notlarýný okudu");
			try {
				sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
