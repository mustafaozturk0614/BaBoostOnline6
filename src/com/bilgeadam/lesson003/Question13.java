package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question13 {
	/*
	 * Dýþarýdan taban deðeri birde üs deðeri alacaðýz
	 * 
	 * ( 2 üzeri 5 gibi ) bu iþlemin sonucu bulan algoritma
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		long sonuc = 1;

		System.out.println("Lütfen taban deðerini giriniz");
		int taban = scanner.nextInt();
		System.out.println("Lütfen üs deðerini giriniz");
		int üs = scanner.nextInt();

		// boolean kontrol = taban == 0 && üs == 0;
		while (i <= üs) {
			sonuc *= taban;
			i++;
		}
		System.out.println(taban + "^" + üs + "= " + sonuc);

	}

}
