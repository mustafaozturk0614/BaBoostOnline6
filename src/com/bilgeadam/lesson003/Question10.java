package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 * 
 * birden girdi�imiz say�ya kadar olan say�lar�n bir fazlas�n�n toplam�n� ekrana
 * yazd�ral�m
 * 
 * 
 *
 */
public class Question10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen Bir sayi giriniz");
		int sayi1 = scan.nextInt();
		int toplam = 0;
		for (int i = 1; i < sayi1; i++) {

			toplam += i + 1;
		}

		System.out.println("toplam==>" + toplam);

		toplam = 0;
		int sayac = 1;

		while (sayac < sayi1) {

			sayac++;
			toplam += sayac;

		}
		System.out.println("toplam==>" + toplam);

	}

}
