package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * D��ar�dan girilen bir say�n�n asal say� olup olmad���n� kontrol eden kod
 * 
 * 
 */
public class Question19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sayi = scanner.nextInt();
		boolean asalSayimidir = true;

		if (sayi < 2) {
			asalSayimidir = false;
		} else {

			for (int i = 2; i <= sayi / 2; i++) {

				if (sayi % i == 0) {
					asalSayimidir = false;
					break;
				}

			}
		}

		if (asalSayimidir) {
			System.out.println("Asal sayidir");
		} else {
			System.out.println("Asal say� de�ildir");
		}

	}
}
