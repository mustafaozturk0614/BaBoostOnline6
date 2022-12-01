package com.bilgeadam.lesson018;

import java.util.Scanner;

public class Soru {

	int puan;
	int sýraNo;
	String içerik;
	String dogruCevap;
	String[] cevapIcerikleri;

	public void soruOlustur(String[] cevapSecenekleri) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sournun içeriðini girin");
		içerik = scanner.nextLine();
		cevapIcerikleri = new String[cevapSecenekleri.length];

		for (int i = 0; i < cevapSecenekleri.length; i++) {
			System.out.println("Lütfen" + cevapSecenekleri[i] + "þýkkýnýn içeriðini giriniz");
			cevapIcerikleri[i] = scanner.nextLine();
		}
		System.out.println("Sorunun Doðru cevabýný belirtin");
		dogruCevap = scanner.nextLine().toUpperCase();
		System.out.println("Sorunun Puanýný belirtiniz");
		puan = Integer.parseInt(scanner.nextLine());

	}

}
