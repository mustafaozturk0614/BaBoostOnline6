package com.bilgeadam.lesson009;

import java.util.Scanner;

public class Question46 {
	/*
	 * D��ar�dan ka� say� alaca��m�z� alal�m 2,3
	 * 
	 * e�er iki gelirse topla() i�inde iki de�erimizi al�p toplayal�m
	 * 
	 * e�er 3 gelirsede bu metodu overload �eklinde yazl�m ald���m�z 3 de�eri metoda
	 * ge�elim
	 * 
	 * 
	 * main d��ar�dan ka� asy� alca��m�z� belirliyoruz o say�lara g�re ko�ullar�m�z�
	 * belirleyip oku�llarda yukar�da yazd���m�z 2 metoddan birini �a��raca��z
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen sayi adedi giriniz");
		int sayiAdedi = scanner.nextInt();

		if (sayiAdedi == 2) {

			System.out.println(topla());

		} else if (sayiAdedi == 3) {
			System.out.println("L�tfen 1.say�y� giriniz");
			int sayi1 = scanner.nextInt();
			System.out.println("L�tfen 2.say�y� giriniz");
			int sayi2 = scanner.nextInt();
			System.out.println("L�tfen 3.say�y� giriniz");
			int sayi3 = scanner.nextInt();
			System.out.println(topla(sayi1, sayi2, sayi3));

		}

	}

	public static int topla(int sayi1, int sayi2, int sayi3) {
		int toplam = sayi1 + sayi2 + sayi3;
		return toplam;
	}

	public static int topla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen 1.say�y� giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("L�tfen 2.say�y� giriniz");
		int sayi2 = scanner.nextInt();

		return sayi1 + sayi2;
	}

}
