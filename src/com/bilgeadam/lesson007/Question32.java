package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question32 {
	/*
	 * D��ar�dan girilen �lkenin dizimizde olup olmad���n�bulan algoritma
	 * 
	 */
	public static void main(String[] args) {

		String[] dizi = { "T�rkiye", "Japonya", "Mo�olistan", "Fransa", "Danimarka" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen bir �lke ismi giriniz");
		String ulke = scanner.nextLine();
		boolean kontrol = false;
		String kontrol2 = "Girdi�iniz �lke Bulunamad�";

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].equals(ulke)) {
//				kontrol=true;
//				System.out.println("Girdi�iniz �lke Bulundu");
				kontrol2 = "Girdi�iniz �lke Bulundu";
				break;
			}
		}

		System.out.println(kontrol2);
		// if (!kontrol) {
//			System.out.println("Girdi�iniz �lke Bulunamad�");
//		}
	}
}
