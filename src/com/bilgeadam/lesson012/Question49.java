package com.bilgeadam.lesson012;

import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("L�tfen Tek bir sayi giriniz");
		int sayi = scanner.nextInt();
		System.out.println("L�tfen Sutun  sayis�n� giriniz");
		int sutun = scanner.nextInt();
		System.out.println("L�tfen Sat�r  sayis�n� giriniz");
		int sat�r = scanner.nextInt();

		printArray(sayi, sutun, sat�r);

	}

	public static void printArray(int sayi, int sutun, int sat�r) {

		int min = 1;
		int orta = (sayi + 1) / 2;
		int[][] dizi = new int[sat�r][sutun];

		for (int i = 0; i < dizi.length; i++) {

			for (int j = 0; j < dizi.length; j++) {
				if (i == j) {
					dizi[i][j] = orta;
				} else if (i > j) {
					dizi[i][j] = min;

				} else {
					dizi[i][j] = sayi;
				}
				System.out.print(dizi[i][j]);
			}
			System.out.println();
		}

	}

}
