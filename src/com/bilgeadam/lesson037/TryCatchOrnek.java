package com.bilgeadam.lesson037;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 *bir tane bolme metodum olsun iki parametre als�n d�sardan sonra bolme i�lemini yap�p sonucu donsun 
 *
 * 
 *main de for donsu kuracag�z  3 kere �al�ss�n bu for dongusu i�indede try catch yap�s�n� kullanal�m 
 */
public class TryCatchOrnek {
//	static List<String> list;

	public static double bolme() {

		double bolum = 0;
		boolean kontrol = false;
		do {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("L�tfen birinci say�y� giriniz");
				int sayi1 = scanner.nextInt();
				System.out.println("L�tfen ikinci  say�y� giriniz");
				int sayi2 = scanner.nextInt();
				kontrol = false;
				bolum = sayi1 / sayi2;
			} catch (InputMismatchException e) {
				System.out.println("L�tfen sadece rakam giriniz");
				System.out.println(e.toString());
				kontrol = true;
			} catch (Exception e) {
				System.out.println("Beklenmedik bir hata");
				System.out.println(e.toString());
			}

		} while (kontrol);

		return bolum;

	}

	public static void main(String[] args) {
//		try {
//			list.add("1");
//		} catch (Exception e) {
//			System.out.println(e.toString());
//			System.out.println("----------");
//			System.out.println(e.getMessage());
//			System.out.println("----------");
//			e.printStackTrace();
//		}
//
//		System.out.println("Uygulamam devam ediyor");

		for (int i = 0; i < 3; i++) {
			try {
				bolme();
			} catch (ArithmeticException e) {
				System.out.println("2.sayi 0 olamaz");
				System.out.println(e.toString());
			}

		}

	}
}
