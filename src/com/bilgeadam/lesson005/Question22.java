package com.bilgeadam.lesson005;

import java.util.Scanner;

// D��ar�dan ay ve g�n de�erini ayr� ayr� bir say� olarak alacaks�n�z buna g�re

// burc hesab� yapan program

// Ko� Burcu : 21 Mart - 20 Nisan
//
// Bo�a Burcu : 21 Nisan - 21 May�s
//
// �kizler Burcu : 22 May�s - 22 Haziran
//
// Yenge� Burcu : 23 Haziran - 22 Temmuz
//
// Aslan Burcu : 23 Temmuz - 22 A�ustos
//
// Ba�ak Burcu : 23 A�ustos - 22 Eyl�l
//
// Terazi Burcu : 23 Eyl�l - 22 Ekim
//
// Akrep Burcu : 23 Ekim - 21 Kas�m
//
// Yay Burcu : 22 Kas�m - 21 Aral�k
//
// O�lak Burcu : 22 Aral�k - 21 Ocak

// Kova Burcu : 22 Ocak - 19 �ubat
//
// Bal�k Burcu : 20 �ubat - 20 Mart

public class Question22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean kontrol = false;

		do {
			kontrol = false;
			System.out.println("L�tfen do�du�unuz g�n�n Ay�n ka��nc� g�n� oldu�unu giriniz");
			int gun = scanner.nextInt();
			System.out.println("L�tfen do�du�unuz ay�n y�l�n  ka��nc� ay� oldu�unu giriniz");
			int ay = scanner.nextInt();

			switch (ay) {
			case 1:
				if (gun >= 1 && gun <= 21) {
					System.out.println("Burcunuz O�lak");

				} else if (gun > 31 || gun < 1) {
					System.out.println(
							"Ocak Ay�n�n son g�n 31 Ocakt�r ve  ilk g�n� 1 Ocakt�r\nsizin girdi�iniz de�er: " + gun);
					kontrol = true;
				}

				else {
					System.out.println("Burcunuz Kova");
				}
				break;
			case 2:
				if (gun >= 1 && gun <= 19) {
					System.out.println("Burcunuz Kova");
				} else if (gun > 29 || gun < 1) {
					System.out.println(
							"�ubat Ay�n�n son g�n 29 �ubatt�r ve  ilk g�n� 1 �ubatt�r\nsizin girdi�iniz de�er: " + gun);

					kontrol = true;
				}

				else {
					System.out.println("Burcunuz Bal�k");
				}
				break;
			case 3:
				if (gun >= 1 && gun <= 20) {
					System.out.println("Burcunuz Bal�k");
				} else if (gun > 31 || gun < 1) {
					System.out.println(
							"Mart Ay�n�n son g�n 31 Martt�r  ve  ilk g�n� 1 Martt�r\nsizin girdi�iniz de�er: " + gun);
					kontrol = true;
				}

				else {
					System.out.println("Burcunuz Ko�");
				}
				break;

			case 4:
				if (gun >= 1 && gun <= 20) {
					System.out.println("Burcunuz Ko�");
				} else if (gun > 30 || gun < 1) {
					System.out.println(
							"Nisan Ay�n�n son g�n 30 Nisand�r  ve  ilk g�n� 1 Nisand�r\nsizin girdi�iniz de�er: "
									+ gun);
					kontrol = true;
				}

				else {
					System.out.println("Burcunuz Bo�a");
				}
				break;
			case 5:
				if (gun >= 1 && gun <= 21) {
					System.out.println("Burcunuz Bo�a");
				} else if (gun > 31 || gun < 1) {
					System.out.println(
							"May�s Ay�n�n son g�n 31 May�sd�r  ve  ilk g�n� 1 May�sd�r\nsizin girdi�iniz de�er: "
									+ gun);
					kontrol = true;
				}

				else {
					System.out.println("Burcunuz �kizler");
				}
				break;
			case 6:
				if (gun >= 1 && gun <= 22) {
					System.out.println("Burcunuz �kizler");
				} else if (gun > 30 || gun < 1) {
					System.out.println(
							"Haziran Ay�n�n son g�n� 30 Temmuzdur ilk g�n� 1 Hazirand�r,\n sizin girdi�iniz de�er:"
									+ gun);
					kontrol = true;

				} else {
					System.out.println("Burcunuz Yenge�");
				}
				break;

			case 7:
				if (gun >= 1 && gun <= 23) {
					System.out.println("Burcunuz Yenge�");
				} else if (gun > 31 || gun < 1) {
					System.out.println(
							"Temmuz Ay�n�n son g�n� 31 Temmuzdur ilk g�n� 1 Temmuzdur,\n sizin girdi�iniz de�er:"
									+ gun);
					kontrol = true;
				} else {
					System.out.println("Burcunuz Aslan");
				}
				break;
			case 8:
				if (gun >= 1 && gun <= 22) {
					System.out.println("Burcunuz Aslan");
				} else if (gun > 31 || gun < 1) {
					System.out.println(
							"A�ustos Ay�n�n son g�n� 31 A�ustostur ilk g�n� 1 A�ustosdur ,\n sizin girdi�iniz de�er:"
									+ gun);
					kontrol = true;

				} else {
					System.out.println("Burcunuz Ba�ak");
				}
				break;
			case 9:
				if (gun >= 1 && gun <= 22) {
					System.out.println("Burcunuz Ba�ak");
				} else if (gun > 30 || gun < 1) {
					System.out.println(
							"Eyl�l Ay�n�n son g�n� 30 Eyl�ld�r ilk g�n� 1 Eyl�ld�r,\n sizin girdi�iniz de�er:" + gun);
					kontrol = true;
				} else {
					System.out.println("Burcunuz Terazi");
				}
				break;
			case 10:
				if (gun >= 1 && gun <= 22) {
					System.out.println("Burcunuz Terazi");
				} else if (gun > 31 || gun < 1) {
					System.out.println(
							"Ekim Ay�n�n son g�n� 31 Ekimdir ilk g�n� 1 Ekimdir,\n sizin girdi�iniz de�er:" + gun);
					kontrol = true;
				} else {
					System.out.println("Burcunuz Akrep");
				}
				break;
			case 11:
				if (gun >= 1 && gun <= 21) {
					System.out.println("Burcunuz Akrep");
				} else if (gun > 30 || gun < 1) {
					System.out.println(
							"Kas�m Ay�n�n son g�n� 30 Kas�md�r ilk g�n� 1 Kas�md�r ,\n sizin girdi�iniz de�er:" + gun);

					kontrol = true;
				} else {
					System.out.println("Burcunuz Yay");
				}
				break;
			case 12:
				if (gun >= 1 && gun <= 21) {
					System.out.println("Burcunuz Yay");
				} else if (gun > 31 || gun < 1) {
					System.out.println(
							"Aral�k Ay�n�n son g�n� 31 Aral�kt�r ilk g�n� 1 Aral�kt�r ,\n sizin girdi�iniz de�er:"
									+ gun);
					kontrol = true;
				} else {
					System.out.println("Burcunuz Q�lak");
				}
				break;

			default:
				System.out.println("Bir y�lda 12 ay vard�r l�tefen  1 ile 12 aras�nda bir say� giriniz");
				kontrol = true;
				break;
			}

		} while (kontrol);

	}

}
