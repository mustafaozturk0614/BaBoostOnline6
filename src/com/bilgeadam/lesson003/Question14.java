package com.bilgeadam.lesson003;

/*
 * 
 * 
 */
public class Question14 {
	/*
	 * a dan z ye kadar alafabeyi yazdýralým ;
	 * 
	 */
	public static void main(String[] args) {

		char harf;

		for (harf = 'a'; harf <= 'z'; harf++) {

			System.out.print(harf + " ");
		}

		System.out.println();

		char karakter = 97;
		while (karakter >= 97 && karakter <= 122) {

			System.out.print(karakter + " ");
			karakter++;

		}
		System.out.println();
		for (char i = 97; i <= 122; i++) {

			System.out.print(i + " ");
		}

	}

}
