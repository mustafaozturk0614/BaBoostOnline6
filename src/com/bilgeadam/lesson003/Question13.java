package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question13 {
	/*
	 * D��ar�dan taban de�eri birde �s de�eri alaca��z
	 * 
	 * ( 2 �zeri 5 gibi ) bu i�lemin sonucu bulan algoritma
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		long sonuc = 1;

		System.out.println("L�tfen taban de�erini giriniz");
		int taban = scanner.nextInt();
		System.out.println("L�tfen �s de�erini giriniz");
		int �s = scanner.nextInt();

		// boolean kontrol = taban == 0 && �s == 0;
		while (i <= �s) {
			sonuc *= taban;
			i++;
		}
		System.out.println(taban + "^" + �s + "= " + sonuc);

	}

}
