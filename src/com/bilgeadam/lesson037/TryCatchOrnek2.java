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
	/*
	 * throw // istisna f�rlatmak i�in kullan�yoruz // kendi kosullar�m�za uygulamak
	 * �zelle�tirmek i�in checked-- // bir �st�sna f�rlatmas�n� zorunlu hale
	 * getiriyoruz unckhecked--// bir zorunluluk yok extends RunTimeException
	 * 
	 * 1- throw f�rlatal�m - toplam2 metodu yazal�m sonra birtanede nullu kontrol
	 * eden ve null pointerexception f�rlatan bir metot yazal�m sonra bu kontrol
	 * metodunu toplam2 nin i�inde kullanal�m
	 */
	public static void main(String[] args) {
		String[] array = { "a", "10", "bc", null, "20" };

		// indexAl(array);
		// toplam(array);
		// Utility.stringTarihAlma();
		// Utility.intDegerAlma("L�tfen bir sayi giriniz");
		toplam4(array);
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

//uncheked exception f�rlatt�k
	public static String nullCheck(String deger) {

		if (deger == null) {

			throw new NullPointerException("Null deger olamaz!");
		}

		return deger;

	}

	// cheked exception f�rlatt�k
	public static String nullCheck2(String deger) throws Exception {

		if (deger == null) {

			throw new Exception("Null deger olamaz!");
		}

		return deger;

	}

	// uncheked exception f�rlatt�k
	public static String nullCheck3(String deger) throws NullPointerException {

		if (deger == null) {

			throw new NullPointerException("Null deger olamaz!");
		}

		return deger;

	}

	// kendi exception s�nf�m�z� f�rlatt�k (checked exception olarak )
	public static String nullCheck4(String deger) throws NullKontrolException {
		if (deger == null) {
			throw new NullKontrolException("Nul deger olmas�n!!!!!!");
		}
		return deger;
	}

	// throw ile f�rlatt�g�m�z exception'� yakalad�k
	public static void toplam2(String[] array) {

		int toplam = 0;
		int sayac = 0;
		String deger2 = "bos";
		for (String string : array) {

			try {
				deger2 = "bos";
				deger2 = nullCheck(string);
				int deger = Integer.parseInt(deger2);
				toplam += deger;
			} catch (Exception e) {
				System.out.println(e.toString());
				sayac++;
			} finally {
				System.out.println("finally:" + deger2);
			}

		}
		System.out.println("toplam= " + toplam);
		System.out.println("hata say�s�= " + sayac);

	}

//Checked exception yakald�k
	public static void toplam3(String[] array) {

		int toplam = 0;
		int sayac = 0;
		String deger2 = "bos";
		for (String string : array) {

			try {
				deger2 = "bos";
				deger2 = nullCheck2(string);
				int deger = Integer.parseInt(deger2);
				toplam += deger;
			} catch (Exception e) {
				System.out.println(e.toString());
				sayac++;
			} finally {
				System.out.println("finally:" + deger2);
			}

		}
		System.out.println("toplam= " + toplam);
		System.out.println("hata say�s�= " + sayac);

	}

	// Kendi eXception s�n�f�m�z� yakalada��m�z metot
	public static void toplam4(String[] array) {

		int toplam = 0;
		int sayac = 0;
		String deger2 = "bos";
		for (String string : array) {

			try {
				deger2 = "bos";
				deger2 = nullCheck4(string);
				int deger = Integer.parseInt(deger2);
				toplam += deger;
			} catch (NullKontrolException e) {
				System.out.println(e.toString());
				System.out.println(e.getMesaj());

				sayac++;
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			}

			finally {
				System.out.println("finally:" + deger2);
			}

		}
		System.out.println("toplam= " + toplam);
		System.out.println("hata say�s�= " + sayac);

	}
}
