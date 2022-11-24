package com.bilgeadam.lesson015;

import java.util.Random;

/*
 * 
 * bir static olmayan metot yazacaðýz 
 * bu metot bize random bir sayý üretip döenecek ;
 * daha sonra main metotda biz bu sayýyý boyut1 e eþitleyeilm 
 * boyut2 içinde bir random sayý olusturalým 
 * 
 * static bir metot olsun 
 * string deðerimizi 
 * içeride deðiþitrip geri döndürelim
 * 
 * 
 * 
 */
public class Question52 {

	int boyut1;

	static int boyut2;

	String deger;

	static int[] dizi;

	public int rastgeleSayi() {

		Random rnd = new Random();

		return rnd.nextInt(5);

	}

	public void bouyt1Yazir() {
		boyut1 = rastgeleSayi();
		System.out.println(boyut1);
	}

	public int[] diziUret() {
		boyut1 = rastgeleSayi();
		int dizi[] = new int[boyut1];
		System.out.println("boyut====>" + boyut1);
		int sayi;
		for (int i = 0; i < dizi.length; i++) {
			sayi = rastgeleSayi();
			dizi[i] = sayi;
		}

		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		return dizi;
	}

	public static String geriDon(String item) {
		return item;
	}

	public static void main(String[] args) {
		Question52 question52 = new Question52();
		// static bir metot içinde static olmayan bir deðerin kullanýmý
		question52.boyut1 = question52.rastgeleSayi();

		System.out.println(question52.boyut1);

		boyut2 = question52.rastgeleSayi();
		System.out.println(boyut2);
//		Question52.boyut2 = question52.random();
//		System.out.println(boyut2);
//		question52.boyut2 = question52.random();
//		System.out.println(boyut2);

		System.out.println(question52.geriDon(question52.deger));

		System.out.println(question52.deger);

		// dogru sonuc
		question52.deger = geriDon("aaaa");
		System.out.println(question52.deger);
		System.out.println("////////////////////////////");

		question52.diziUret();
		System.out.println("boyut===>" + question52.boyut1);
		question52.bouyt1Yazir();

	}

}
