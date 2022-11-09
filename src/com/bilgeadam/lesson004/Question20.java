package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 * 
 * Girilen sayýnýn 5 in kuvveti olup olmadýðýný bulan kod
 * 
 * @author musty
 *
 */
public class Question20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayi giriniz");
		int sayi = scanner.nextInt();
		boolean kontrol = true;

		if (sayi == 1) {
			kontrol = false;
			System.out.println("5 in kuvvetidir");
		} else if (sayi < 1) {
			kontrol = false;
			System.out.println("Negatif deðer girmeyiniz");
		}

		while (kontrol) {
			if (sayi % 5 == 0) {
				sayi /= 5;
				if (sayi == 1) {
					System.out.println("5 in kuvvetidir");
					kontrol = false;
				}

			} else {
				System.out.println("5 in kuvveti deðildir");
				kontrol = false;

			}

		}

	}

}
