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
	/*
	 * throw // istisna fýrlatmak için kullanýyoruz // kendi kosullarýmýza uygulamak
	 * özelleþtirmek için checked-- // bir ýstýsna fýrlatmasýný zorunlu hale
	 * getiriyoruz unckhecked--// bir zorunluluk yok extends RunTimeException
	 * 
	 * 1- throw fýrlatalým - toplam2 metodu yazalým sonra birtanede nullu kontrol
	 * eden ve null pointerexception fýrlatan bir metot yazalým sonra bu kontrol
	 * metodunu toplam2 nin içinde kullanalým
	 */
	public static void main(String[] args) {
		String[] array = { "a", "10", "bc", null, "20" };

		// indexAl(array);
		// toplam(array);
		// Utility.stringTarihAlma();
		// Utility.intDegerAlma("Lütfen bir sayi giriniz");
		toplam4(array);
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

//uncheked exception fýrlattýk
	public static String nullCheck(String deger) {

		if (deger == null) {

			throw new NullPointerException("Null deger olamaz!");
		}

		return deger;

	}

	// cheked exception fýrlattýk
	public static String nullCheck2(String deger) throws Exception {

		if (deger == null) {

			throw new Exception("Null deger olamaz!");
		}

		return deger;

	}

	// uncheked exception fýrlattýk
	public static String nullCheck3(String deger) throws NullPointerException {

		if (deger == null) {

			throw new NullPointerException("Null deger olamaz!");
		}

		return deger;

	}

	// kendi exception sýnfýmýzý fýrlattýk (checked exception olarak )
	public static String nullCheck4(String deger) throws NullKontrolException {
		if (deger == null) {
			throw new NullKontrolException("Nul deger olmasýn!!!!!!");
		}
		return deger;
	}

	// throw ile fýrlattýgýmýz exception'ý yakaladýk
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
		System.out.println("hata sayýsý= " + sayac);

	}

//Checked exception yakaldýk
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
		System.out.println("hata sayýsý= " + sayac);

	}

	// Kendi eXception sýnýfýmýzý yakaladaðýmýz metot
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
		System.out.println("hata sayýsý= " + sayac);

	}
}
