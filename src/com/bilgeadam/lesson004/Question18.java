package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * 
 * * telefon kod mail kod ba�lang�c de�erlerini biz kendimiz atayaca��z (int)
* 
* daha sonra d��ar�dan birtane telefon kodu alaca��z bir tanede mail i�in koda
* alaca��z
  	// ikiiside uyu�uyosa sisteme kaydoldunuz
// telefonu do�ru emaili yanl�� --> emaili yanl�� girdiniz
// emaili do�ru telefonu yanl�� girmi� olabilir --> telefonu yanl�� girdiniz	
// ikisinide yanl�� girmi� olabilir telefonu ve maili yanl�� girdiniz
 * 
 */
public class Question18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mailKod = 444;
		int telKod = 555;

		System.out.println("L�tfen mail kodunuz giriniz");
		int mk = scanner.nextInt();
		System.out.println("L�tfen tel kodunuz giriniz");
		int tk = scanner.nextInt();

		if (telKod != tk && mailKod != mk) {
			System.out.println("Telefon kodu ve mail kodu  hatal�d�r");

		} else if (mailKod != mk) {
			System.out.println("Mail kodu Hatal�d�r");

		} else if (telKod != tk) {
			System.out.println("Telefon kodu hatal�d�r");

		} else {

			System.out.println("Giri� ba�ar�l�d�r");
		}

	}

}
