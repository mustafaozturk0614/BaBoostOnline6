package com.bilgeadam.lesson018;

import java.util.Scanner;

public class Soru {

	int puan;
	int s�raNo;
	String i�erik;
	String dogruCevap;
	String[] cevapIcerikleri;

	public void soruOlustur(String[] cevapSecenekleri) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen sournun i�eri�ini girin");
		i�erik = scanner.nextLine();
		cevapIcerikleri = new String[cevapSecenekleri.length];

		for (int i = 0; i < cevapSecenekleri.length; i++) {
			System.out.println("L�tfen" + cevapSecenekleri[i] + "��kk�n�n i�eri�ini giriniz");
			cevapIcerikleri[i] = scanner.nextLine();
		}
		System.out.println("Sorunun Do�ru cevab�n� belirtin");
		dogruCevap = scanner.nextLine().toUpperCase();
		System.out.println("Sorunun Puan�n� belirtiniz");
		puan = Integer.parseInt(scanner.nextLine());

	}

}
