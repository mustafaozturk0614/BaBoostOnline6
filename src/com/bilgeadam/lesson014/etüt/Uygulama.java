package com.bilgeadam.lesson014.et�t;

import java.util.Scanner;

public class Uygulama {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		uygulamayiBaslat();

	}

	public static void kitapEkle(Kutuphane kutuphane) {
		Kitap kitap = new Kitap();
		Yazar yazar = new Yazar();
		System.out.println("L�tfen kitap ismi giriniz");
		kitap.isim = scanner.nextLine();
		System.out.println("L�tfen Yazar ismi giriniz");
		String yazarIsimi = scanner.nextLine();
		kitap.yazar = kutuphane.yazarKontrol(yazarIsimi);
		System.out.println("L�tfen sayfa say�s�n�  giriniz");
		kitap.sayfaSayisi = scanner.nextInt();
		kutuphane.kitapListesi[Kutuphane.index] = kitap;
		Kutuphane.index++;

	}

	public static void menu() {

		System.out.println("1-Kitap Ekle");
		System.out.println("2-Kitap Sil");
		System.out.println("3-Kitap ismine g�re ara");
		System.out.println("4-Yazar ismine g�re ara");
		System.out.println("5-Kitaplari listele");
		System.out.println("6-Yazarlar� listele");
		System.out.println("0-��k��");
	}

	public static int secimYap() {
		System.out.println("L�tfen i�lem se�iniz");

		return scanner.nextInt();

	}

	public static void uygulamayiBaslat() {
		Kutuphane kutuphane = new Kutuphane();
		kutuphane.boyut = 5;
		kutuphane.kitapListesi = new Kitap[kutuphane.boyut];

		Kitap[] kitapListesi = kutuphane.kitapListesi;

		int kontrol = 0;

		do {
			menu();
			kontrol = secimYap();
			scanner.nextLine();
			switch (kontrol) {
			case 1:
				kitapEkle(kutuphane);
				break;

			case 5:
				kitaplariListele(kutuphane.kitapListesi);
				break;
			case 0:
				System.out.println("��k�� yap�l�yor.....");
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
