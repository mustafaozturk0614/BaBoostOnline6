package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question27 {
	/*
	 * Dýþardýdan bir deðer alýcaðýz
	 * 
	 * içinde kaçtane a var bize deðerini döndürsün
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
		System.out.println("Kelimemizin içinde " + sayac + "tane a vardýr");

	}

}
