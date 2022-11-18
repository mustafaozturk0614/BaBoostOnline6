package com.bilgeadam.lesson011;

import java.util.Random;
import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {

		TasKagitMakas tkm = new TasKagitMakas();

		String[] dizi = tkm.tasKagýtMakas;

		uygulama(dizi);
//	

	}

	public static void uygulama(String[] dizi) {
		Scanner scanner = new Scanner(System.in);

		String kontrol = "";

		do {
			String pcSecim = rastgeleHamle(dizi).toLowerCase();
			String benimSecimim = secim().toLowerCase();
			if (pcSecim.equalsIgnoreCase(benimSecimim)) {
				System.out.println("Beraberlik");
			} else {

				switch (benimSecimim) {
				case "taþ":
					if (pcSecim.equalsIgnoreCase("Kaðýt"))
						System.out.println("Kaybettiniz");
					else {
						System.out.println("Kazandýnýz");
					}

					break;
				case "kaðýt":
					if (pcSecim.equalsIgnoreCase("Makas"))
						System.out.println("Kaybettiniz");
					else {
						System.out.println("KAzandýnýz");
					}

					break;
				case "makas":
					if (pcSecim.equalsIgnoreCase("Taþ"))
						System.out.println("Kaybettiniz");
					else {
						System.out.println("Kazandýnýz");
					}

					break;

				default:
					System.out.println("Lütfen Doðru bir seçim yapýnýz");
					break;
				}

			}

			System.out.println("Tekrar Oynamak Ýstiyorsanýz E tuþuna basýnýz");
			kontrol = scanner.nextLine();
		} while (kontrol.equalsIgnoreCase("E"));

		System.out.println("Uygulama sonlandý .....");

	}

	public static String secim() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Taþ Kaðýt ve Makas deðerlerinden birini giriniz");
		String secim = scanner.nextLine();

		return secim;

	}

	public static boolean kontrol(String secim, String[] dizi) {
		boolean kontrol = false;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(secim)) {
				kontrol = true;

			} else {
				kontrol = false;
			}

		}
		return kontrol;
	}

	public static String rastgeleHamle(String[] dizi) {

		Random random = new Random();
		int sayi = random.nextInt(dizi.length);

		return dizi[sayi];

	}
}
