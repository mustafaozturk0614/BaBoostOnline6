package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 * 
 * telefon kod mail kod ba�lang�c de�erlerini biz kendimiz atayaca��z (int)
 * 
 * daha sonra d��ar�dan birtane telefon kodu alaca��z bir tanede mail i�in koda
 * alaca��z
 * 
 * e�er telefon kodu hatal� ise tel kodu hatal� ��kt�s� verelim
 * 
 * e�er mail kodu hatal� ise mail kodu hatal� ��kt�s�n� verelim
 * 
 */
public class Question17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mailKod = 444;
		int telKod = 555;

		System.out.println("L�tfen mail kodunuz giriniz");
		int mk = scanner.nextInt();
		System.out.println("L�tfen tel kodunuz giriniz");
		int tk = scanner.nextInt();

		if (telKod != tk) {
			System.out.println("Telefon kodu hatal�d�r");
		}
		if (mailKod != mk) {
			System.out.println("Mail kodu Hatal�d�r");
		}

	}

}
