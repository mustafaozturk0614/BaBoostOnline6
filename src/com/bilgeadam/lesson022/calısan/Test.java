package com.bilgeadam.lesson022.calýsan;

/**
 * 
 * 
 * 
 * -- Mühendislerimiz olacak
 * 
 * isim soyiisim iþ unvani maaþý enz az iki constructr istiyorum (isim soy isim)
 * (isim soyisim maaþ)
 * 
 * maaþþ zammý metodu olacak
 * 
 * maaþ default en az 10000 1000 12000 arasý unvan muhendis eger maaþý
 * 1200-17000 arasýnda ise kýdemlý muhendis 1700den yuksek ise uzman muhendis
 * eðer maaaþý 1000 kucuk ise stajyer ve
 * 
 * zam oranýna ek olarak 250tl bonus alacaklar
 * 
 * 
 *
 * -- ofis çalýþanlarý olacak
 * 
 * isim soyiisim iþ unvani maaþý
 * 
 * en düþük çalýþan maaþý 8000 8000 1200 arasý çalýþan 12000 den sonraý kidemli
 * calýasan 8000den az ise stajyer
 * 
 * 
 *
 */
public class Test {

	public static void main(String[] args) {

		OfisCalisani ofisCalisani = new OfisCalisani("Mustafa", "Ozturk");
		System.out.println(ofisCalisani.getMaas());

		System.out.println(ofisCalisani.getUnvan());
		System.out.println(ofisCalisani.getMaas());

		OfisCalisani ofisCalisani2 = new OfisCalisani("Tuba", "Ozturk", 13000);
		System.out.println(ofisCalisani2.getMaas());

		System.out.println(ofisCalisani2.getUnvan());
		System.out.println(ofisCalisani2.getMaas());

		Muhendis muhendis = new Muhendis("Zeliha", "Çalýþoðlu");
		System.out.println(muhendis.getUnvan());
		System.out.println(muhendis.getMaas());

		Muhendis muhendis2 = new Muhendis("Kemal", "Öztürk", 15000);

		System.out.println(muhendis2.getUnvan());
		System.out.println(muhendis2.getMaas());

		System.out.println(muhendis.getClass().getSimpleName());

		InsanKaynaklarý insanKaynaklarý = new InsanKaynaklarý("Burhan", "Lale");

		insanKaynaklarý.zamYap(muhendis, 10);
		System.out.println(muhendis.getMaas());

	}
}
