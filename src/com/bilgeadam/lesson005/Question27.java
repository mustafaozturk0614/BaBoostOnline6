package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question27 {
	/*
	 * D��ard�dan bir de�er al�ca��z
	 * 
	 * i�inde ka�tane a var bize de�erini d�nd�rs�n
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kelime = scanner.nextLine();
		int sayac = 0;

		for (int i = 0; i < kelime.length(); i++) {

			if (kelime.charAt(i) == 'a') {
				sayac++;
			}

		}
		System.out.println("Kelimemizin i�inde " + sayac + "tane a vard�r");

	}

}
