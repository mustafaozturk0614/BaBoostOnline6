package com.bilgeadam.lesson009;

import java.util.Scanner;

public class Question44 {
	/*
	 * bir metot olsun metodun i�inde 2tanse say� alal�m bu say�lar� �arp�p carp�m
	 * de�erni dondurelim
	 * 
	 * main metotda birde bir sayi de�eri =15 olsun
	 * 
	 * bir de sonuc de�erimiz olsun =0; sonuca =metotdan d�nen de�er /sayi
	 * 
	 * sonrada sonucu yazd�ral�m
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
		System.out.println("L�tfen 1. say�y� giriniz");
		int deger1 = scanner.nextInt();
		System.out.println("L�tfen 2. say�y� giriniz");
		int deger2 = scanner.nextInt();

		int dizi[] = new int[2];
		dizi[0] = deger1;
		dizi[1] = deger2;

		return dizi;

	}

	public static int carpim3(int[] dizi) {

		int carp�m = dizi[0] * dizi[1];
		return carp�m;

	}

	public static int carpim() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen 1. say�y� giriniz");
		int deger1 = scanner.nextInt();
		System.out.println("L�tfen 2. say�y� giriniz");
		int deger2 = scanner.nextInt();
		int carp�m = deger1 * deger2;

		return carp�m;

	}

	public static void carpim2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen 1. say�y� giriniz");
		int deger1 = scanner.nextInt();
		System.out.println("L�tfen 2. say�y� giriniz");
		int deger2 = scanner.nextInt();
		int carp�m = deger1 * deger2;
		System.out.println(carp�m);

	}

}
