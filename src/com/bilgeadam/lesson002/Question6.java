package com.bilgeadam.lesson002;

import java.util.Scanner;

/**
 * 
 * Dairenin alanı ve çevresini bulalım
 * 
 * yarı çapı dışarıdan gireceğiz
 * 
 * pi=3.14
 *
 */
public class Question6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float pi = 3.14f, alan, yariCap, cevre;

		System.out.println("L�tfen bir yar�cap degeri giriniz :");
		yariCap = scan.nextFloat();

		System.out.println("L�tfen string bir degeri giriniz :");

		// sayısal değerlerden sonra String bir değer alacak isek bir tane
		// bos scan.nextline yazıyoruz
		scan.nextLine();
		String value = scan.nextLine();
		alan = pi * yariCap * yariCap;
		// alan = (float) (pi * Math.pow(yarıCap, 2));
		cevre = 2 * pi * yariCap;
		scan.close();
		System.out.println("Dairenin alanı :" + alan + "\nDairenin çevresi :" + cevre);
		System.out.println("value=>>" + value);

	}

}
