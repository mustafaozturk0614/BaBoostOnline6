package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Kullan�c�dan al�nan bir say�n�n carp�m tablosunu yazd�ral�m 
 * 
 * 10 a kadar 
 * 
 * 1X1=1
 * 1x2=2
 * ...
 * 
 */
public class Question9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen bir sayi giriniz");
		int s1 = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			int carpim = s1 * i;
			System.out.println(s1 + "X" + i + "=" + carpim);
		}
	}

}
