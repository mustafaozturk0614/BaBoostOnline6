package com.bilgeadam.lesson005;

import java.util.Scanner;

// D��ar�dan Bir kelime girin her harfi
// ba��na index numaras� kullanark alt alta yazd�r�n�z
public class Question26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {

			System.out.println(i + "-" + kelime.charAt(i));
		}

	}

}
