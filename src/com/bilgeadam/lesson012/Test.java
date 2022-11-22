package com.bilgeadam.lesson012;

import java.util.Scanner;

/*
 *  1.method D��ar�dan girilen harfle ba�layan illeri yazd�r.
 *  2-method illeri plaka kodlar� ile yazd�ran 
 *  method 01-Adana,02-Ad�yaman,03-Afyon 
 *  3-Girdi�imiz �ehrin ismine g�re plaka d�nen methodu yazal�m.
 * 4- 4.�lk harf hari� sesli harfleri silip yazd�ran fonksiyon.
 * 
 *  * 5.method bir �nceki methoddan d�nen D�erlerin ilk �� harfe al�n ve sonuna ... 
 * nokta ekleyin Adn... Ady... gibi
 * 
 *6.method bir �nceki methoddan d�nen dizide  B ile ba�layan illerin ba��na 1-Blk gibi yazd�ral�m
/ 7.method ikinci harfi a olanlar�n  ilk de�eri ve sadece ilk 3 harfini b�y�k yazd�r�n �ank�r�->�AN
 * 
 * 
 * 
 * 
 * 
 */
public class Test {

	public static void main(String[] args) {
		SehirDatabase database = new SehirDatabase();

		String[] iller = database.iller;

		// ileBa�layan�ller(iller);
		// plakayazd�r(iller);
		// ileBa�layan�ller(database.iller);
//		System.out.println(plakaBul2(iller));
//		System.out.println(plakaBul3(iller));

		// plakabul4(iller, "Ankara", "�stanbul", "�zmir", "Bolu");
		// String[] dizi = sesliHarfleriSil(iller);

		bileBaslayanlar(kisaltma(sesliHarfleriSil(iller)));
		ikinciHarfeGoreSorgulama(iller);

	}

	public static void ikinciHarfeGoreSorgulama(String[] dizi) {

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].charAt(1) == 'a') {

				System.out.println(dizi[i] + "===>" + dizi[i].substring(0, 3).toUpperCase());

			}

		}

	}

	public static void bileBaslayanlar(String[] dizi) {
		int count = 0;
		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].startsWith("B")) {
				count++;
				System.out.println(count + "-" + dizi[i]);
			}

		}

	}

	public static String[] kisaltma(String[] iller) {
//		String[] iller = sesliHarfleriSil(dizi);

		for (int i = 0; i < iller.length; i++) {
			if (iller[i].length() > 2) {
				iller[i] = iller[i].substring(0, 3) + "...";

			} else {
				iller[i] = iller[i] + "...";
			}
		}

		return iller;

	}

	public static String[] sesliHarfleriSil(String[] dizi) {
		String[] sesliHafrler = { "a", "e", "�", "i", "o", "�", "u", "�" };
		String[] yeniDizi = new String[dizi.length];

		for (int i = 0; i < dizi.length; i++) {
			yeniDizi[i] = dizi[i];
			for (int j = 0; j < sesliHafrler.length; j++) {
				if (yeniDizi[i].contains(sesliHafrler[j])) {
					yeniDizi[i] = yeniDizi[i].replace(sesliHafrler[j], "");

				}
			}
		}
		return yeniDizi;

	}

	public static void ileBa�layan�ller(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen Bir harf girin");
		String harf = scanner.nextLine();
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].startsWith(harf.toUpperCase().substring(0, 1))) {
				System.out.println(dizi[i]);
			}
		}
	}

	public static void plakayazd�r(String[] dizi) {

		for (int i = 0; i < dizi.length; i++) {

			if (i < 9) {
				System.out.println("0" + (i + 1) + "-" + dizi[i]);
			} else {
				System.out.println((i + 1) + "-" + dizi[i]);
			}

		}

	}

	public static void plakaBul(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen Bir harf girin");
		String sehir = scanner.nextLine();
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(sehir)) {

				if (i < 9) {
					System.out.println("0" + (i + 1) + "-" + dizi[i]);
				} else {
					System.out.println((i + 1) + "-" + dizi[i]);
				}
			}
		}

	}

	public static int plakaBul2(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen Bir harf girin");
		String sehir = scanner.nextLine();
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(sehir)) {
				return i + 1;
			}
		}
		return 0;

	}

	public static String plakaBul3(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen Bir harf girin");
		String sehir = scanner.nextLine();
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(sehir)) {

				if (i < 9) {
					String plaka = "0" + (i + 1) + "-" + dizi[i];
					return plaka;
				} else {
					return ((i + 1) + "-" + dizi[i]);
				}
			}
		}

		return " B�yle Bir il bulunamad�";

	}

	public static void plakabul4(String[] iller, String... il) {

		for (int i = 0; i < iller.length; i++) {

			for (int j = 0; j < il.length; j++) {
				if (iller[i].equalsIgnoreCase(il[j])) {

					if (i < 9) {
						System.out.println("0" + (i + 1) + "-" + iller[i]);
					} else {
						System.out.println((i + 1) + "-" + iller[i]);
					}
				}
			}

		}

	}
}
