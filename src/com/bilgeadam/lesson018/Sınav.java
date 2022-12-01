package com.bilgeadam.lesson018;

import java.util.Scanner;

public class Sýnav {

	String ders;
	String konu;
	int sýnavNo;
	int soruSayisi;
	long süre;
	String tarih;
	Soru[] sorular;
	String[] cevaplar;
	String[] cevapSecenekleri = { "A", "B", "C", "D" };

	public void sýnavOlustur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sýnav konusun giriniz");
		konu = scanner.nextLine();
		System.out.println("Lütfen soru sayýsýný giriniz");
		soruSayisi = Integer.parseInt(scanner.nextLine());
		System.out.println("Lütfen sýnav süresini giriniz");
		süre = Long.parseLong(scanner.nextLine());
		sorular = new Soru[soruSayisi];
		for (int i = 0; i < sorular.length; i++) {
			Soru soru = new Soru();
			soru.soruOlustur(cevapSecenekleri);
			sorular[i] = soru;
		}

	}

	public void cevaplarýGir() {
		Scanner scanner = new Scanner(System.in);
		cevaplar = new String[sorular.length];

		for (int i = 0; i < sorular.length; i++) {
			System.out.println(sorular[i].içerik);

			for (int j = 0; j < sorular[i].cevapIcerikleri.length; j++) {

				System.out.println(cevapSecenekleri[j] + "-)" + sorular[i].cevapIcerikleri[j]);
			}
			System.out.println("Lütfen cevabýnýzý giriniz");
			cevaplar[i] = scanner.nextLine().toUpperCase();
		}

	}

	public void cevaplarýKontrolEt() {
		int dogrucevapSayisi = 0;
		int puan = 0;
		for (int i = 0; i < sorular.length; i++) {

			if (cevaplar[i].equals(sorular[i].dogruCevap)) {
				dogrucevapSayisi++;
				puan += sorular[i].puan;
			}
		}

		System.out.println("doðru cevap sayýnýz= " + dogrucevapSayisi);
		System.out.println("yanlýþ cevap sayýnýz= " + (sorular.length - dogrucevapSayisi));
		System.out.println("toplam puan= " + puan);

	}

}
