package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question32 {
	/*
	 * Dýþarýdan girilen ülkenin dizimizde olup olmadýðýnýbulan algoritma
	 * 
	 */
	public static void main(String[] args) {

		String[] dizi = { "Türkiye", "Japonya", "Moðolistan", "Fransa", "Danimarka" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir ülke ismi giriniz");
		String ulke = scanner.nextLine();
		boolean kontrol = false;
		String kontrol2 = "Girdiðiniz Ülke Bulunamadý";

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].equals(ulke)) {
//				kontrol=true;
//				System.out.println("Girdiðiniz ülke Bulundu");
				kontrol2 = "Girdiðiniz ülke Bulundu";
				break;
			}
		}

		System.out.println(kontrol2);
		// if (!kontrol) {
//			System.out.println("Girdiðiniz Ülke Bulunamadý");
//		}
	}
}
