package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * Dýþarýdan  2 tane sayýsal deðer alalým  iki sayýnýn toplamý
 * çift ise true yazdýralm deðilse false yazdýralým 
 * en sonrada toplamýn yarýsýnýda ekra yazdýralým
 * 
 */
public class Question7 {

	public static void main(String[] args) {

		int sayi1, sayi2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir sayý giriniz");
		sayi1 = scanner.nextInt();
		System.out.println("Lütfen Bir sayý giriniz");
		sayi2 = scanner.nextInt();
		int toplam = sayi1 + sayi2;
		boolean kontrol = toplam % 2 == 0;
		System.out.println("sayýlarýmýzýn toplamý çiftmi : " + kontrol);
		// float toplamýnYarýsý = toplam / 2f;
		System.out.println(toplam / 2f);

	}

}
