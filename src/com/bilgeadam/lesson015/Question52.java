package com.bilgeadam.lesson015;

import java.util.Random;

/*
 * 
 *1 bir static olmayan metot yazaca��z 
 * bu metot bize random bir say� �retip d�enecek ;
 * daha sonra main metotda biz bu say�y� boyut1 e e�itleyeilm 
 * boyut2 i�inde bir random say� olustural�m 
 * 
 * 2 static bir metotumuz olsun 
 * string de�erimizi 
 * i�eride de�i�itrip geri d�nd�relim
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
		// static bir metot i�inde static olmayan bir de�erin kullan�m�
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
