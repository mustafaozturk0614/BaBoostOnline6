package com.bilgeadam.lesson012;

import java.util.Scanner;

/*
 *  1.method Dýþarýdan girilen harfle baþlayan illeri yazdýr.
 *  2-method illeri plaka kodlarý ile yazdýran 
 *  method 01-Adana,02-Adýyaman,03-Afyon 
 *  3-Girdiðimiz þehrin ismine göre plaka dönen methodu yazalým.
 * 4- 4.Ýlk harf hariç sesli harfleri silip yazdýran fonksiyon.
 * 
 *  * 5.method bir önceki methoddan dönen Dðerlerin ilk üç harfe alýn ve sonuna ... 
 * nokta ekleyin Adn... Ady... gibi
 * 
 *6.method bir önceki methoddan dönen dizide  B ile baþlayan illerin baþýna 1-Blk gibi yazdýralým
/ 7.method ikinci harfi a olanlarýn  ilk deðeri ve sadece ilk 3 harfini büyük yazdýrýn Çankýrý->ÇAN
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

		// ileBaþlayanÝller(iller);
		// plakayazdýr(iller);
		// ileBaþlayanÝller(database.iller);
//		System.out.println(plakaBul2(iller));
//		System.out.println(plakaBul3(iller));

		// plakabul4(iller, "Ankara", "Ýstanbul", "Ýzmir", "Bolu");
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
		String[] sesliHafrler = { "a", "e", "ý", "i", "o", "ö", "u", "ü" };
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

	public static void ileBaþlayanÝller(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir harf girin");
		String harf = scanner.nextLine();
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].startsWith(harf.toUpperCase().substring(0, 1))) {
				System.out.println(dizi[i]);
			}
		}
	}

	public static void plakayazdýr(String[] dizi) {

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
		System.out.println("Lütfen Bir harf girin");
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
		System.out.println("Lütfen Bir harf girin");
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
		System.out.println("Lütfen Bir harf girin");
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

		return " Böyle Bir il bulunamadý";

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
