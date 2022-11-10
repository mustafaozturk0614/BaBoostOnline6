package com.bilgeadam.lesson005;

import java.util.Scanner;

// Klavyeden girilen 0 ile 100 aras�nda 100 dahil
// 5 adet say�dan en b�y�k ve en k���k olan� bulup ekrana yazan program�n kod
// par�ac���
public class Question24 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int num;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while (i < 5) {
			System.out.println("L�tfen bir say� giriniz");
			num = scanner.nextInt();

			if (num <= 100 && num >= 0) {

				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
				i++;
			} else {
				System.out.println("L�tfen belirtilen aral�klarda bir say� giriniz");
			}

		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);

	}
}
