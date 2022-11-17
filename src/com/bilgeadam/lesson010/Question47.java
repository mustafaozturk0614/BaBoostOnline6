package com.bilgeadam.lesson010;

import java.util.Scanner;

public class Question47 {

	/*
	 * 
	 * System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
	 * System.out.println("2- Çýkar"); System.out.println("3- Çarp");
	 * System.out.println("4- Böl"); System.out.println("0- Çýkýþ");
	 * System.out.println("Bir iþlem Seçiniz");
	 * 
	 * bir döngümüz olucak bu döngüde iþlem seçeceðiz 1- toplama kullanýcan = alana
	 * kadar girilen sayýlarý toplasýn ve ekrana yazdýrsýn; *
	 * 
	 * 5- iki asyý gireceðiz bu sayýlarýn ebob ve ekokunu hesaplayýp bize yazdýrsýn
	 * 
	 * ekok=sayi*sayi2/ebob
	 * 
	 */
	public static void main(String[] args) {
		uygulama();
	}

	public static void menu() {
		System.out.println("==Hesap makinesi===\n");
		System.out.println("1- Topla");
		System.out.println("2- Çýkar");
		System.out.println("3- Çarp");
		System.out.println("4- Böl");
		System.out.println("5- Ebob ve Ekok");
		System.out.println("0- Çýkýþ");
	}

	public static int islemSec() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir iþlem Seciniz");
		return scanner.nextInt();
	}

	public static void uygulama() {
		int islem = 0;

		do {
			menu();
			islem = islemSec();
			switch (islem) {
			case 1:
				System.out.println(topla());
				break;
			case 2:
				System.out.println(cikarma());
				break;

			case 5:
				ebobEkok();
				break;
			default:
				break;
			}

		} while (islem != 0);

	}

	public static int topla() {
		Scanner scanner = new Scanner(System.in);
		String deger = "";
		int toplam = 0;
		String sayi2 = "";

		do {
			System.out.println("Lütfen bir sayý giriniz");
//			int sayi = scanner.nextInt();
			sayi2 = scanner.nextLine();
//			scanner.nextLine();
			if (!sayi2.equals("=")) {
				toplam += Integer.parseInt(sayi2);
			}

//			System.out.println("Ýþlemi sonlandýrmak için = tuþuna basýnýz devam etmek için herhabgi bir tuþa basýnýz ");
//			deger = scanner.nextLine();
		} while (!sayi2.equals("="));
		return toplam;
	}

	public static int cikarma() {
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		int sonuc = 0;
		int sayac = 0;
		do {
			System.out.println("Bir sayi giriniz");
			sayi = scanner.nextLine();
			sayac++;

			if (!sayi.equals("=")) {
				if (sayac == 1) {
					sonuc = Integer.parseInt(sayi);
				} else {
					sonuc -= Integer.parseInt(sayi);
				}
			}

		} while (!sayi.equals("="));
		return sonuc;
	}

	public static void ebobEkok() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("Bir sayi giriniz");
		int sayi2 = scanner.nextInt();
		int ebob = 1;
		int count;

		if (sayi1 > sayi2) {

			count = sayi2;
		} else {
			count = sayi1;
		}

		while (count > 0) {

			if (sayi1 % count == 0 && sayi2 % count == 0) {
				ebob = count;
				break;
			}
			count--;
		}
		int ekok = sayi1 * sayi2 / ebob;
		System.out.println("ebob=" + ebob + "\n" + "ekok=" + ekok);

	}

}
