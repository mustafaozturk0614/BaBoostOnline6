package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Klavyeden 0 girilinceye kadar sayý okumaya devam edeceðiz 
 * 0 girilidðinde sayýlarýn toplamýný ve ortalamasýný ekrana yazdýralým  
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
//			System.out.println("Lütfen bir sayi giriniz");
//			num = scanner.nextInt();
//			toplam += num;
//			ort = toplam / (j);
//			i++;
//			j = i - 1;
//		} while (num != 0);
//
//		System.out.println("toplam: " + toplam);
//		System.out.println("ort: " + ort);

		System.out.println("Lütfen bir sayi giriniz");
		num = scanner.nextInt();

		while (num != 0) {
			toplam += num;
			ort = toplam / i;
			i++;
			System.out.println("Lütfen bir sayi giriniz");
			num = scanner.nextInt();
		}

		System.out.println("toplam: " + toplam);
		System.out.println("ort: " + ort);

	}
}
