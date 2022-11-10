package com.bilgeadam.lesson005;

import java.util.Scanner;

// Dýþarýdan Bir kelime girin her harfi
// baþýna index numarasý kullanark alt alta yazdýrýnýz
public class Question26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {

			System.out.println(i + "-" + kelime.charAt(i));
		}

	}

}
