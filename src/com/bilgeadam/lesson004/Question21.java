package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * D��ardan 1 ile 7 aras� bir say� alal�m 
 * bu say�ya kar��l�k gelen g�n�n ismin yazd�ral�m 
 * 
 * 
 * 
 */
public class Question21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();

		switch (sayi) {

		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;

		default:
			System.out.println("Hatal� bir de�er girdiniz");
			break;

		}

		switch (sayi) {
		case 1, 2, 3, 4, 5:
			System.out.println("Hafta i�i");
			break;
		case 6, 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Hatal� bir de�er girdiniz");
			break;
		}

	}

}
