package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 * Girilen sayýnýn basamaklarý toplamýný ekrana yazdýralým
 * 
 * 
 * @author musty
 *
 */
public class Question12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int toplam = 0;
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int sayac = 0;
		do {
			toplam += sayi % 10;
			sayi /= 10;
			sayac++;
		} while (sayi != 0);

		System.out.println("Toplam===>" + toplam);
		System.out.println("Basamak Sayýsý: " + sayac);

	}

}
