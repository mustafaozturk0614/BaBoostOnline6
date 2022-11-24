package com.bilgeadam.lesson014.etüt;

import java.util.Scanner;

public class Uygulama {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		uygulamayiBaslat();

	}

	public static void kitapEkle(Kutuphane x) {
		Kitap kitap = new Kitap();
		Yazar yazar = new Yazar();
		System.out.println("Lütfen kitap ismi giriniz");
		kitap.isim = scanner.nextLine();
		System.out.println("Lütfen Yazar ismi giriniz");
		String yazarIsimi = scanner.nextLine();
		kitap.yazar = x.yazarKontrol(yazarIsimi);
		System.out.println("Lütfen sayfa sayýsýný  giriniz");
		kitap.sayfaSayisi = scanner.nextInt();
		x.kitapListesi[Kutuphane.index] = kitap;
		Kutuphane.index++;
	}

	public static void menu() {
		System.out.println("1-Kitap Ekle");
		System.out.println("2-Kitap Sil");
		System.out.println("3-Kitap ismine göre ara");
		System.out.println("4-Yazar ismine göre ara");
		System.out.println("5-Kitaplari listele");
		System.out.println("6-Yazarlarý listele");
		System.out.println("0-Çýkýþ");
	}

	public static int secimYap() {
		System.out.println("Lütfen iþlem seçiniz");

		return scanner.nextInt();

	}

	public static void uygulamayiBaslat() {
		Kutuphane benimKutuphanem = new Kutuphane();
		benimKutuphanem.kitapListesi = new Kitap[50];

		// String[] array = new String[5];

		int kontrol = 0;

		do {
			menu();
			kontrol = secimYap();
			scanner.nextLine();
			switch (kontrol) {
			case 1:
				kitapEkle(benimKutuphanem);

				break;

			case 5:
				kitaplariListele(benimKutuphanem.kitapListesi);
				break;
			case 0:
				System.out.println("Çýkýþ yapýlýyor.....");
				break;
			default:

				break;
			}

		} while (kontrol != 0);

	}

	public static void kitaplariListele(Kitap[] kitapListesi) {

		for (int i = 0; i < kitapListesi.length; i++) {

			if (kitapListesi[i] != null) {

				System.out.println(kitapListesi[i].isim + "-" + kitapListesi[i].yazar.isim);
			}

		}

	}

}
