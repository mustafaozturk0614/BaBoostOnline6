package com.bilgeadam.lesson006;

/**
 * 
 * =Java,React,Spring
 * 
 * split kullanmadan virgülden bölüp
 * 
 * bir for döngüsü içinde Java React Spring
 * 
 *
 */

public class Question28 {

	public static void main(String[] args) {

		String ifade = "Java,React,Spring,Google";
		int index = 0;
		for (int i = 0; i < ifade.length(); i++) {

			if (ifade.charAt(i) == ',') {
				System.out.println(ifade.substring(index, i));
				index = i + 1;
			}
		}
		System.out.println(ifade.substring(index));
		System.out.println("//////////////////////////");
		for (int i = 0; i < ifade.length(); i++) {

			if (ifade.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.print(ifade.charAt(i));
			}
		}
		System.out.println();
		System.out.println("//////////////////////////");

		ifade = ifade.replace(",", "\n");
		System.out.println(ifade);

	}

}
