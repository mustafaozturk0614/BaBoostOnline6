package com.bilgeadam.lesson027;

import java.util.Scanner;
import java.util.Stack;

/*
 * 
 * dýþarýdan bir metin gireceðiz sonra bu metini bir stack e atayacagýz
 * 
 * daha sonrada palindrom olup olmadýgýný kontrol eden metodu yazalým 
 * 
 * 
 */
public class PalindromStack {

	Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {
		PalindromStack palindromStack = new PalindromStack();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scanner.nextLine();

		if (palindromStack.isPalindrom(kelime)) {
			System.out.println(kelime + " Palindromdur");
		} else {
			System.out.println(kelime + " Palindrom deðildir !!!");
		}

	}

	public void stackOlusturma(String kelime) {

		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}

//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//
//		}
	}

	public boolean isPalindrom(String kelime) {

		stackOlusturma(kelime);

		for (int i = 0; i < kelime.length() / 2; i++) {

			if (kelime.charAt(i) != stack.pop()) {
				return false;
			}
		}

		return true;

	}

}
