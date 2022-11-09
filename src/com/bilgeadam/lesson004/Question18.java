package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * 
 * * telefon kod mail kod baþlangýc deðerlerini biz kendimiz atayacaðýz (int)
* 
* daha sonra dýþarýdan birtane telefon kodu alacaðýz bir tanede mail için koda
* alacaðýz
  	// ikiiside uyuþuyosa sisteme kaydoldunuz
// telefonu doðru emaili yanlýþ --> emaili yanlýþ girdiniz
// emaili doðru telefonu yanlýþ girmiþ olabilir --> telefonu yanlýþ girdiniz	
// ikisinide yanlýþ girmiþ olabilir telefonu ve maili yanlýþ girdiniz
 * 
 */
public class Question18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mailKod = 444;
		int telKod = 555;

		System.out.println("Lütfen mail kodunuz giriniz");
		int mk = scanner.nextInt();
		System.out.println("Lütfen tel kodunuz giriniz");
		int tk = scanner.nextInt();

		if (telKod != tk && mailKod != mk) {
			System.out.println("Telefon kodu ve mail kodu  hatalýdýr");

		} else if (mailKod != mk) {
			System.out.println("Mail kodu Hatalýdýr");

		} else if (telKod != tk) {
			System.out.println("Telefon kodu hatalýdýr");

		} else {

			System.out.println("Giriþ baþarýlýdýr");
		}

	}

}
