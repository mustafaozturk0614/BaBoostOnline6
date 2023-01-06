package com.bilgeadam.lesson038;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

/*
 * String olarak aldýðýmýz tarihi localdate olarak bize doenen bir meteod yazalým
 * dogru deger girine kadar tarih degeri alalým 
 * 
 * 
 * 
 */
public class Utility {

	static Scanner scanner = new Scanner(System.in);

	public static String stringDegerAlma(String sorgu) {

		System.out.println(sorgu);
		return scanner.nextLine();
	}

	public static int intDegerAlma(String sorgu) {
		boolean kontrol = false;
		// Integer deger = null; 2 int degerden birini tercih edebilirsiniz
		int deger = 0;
		do {
			try {
				System.out.println(sorgu);
				deger = Integer.parseInt(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println("Lütfen bir rakam deðeri giriniz");
				kontrol = true;
			}
		} while (kontrol);
		return deger;
	}

	public static double doubleDegerAlma(String sorgu) {
		boolean kontrol = false;
		// Integer deger = null; 2 int degerden birini tercih edebilirsiniz
		double deger = 0;
		do {
			try {
				System.out.println(sorgu);
				deger = Double.parseDouble(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println("Lütfen bir rakam deðeri giriniz");
				kontrol = true;
			}
		} while (kontrol);
		return deger;
	}

	public static int randomSayýUret(int baslangic, int bitis) {
		Random random = new Random();
		return random.nextInt(baslangic, bitis);
	}

	public static LocalDate stringTarihAlma() {
		boolean kontrol = false;
		LocalDate date = null;
		do {
			try {
				date = LocalDate.parse(stringDegerAlma("Lütfen bir tarih degeri giriniz(yýl-ay-gün)"));
				kontrol = false;
			} catch (DateTimeParseException e) {
				System.out.println(e.toString());
				System.out.println("Gridiginiz tarih degeri hatalýdýr lütfen ornekteki gibi giriniz (2023-01-20)");
				kontrol = true;
			}
		} while (kontrol);

		return date;
	}

}
