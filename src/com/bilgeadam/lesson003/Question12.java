package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 * Girilen say�n�n basamaklar� toplam�n� ekrana yazd�ral�m
 * 
 * 
 * @author musty
 *
 */
public class Question12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int toplam = 0;
		System.out.println("L�tfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int sayac = 0;
		do {
			toplam += sayi % 10;
			sayi /= 10;
			sayac++;
		} while (sayi != 0);

		System.out.println("Toplam===>" + toplam);
		System.out.println("Basamak Say�s�: " + sayac);

	}

}
