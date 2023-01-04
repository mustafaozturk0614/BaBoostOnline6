package com.bilgeadam.lesson037;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Bir metot ile d��ar�dan bir index degeri alal�m sonra o indexedeki de�eri yazd�ral�m 
 * hata varsada try catch ile yakalayal�m
 * 
 * 2- Array uzerinde gezelim say�sal degerleri integerecevirip bir toplama i�lemi yapacag�z 
 * yani bir toplama metodu yazacag�z en sonunda toplam� ve hata say�s�n� yazd�ral�m 
 * 
 */
public class TryCatchOrnek2 {

	public static void main(String[] args) {
		String[] array = { "a", "10", "bc", null, "20" };

		// indexAl(array);
		// toplam(array);
		Utility.stringTarihAlma();
	}

	public static void indexAl(String[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen bir index degeri giriniz");
		try {
			int index = scanner.nextInt();
			String deger = array[index];
			System.out.println("girdiginiz indexdeki deger: " + deger);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdi�iniz index dizinin boyutlar� d�s�ndad�r l�tfen 0 ile" + (array.length - 1)
					+ "aras�nda bir deger giriniz");
			System.out.println(e.toString());
		} catch (InputMismatchException e) {
			System.out.println("L�tfen index degerini bir rakam olarak giriniz");
			System.out.println(e.toString());
		}

	}

	public static void toplam(String[] array) {

		int toplam = 0;
		int sayac = 0;

		for (String string : array) {

			try {
				int deger = Integer.parseInt(string);
				toplam += deger;
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			} finally {
				System.out.println("finally:" + string);
			}

		}
		System.out.println("toplam= " + toplam);
		System.out.println("hata say�s�= " + sayac);

	}

}
