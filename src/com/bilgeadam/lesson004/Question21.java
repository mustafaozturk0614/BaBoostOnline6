package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * Dýþardan 1 ile 7 arasý bir sayý alalým 
 * bu sayýya karþýlýk gelen günün ismin yazdýralým 
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
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
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
			System.out.println("Hatalý bir deðer girdiniz");
			break;

		}

		switch (sayi) {
		case 1, 2, 3, 4, 5:
			System.out.println("Hafta içi");
			break;
		case 6, 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Hatalý bir deðer girdiniz");
			break;
		}

	}

}
