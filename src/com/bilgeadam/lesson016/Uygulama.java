package com.bilgeadam.lesson016;

import java.util.Random;

/*
 * 
 * Bir deste olu�tural�m // sadece rakamlar� i�ersin 0.........51
 * 
 * desteyi g�ster metotu yazaca��z daha once olusturdu�umuz deste dizisiniz
 * bu metoto da  kullanaca��z ve indexlerine g�re 
 * 	kupa as kupa2 .......Ma�a as ma�a2......
 * 
 * 
 * 
 * 
 */
public class Uygulama {
	Kart kart = new Kart();

	public static void main(String[] args) {

		Uygulama uygulama = new Uygulama();
		// s�ral� bir �nt arayi olusturduk
		int[] deste = uygulama.desteyiOlustur();

		// uygulama.karisikDesteyiGoster(uygulama.desteyiKaristir(deste));
		uygulama.karisikDesteyiGoster2(uygulama.desteyiKaristir(deste), 1);
//		for (int i = 0; i < deste.length; i++) {
//			System.out.println(deste[i]);
//		}

//		uygulama.desteyiGoster();

	}

	public int[] desteyiOlustur() {

		int[] deste = new int[kart.kartNumaralari.length * kart.kartTurleri.length];
		for (int i = 0; i < deste.length; i++) {

			deste[i] = i;
		}
		return deste;

	}

	public void siraliDesteyiGoster() {

		for (int i = 0; i < kart.kartTurleri.length; i++) {

			for (int j = 0; j < kart.kartNumaralari.length; j++) {

				System.out.println(kart.kartTurleri[i] + "-" + kart.kartNumaralari[j]);
			}

		}

	}

	public void karisikDesteyiGoster2(int[] deste, int kartSayisi) {

		int count = 0;

		if (kartSayisi <= 0 || kartSayisi > 52) {
			System.out.println("Kart say�s� belirtilen aral�kta olmad��� i�in herhangi bir de�er g�sterilmedi");

		} else {
			count = kartSayisi;
		}

		for (int i = 0; i < count; i++) {

			int kartIndex = deste[i] / 13;

			int numaraIndex = deste[i] % 13;
			String kartTuru = kart.kartTurleri[kartIndex];
			String kartNumarasi = kart.kartNumaralari[numaraIndex];
			System.out.println(kartTuru + " " + kartNumarasi);

		}

	}

	public void karisikDesteyiGoster(int[] deste) {
		// String[] kartTurleri = { "Kupa", "Ma�a", "Karo", "Sinek" };
		// String[] kartNumaralari = { "As", "2", "3", "4", "5", "6", "7", "8", "9",
		// "10", "J", "Q", "K" };

		for (int i = 0; i < deste.length; i++) {

			// 2=15/13/Maca

			int kartIndex = deste[i] / 13;

			// 15%13=2

			int numaraIndex = deste[i] % 13;
			String kartTuru = kart.kartTurleri[kartIndex];
			String kartNumarasi = kart.kartNumaralari[numaraIndex];
			System.out.println(kartTuru + " " + kartNumarasi);

		}

	}

	public int[] desteyiKaristir(int[] deste) {
		// {5,12,50,7,6,0}
//		{0,1,2,3,4,5,6,7,}
		for (int i = 0; i < deste.length; i++) {
			// i=4
			int rastgeleIndex = rastgeleIndexUret();// 3

			int gecici = deste[i];// 4
			// {0,1,2,3,4,5,6,7,}
			deste[i] = deste[rastgeleIndex]; //
			// {0,1,2,3,3,5,6,7,}
			deste[rastgeleIndex] = gecici; //
//			{0,1,2,4,3,5,6,7,}
		}
		return deste;
	}

	public int rastgeleIndexUret() {

		Random random = new Random();

		return random.nextInt(52);
	}

}
