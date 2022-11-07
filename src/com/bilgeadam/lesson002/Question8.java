package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * Dýþarýdan girilen bir sayýnýn faktöriyeli hesaplayalým
 */
public class Question8 {
	public static void main(String[] args) {

		int sayi;
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayi giriniz");
		sayi = scan.nextInt();
		long faktöriyel = 1;

		for (int i = 1; i <= sayi; i++) {
			faktöriyel *= i;

		}
		System.out.println(faktöriyel);

		faktöriyel = 1;

		for (int i = sayi; i > 0; i--) {
			faktöriyel *= i;
		}
		System.out.println(faktöriyel);
	}
}
