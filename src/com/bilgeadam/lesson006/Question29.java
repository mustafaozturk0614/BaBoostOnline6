package com.bilgeadam.lesson006;

import java.util.Scanner;

/*
 * Menu 1-D��ar�dan bir kelime ve bir harf girilsin  e�er kelimemizin i�in de o 
 *   harf varsa ka� tane oldu�unu ve index numaralar�n� yazd�r�n.
 *   e�er harfi i�ermiyorsa bir ��kt� arada��n�z harf yok gibi
 * 
 * 
 * 2-D��ar�dan bir kelime giriniz daha sonra de�i�tirmek istedi�iniz harfi
 * giriniz daha sonra hangi harfle de�i�tirece�inizi giriniz E�er kelimemiz
 * i�erisinde o harf varsa de�i�tirsin
 * 
 *
 * 3-D��ar�dan Girilen bir kelimeyi ters �evirip yazd�ral�m.Polindrom olup
 * olmad���n� bulunuz(kek,iki,kabak)
 * 
 * 
 * 4- D��ar�dan 5 adet kelime girelim her kelimede a, b veya c ile ba�lay�p
 * ba�lamad���m�z� kontrol etsin (a, b,c ile ba�layanlar i�in ayr� ayr� sayfa
 * a��ld���n� d���n�n elimizde)  a lar i�in bir sayfaya b ler  bir sayfaya  cler bir
 * sayfaya yaz�lacak gibi d���nelim di�er harfle ba�layanlar i�in ise ayr� bir
 * sayfa d���nelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde ka�
 * sayfa olu�unu ekrana yazd�ral�m
 * *
 */

public class Question29 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("=====String ��emleri=====");
			System.out.println("1-Harf Sayd�rma");
			System.out.println("2-Harf De�i�tirme");
			System.out.println("3-Polindrom Kontrolu");
			System.out.println("4-Sayfa A�ma");
			System.out.println("5-Sayfa A�ma 2");
			System.out.println("0-��k��");
			int secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {
			case 1:
				int sayac = 0;
				String indexler = "";
				System.out.println("L�tfen bir kelime giriniz");
				String kelime = scanner.nextLine();
				System.out.println("L�tfen bir harf giriniz");
				String harf = scanner.nextLine();
				if (!kelime.contains(harf)) {
					System.out.println("Arad���n�z harf kelimede bulunmamaktad�r");
					break;
				}
				for (int i = 0; i < kelime.length(); i++) {
					if (kelime.charAt(i) == harf.charAt(0)) {
						sayac++;
						indexler += i + ",";
					}
				}
				System.out.println(harf + " harfi kelime i�inde" + sayac + " adet bulunuyor");
				System.out.println(harf + " de�erinin indexleri ===> " + indexler.substring(0, indexler.length() - 1));
				break;

			case 2:
				String yeniKelime = "";
				System.out.println("L�tfen Bir kelime Giriniz");
				String kelime2 = scanner.nextLine();
				System.out.println("L�tfen De�i�tirmek istedi�iniz harfi Giriniz");
				String eskiHarf = scanner.nextLine();

				if (kelime2.contains(eskiHarf)) {
					System.out.println("L�tfen yeni harfi Giriniz");
					String yeniHarf = scanner.nextLine();
					yeniKelime = kelime2.replace(eskiHarf, yeniHarf);

				} else {
					System.out.println("Harf kelimede bulunmuyor");
				}

				System.out.println(yeniKelime);

				break;

			case 3:
				boolean kontrol2 = true;
				String tersKelime = "";
				System.out.println("L�tfen bir kelime giriniz");
				String kelime3 = scanner.nextLine();

//				for (int i = kelime3.length() - 1; i >= 0; i--) {
//
//					tersKelime += kelime3.charAt(i);
//
//				}
//				for (int i = 0; i < kelime3.length(); i++) {
//					tersKelime += kelime3.charAt((kelime3.length() - 1) - i);
//				}

				for (int i = 0; i < kelime3.length() / 2; i++) {
					if (!(kelime3.charAt(i) == kelime3.charAt((kelime3.length() - 1) - i))) {
						kontrol2 = false;
						break;
					}

				}

				if (kontrol2) {
					System.out.println("Kelimeniz Polindromdur");
				} else {
					System.out.println("Kelimeniz Polindrom De�ildir!!!");
				}

				break;

			case 4:
				int a = 0, b = 0, c = 0, d = 0, toplam = 0;
				System.out.println("5 adet de�er giriniz");
				for (int i = 0; i < 5; i++) {
					System.out.println(i + 1 + ".kelime");
					String kelime4 = scanner.nextLine();
					if (kelime4.charAt(0) == 'a') {

						if (a == 0) {
							a = 1;
						}
					}

					else if (kelime4.charAt(0) == 'b') {
						if (b == 0) {
							b = 1;
						}
					} else if (kelime4.charAt(0) == 'c') {
						if (c == 0) {
							c = 1;
						}
					} else {
						if (d == 0) {
							d = 1;
						}
					}

				}

				toplam = a + b + c + d;
				System.out.println("toplam dosya say�s� " + toplam);

				break;

			case 5:
				String defter = "";
				for (int i = 0; i < 5; i++) {
					System.out.println("l�tfen bir de�er giriniz");
					switch (scanner.nextLine().charAt(0)) {
					case 'a', 'A':
						if (!defter.contains("a")) {
							defter += "a";
						}

						break;
					case 'b', 'B':
						if (!defter.contains("b")) {
							defter += "b";
						}
						break;
					case 'c', 'C':
						if (!defter.contains("c")) {
							defter += "c";
						}
						break;

					default:
						if (!defter.contains("x")) {
							defter += "x";
						}
						break;
					}

				}
				System.out.println("A��lan sayfa Say�s� :" + defter.length());
				break;
			case 0:
				System.out.println("Programdan ��k�l�yor.....!");
				kontrol = false;
				break;
			default:
				break;
			}

		}

	}

}
