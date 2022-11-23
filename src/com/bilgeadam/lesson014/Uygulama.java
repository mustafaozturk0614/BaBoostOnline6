package com.bilgeadam.lesson014;

import java.util.Scanner;

/*
 * 
 * 			System.out.println("1-Kayýt Ol");
			System.out.println("2-Giriþ Yap");
			System.out.println("3-Kullanýcýlarý göster");
			System.out.println("4-Çýkýþ");
 * 
 * 
 * 
 * 
 * 1- menumüzü oluþturacaðýz 
 * 2-seçim yapacaðýz 
 * 3-seçime göre metotolarý yazacaðýz
 * 3-1 Kayýt ol metodu yazalým () bizden bilgilerimizi alacak gidecek databse 
 * sýnýfýndaki listeye kullanýcýyý ekleyecek 
 * 
 * 
 */
public class Uygulama {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Database.veriTabanýBaslangýcDegerleri();
		uygulamayiBaslat();

	}

	public static void menu() {

		System.out.println("1-Kayýt Ol");
		System.out.println("2-Giriþ Yap");
		System.out.println("3-Kullanýcýlarý göster");
		System.out.println("4-Çýkýþ");
	}

	public static int secimYap() {
		System.out.println("Lütfen iþlem seçiniz");

		return scanner.nextInt();

	}

	public static void uygulamayiBaslat() {

		int kontrol = 4;
		do {

			menu();
			kontrol = secimYap();
			scanner.nextLine();
			switch (kontrol) {
			case 1:

				kayitOl();

				break;
			case 2:
				girisYap();
				break;
			case 3:
				kullanicilariListele();

			default:
				break;
			}

		} while (kontrol != 4);

	}

	private static void kullanicilariListele() {

		Kullanici[] kullaniciListesi = Database.kullaniciListesi;

		for (int i = 0; i < Database.uzunluk; i++) {

			System.out.println((i + 1) + "-" + kullaniciListesi[i].isim + "--->" + kullaniciListesi[i].email);

		}

		System.out.println("Liste boyutu" + Database.kullaniciListesi.length);

	}

	public static void girisYap() {

		int sayac = 3;

		while (sayac != 0) {
			System.out.println("Lütfen Email adresisiniz giriniz");
			String email = scanner.nextLine();
			System.out.println("Lütfen þifrenizi giriniz");
			String sifre = scanner.nextLine();

			if (!Database.kullaniciVarmi(email, sifre)) {
				System.out.println("Þifre veya email hatalý");
				System.out.println(sayac - 1 + " kadar hakkýnýz kaldý");
				sayac--;
			} else {
				break;
			}

		}

	}

//	public static boolean kullaniciVarmi(String email, String password) {
//		Kullanici[] kullaniciListesi = Database.kullaniciListesi;
//		for (int i = 0; i < Database.kullaniciListesi.length; i++) {
//			if (kullaniciListesi[i] != null) {
//
//				if (kullaniciListesi[i].email.equalsIgnoreCase(email)
//						&& kullaniciListesi[i].password.equals(password)) {
//					System.out.println("Hoþgeldiniz==>" + kullaniciListesi[i].isim);
//					return true;
//				}
//			}
//		}
//		return false;
//
//	}

	public static void kayitOl() {
		Kullanici kullanici = new Kullanici();
		System.out.println("Lütfen Ýsminizi giriniz");
		kullanici.isim = scanner.nextLine();
		System.out.println("Lütfen email giriniz");
		kullanici.email = scanner.nextLine();
		System.out.println("Lütfen þifrenizi giriniz");
		kullanici.password = scanner.nextLine();
		kullanici.id = Database.uzunluk + 1;

		Database.kullancýEkle(kullanici);

		System.out.println("Liste boyutu" + Database.kullaniciListesi.length);

	}

}
