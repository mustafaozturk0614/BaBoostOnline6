package com.bilgeadam.lesson037;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Bir metot ile dýþarýdan bir index degeri alalým sonra o indexedeki deðeri yazdýralým 
 * hata varsada try catch ile yakalayalým
 * 
 * 2- Array uzerinde gezelim sayýsal degerleri integerecevirip bir toplama iþlemi yapacagýz 
 * yani bir toplama metodu yazacagýz en sonunda toplamý ve hata sayýsýný yazdýralým 
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
		System.out.println("Lütfen bir index degeri giriniz");
		try {
			int index = scanner.nextInt();
			String deger = array[index];
			System.out.println("girdiginiz indexdeki deger: " + deger);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girdiðiniz index dizinin boyutlarý dýsýndadýr lütfen 0 ile" + (array.length - 1)
					+ "arasýnda bir deger giriniz");
			System.out.println(e.toString());
		} catch (InputMismatchException e) {
			System.out.println("Lütfen index degerini bir rakam olarak giriniz");
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
		System.out.println("hata sayýsý= " + sayac);

	}

}
