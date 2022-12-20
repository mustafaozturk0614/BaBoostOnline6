package com.bilgeadam.lesson029;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Dýþarýdan bir string deger alacaðýz 
 * 
 *bu string degerdeki her harfi kontrol edeceðiz tekrar edenleri bir sete 
 *tekrar etmeyenleri baþka bir sete atacagýz 
 * 
 * daha sonra bu iki seti yazdýracagýz
 * 
 * araba
 * 
 * tekrar edenler
 * a
 * tekrar etmeyenler
 * r
 * b
 * 
 */
public class SetOdev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scanner.nextLine();

		Set<Character> tekrarEdenler = new HashSet<>();
		Set<Character> tekrarEtmeyenler = new HashSet<>();

		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);
			if (!tekrarEdenler.contains(c) && !tekrarEtmeyenler.add(c)) {
				tekrarEtmeyenler.remove(c);
				tekrarEdenler.add(c);
			}
		}
		System.out.println("Tekrar edenler");
		for (Character character : tekrarEdenler) {
			System.out.println(character);
		}
		System.out.println("Tekrar etmeyenler");
		for (Character character : tekrarEtmeyenler) {
			System.out.println(character);
		}

	}

}
