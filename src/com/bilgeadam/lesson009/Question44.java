package com.bilgeadam.lesson009;

import java.util.Scanner;

public class Question44 {
	/*
	 * bir metot olsun metodun içinde 2tanse sayý alalým bu sayýlarý çarpýp carpým
	 * deðerni dondurelim
	 * 
	 * main metotda birde bir sayi deðeri =15 olsun
	 * 
	 * bir de sonuc deðerimiz olsun =0; sonuca =metotdan dönen deðer /sayi
	 * 
	 * sonrada sonucu yazdýralým
	 * 
	 */
	public static void main(String[] args) {

		int sayi = 15;
		int sonuc = 0;
//		sonuc = carpim() / sayi;

//		System.out.println("sonuc= " + sonuc);
//		System.out.println(carpim());

		int dizi[] = sayilariAl();
		int sonuc2 = carpim3(dizi);
		System.out.println(sonuc2);

		System.out.println(carpim3(sayilariAl()));

	}

	public static int[] sayilariAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1. sayýyý giriniz");
		int deger1 = scanner.nextInt();
		System.out.println("Lütfen 2. sayýyý giriniz");
		int deger2 = scanner.nextInt();

		int dizi[] = new int[2];
		dizi[0] = deger1;
		dizi[1] = deger2;

		return dizi;

	}

	public static int carpim3(int[] dizi) {

		int carpým = dizi[0] * dizi[1];
		return carpým;

	}

	public static int carpim() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1. sayýyý giriniz");
		int deger1 = scanner.nextInt();
		System.out.println("Lütfen 2. sayýyý giriniz");
		int deger2 = scanner.nextInt();
		int carpým = deger1 * deger2;

		return carpým;

	}

	public static void carpim2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1. sayýyý giriniz");
		int deger1 = scanner.nextInt();
		System.out.println("Lütfen 2. sayýyý giriniz");
		int deger2 = scanner.nextInt();
		int carpým = deger1 * deger2;
		System.out.println(carpým);

	}

}
