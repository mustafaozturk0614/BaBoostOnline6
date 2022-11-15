package com.bilgeadam.lesson008;

public class Question36 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		// dizi deki tüm sayýlarýn toplamý ve
		// bu sayý çiftdir ve bu sayý tekdir þeklinde çýktý alalým.

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " Çift Sayýdýr");
			} else {
				System.out.println(sayilar[i] + " Tek Sayýdýr");
			}
		}
		System.out.println("toplam= " + toplam);

	}

}
