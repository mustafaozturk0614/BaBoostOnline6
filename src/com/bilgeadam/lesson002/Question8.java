package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * D��ar�dan girilen bir say�n�n fakt�riyeli hesaplayal�m
 */
public class Question8 {
	public static void main(String[] args) {

		int sayi;
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayi giriniz");
		sayi = scan.nextInt();
		long fakt�riyel = 1;

		for (int i = 1; i <= sayi; i++) {
			fakt�riyel *= i;

		}
		System.out.println(fakt�riyel);

		fakt�riyel = 1;

		for (int i = sayi; i > 0; i--) {
			fakt�riyel *= i;
		}
		System.out.println(fakt�riyel);
	}
}
