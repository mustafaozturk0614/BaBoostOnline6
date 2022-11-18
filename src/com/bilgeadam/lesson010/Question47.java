package com.bilgeadam.lesson010;

import java.util.Scanner;

public class Question47 {

	/*
	 * 
	 * System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
	 * System.out.println("2- ��kar"); System.out.println("3- �arp");
	 * System.out.println("4- B�l"); System.out.println("0- ��k��");
	 * System.out.println("Bir i�lem Se�iniz");
	 * 
	 * bir d�ng�m�z olucak bu d�ng�de i�lem se�ece�iz 1- toplama kullan�can = alana
	 * kadar girilen say�lar� toplas�n ve ekrana yazd�rs�n; *
	 * 
	 * 5- iki asy� girece�iz bu say�lar�n ebob ve ekokunu hesaplay�p bize yazd�rs�n
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
		System.out.println("2- ��kar");
		System.out.println("3- �arp");
		System.out.println("4- B�l");
		System.out.println("5- Ebob ve Ekok");
		System.out.println("0- ��k��");
	}

	public static int islemSec() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen Bir i�lem Seciniz");
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

			case 4:
				System.out.println(bolme());

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
			System.out.println("L�tfen bir say� giriniz");
//			int sayi = scanner.nextInt();
			sayi2 = scanner.nextLine();
//			scanner.nextLine();
			if (!sayi2.equals("=")) {
				toplam += Integer.parseInt(sayi2);
			}

//			System.out.println("��lemi sonland�rmak i�in = tu�una bas�n�z devam etmek i�in herhabgi bir tu�a bas�n�z ");
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

	public static double bolme() {
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		double bolum = 1;
		int count = 0;
		do {
			System.out.println("L�tfen Bir say� giriniz");
			sayi = scanner.nextLine();
			count++;

			if (!sayi.equals("=")) {
				if (count == 1) {
					bolum = Double.parseDouble(sayi);
				} else if (sayi.equals("0")) {

					System.out.println("l�tfen 0 dan ba�ka say� giriniz");
				} else {
					bolum /= Double.parseDouble(sayi);
				}

			}

		} while (!sayi.equals("="));
		return bolum;
	}

}
