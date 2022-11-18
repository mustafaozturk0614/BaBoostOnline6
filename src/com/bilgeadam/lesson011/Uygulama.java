package com.bilgeadam.lesson011;

import java.util.Random;
import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {

		TasKagitMakas tkm = new TasKagitMakas();

		String[] dizi = tkm.tasKag�tMakas;

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
				case "ta�":
					if (pcSecim.equalsIgnoreCase("Ka��t"))
						System.out.println("Kaybettiniz");
					else {
						System.out.println("Kazand�n�z");
					}

					break;
				case "ka��t":
					if (pcSecim.equalsIgnoreCase("Makas"))
						System.out.println("Kaybettiniz");
					else {
						System.out.println("KAzand�n�z");
					}

					break;
				case "makas":
					if (pcSecim.equalsIgnoreCase("Ta�"))
						System.out.println("Kaybettiniz");
					else {
						System.out.println("Kazand�n�z");
					}

					break;

				default:
					System.out.println("L�tfen Do�ru bir se�im yap�n�z");
					break;
				}

			}

			System.out.println("Tekrar Oynamak �stiyorsan�z E tu�una bas�n�z");
			kontrol = scanner.nextLine();
		} while (kontrol.equalsIgnoreCase("E"));

		System.out.println("Uygulama sonland� .....");

	}

	public static String secim() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen Ta� Ka��t ve Makas de�erlerinden birini giriniz");
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
