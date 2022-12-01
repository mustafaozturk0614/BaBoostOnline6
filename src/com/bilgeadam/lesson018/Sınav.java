package com.bilgeadam.lesson018;

import java.util.Scanner;

public class S�nav {

	String ders;
	String konu;
	int s�navNo;
	int soruSayisi;
	long s�re;
	String tarih;
	Soru[] sorular;
	String[] cevaplar;
	String[] cevapSecenekleri = { "A", "B", "C", "D" };

	public void s�navOlustur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen s�nav konusun giriniz");
		konu = scanner.nextLine();
		System.out.println("L�tfen soru say�s�n� giriniz");
		soruSayisi = Integer.parseInt(scanner.nextLine());
		System.out.println("L�tfen s�nav s�resini giriniz");
		s�re = Long.parseLong(scanner.nextLine());
		sorular = new Soru[soruSayisi];
		for (int i = 0; i < sorular.length; i++) {
			Soru soru = new Soru();
			soru.soruOlustur(cevapSecenekleri);
			sorular[i] = soru;
		}

	}

	public void cevaplar�Gir() {
		Scanner scanner = new Scanner(System.in);
		cevaplar = new String[sorular.length];

		for (int i = 0; i < sorular.length; i++) {
			System.out.println(sorular[i].i�erik);

			for (int j = 0; j < sorular[i].cevapIcerikleri.length; j++) {

				System.out.println(cevapSecenekleri[j] + "-)" + sorular[i].cevapIcerikleri[j]);
			}
			System.out.println("L�tfen cevab�n�z� giriniz");
			cevaplar[i] = scanner.nextLine().toUpperCase();
		}

	}

	public void cevaplar�KontrolEt() {
		int dogrucevapSayisi = 0;
		int puan = 0;
		for (int i = 0; i < sorular.length; i++) {

			if (cevaplar[i].equals(sorular[i].dogruCevap)) {
				dogrucevapSayisi++;
				puan += sorular[i].puan;
			}
		}

		System.out.println("do�ru cevap say�n�z= " + dogrucevapSayisi);
		System.out.println("yanl�� cevap say�n�z= " + (sorular.length - dogrucevapSayisi));
		System.out.println("toplam puan= " + puan);

	}

}
