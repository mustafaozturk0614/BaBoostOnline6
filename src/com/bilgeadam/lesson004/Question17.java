package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 * 
 * telefon kod mail kod baþlangýc deðerlerini biz kendimiz atayacaðýz (int)
 * 
 * daha sonra dýþarýdan birtane telefon kodu alacaðýz bir tanede mail için koda
 * alacaðýz
 * 
 * eðer telefon kodu hatalý ise tel kodu hatalý çýktýsý verelim
 * 
 * eðer mail kodu hatalý ise mail kodu hatalý çýktýsýný verelim
 * 
 */
public class Question17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mailKod = 444;
		int telKod = 555;

		System.out.println("Lütfen mail kodunuz giriniz");
		int mk = scanner.nextInt();
		System.out.println("Lütfen tel kodunuz giriniz");
		int tk = scanner.nextInt();

		if (telKod != tk) {
			System.out.println("Telefon kodu hatalýdýr");
		}
		if (mailKod != mk) {
			System.out.println("Mail kodu Hatalýdýr");
		}

	}

}
