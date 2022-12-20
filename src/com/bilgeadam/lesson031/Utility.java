package com.bilgeadam.lesson031;

import java.util.Random;
import java.util.Scanner;

public class Utility {

	static Scanner scanner = new Scanner(System.in);

	public static String stringDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}

	public static int intDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return Integer.parseInt(scanner.nextLine());
	}

	public static int randomSay�Uret(int baslangic, int bitis) {
		Random random = new Random();
		return random.nextInt(baslangic, bitis);
	}

}
