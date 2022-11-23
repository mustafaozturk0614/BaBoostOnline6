package com.bilgeadam.lesson014;

import java.util.Scanner;

/*
 * 
 * 			System.out.println("1-Kay�t Ol");
			System.out.println("2-Giri� Yap");
			System.out.println("3-Kullan�c�lar� g�ster");
			System.out.println("4-��k��");
 * 
 * 
 * 
 * 
 * 1- menum�z� olu�turaca��z 
 * 2-se�im yapaca��z 
 * 3-se�ime g�re metotolar� yazaca��z
 * 3-1 Kay�t ol metodu yazal�m () bizden bilgilerimizi alacak gidecek databse 
 * s�n�f�ndaki listeye kullan�c�y� ekleyecek 
 * 
 * 
 */
public class Uygulama {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Database.veriTaban�Baslang�cDegerleri();
		uygulamayiBaslat();

	}

	public static void menu() {

		System.out.println("1-Kay�t Ol");
		System.out.println("2-Giri� Yap");
		System.out.println("3-Kullan�c�lar� g�ster");
		System.out.println("4-��k��");
	}

	public static int secimYap() {
		System.out.println("L�tfen i�lem se�iniz");

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
			System.out.println("L�tfen Email adresisiniz giriniz");
			String email = scanner.nextLine();
			System.out.println("L�tfen �ifrenizi giriniz");
			String sifre = scanner.nextLine();

			if (!Database.kullaniciVarmi(email, sifre)) {
				System.out.println("�ifre veya email hatal�");
				System.out.println(sayac - 1 + " kadar hakk�n�z kald�");
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
//					System.out.println("Ho�geldiniz==>" + kullaniciListesi[i].isim);
//					return true;
//				}
//			}
//		}
//		return false;
//
//	}

	public static void kayitOl() {
		Kullanici kullanici = new Kullanici();
		System.out.println("L�tfen �sminizi giriniz");
		kullanici.isim = scanner.nextLine();
		System.out.println("L�tfen email giriniz");
		kullanici.email = scanner.nextLine();
		System.out.println("L�tfen �ifrenizi giriniz");
		kullanici.password = scanner.nextLine();
		kullanici.id = Database.uzunluk + 1;

		Database.kullanc�Ekle(kullanici);

		System.out.println("Liste boyutu" + Database.kullaniciListesi.length);

	}

}
