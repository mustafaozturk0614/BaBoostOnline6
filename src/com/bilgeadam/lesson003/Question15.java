package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Klavyeden 0 girilinceye kadar say� okumaya devam edece�iz 
 * 0 girilid�inde say�lar�n toplam�n� ve ortalamas�n� ekrana yazd�ral�m  
 * 
 */
public class Question15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		int toplam = 0;
		double ort = 0;
		double i = 1;
		double j = 1;

//		do {
//			System.out.println("L�tfen bir sayi giriniz");
//			num = scanner.nextInt();
//			toplam += num;
//			ort = toplam / (j);
//			i++;
//			j = i - 1;
//		} while (num != 0);
//
//		System.out.println("toplam: " + toplam);
//		System.out.println("ort: " + ort);

		System.out.println("L�tfen bir sayi giriniz");
		num = scanner.nextInt();

		while (num != 0) {
			toplam += num;
			ort = toplam / i;
			i++;
			System.out.println("L�tfen bir sayi giriniz");
			num = scanner.nextInt();
		}

		System.out.println("toplam: " + toplam);
		System.out.println("ort: " + ort);

	}
}
