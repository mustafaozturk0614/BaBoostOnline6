package com.bilgeadam.lesson006;

import java.util.Scanner;

/*
 * Menu 1-Dýþarýdan bir kelime ve bir harf girilsin  eðer kelimemizin için de o 
 *   harf varsa kaç tane olduðunu ve index numaralarýný yazdýrýn.
 *   eðer harfi içermiyorsa bir çýktý aradaðýnýz harf yok gibi
 * 
 * 
 * 2-Dýþarýdan bir kelime giriniz daha sonra deðiþtirmek istediðiniz harfi
 * giriniz daha sonra hangi harfle deðiþtireceðinizi giriniz Eðer kelimemiz
 * içerisinde o harf varsa deðiþtirsin
 * 
 *
 * 3-Dýþarýdan Girilen bir kelimeyi ters çevirip yazdýralým.Polindrom olup
 * olmadýðýný bulunuz(kek,iki,kabak)
 * 
 * 
 * 4- Dýþarýdan 5 adet kelime girelim her kelimede a, b veya c ile baþlayýp
 * baþlamadýðýmýzý kontrol etsin (a, b,c ile baþlayanlar için ayrý ayrý sayfa
 * açýldýðýný düþünün elimizde)  a lar için bir sayfaya b ler  bir sayfaya  cler bir
 * sayfaya yazýlacak gibi düþünelim diðer harfle baþlayanlar için ise ayrý bir
 * sayfa düþünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
 * sayfa oluðunu ekrana yazdýralým
 * *
 */

public class Question29 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("=====String Ýþemleri=====");
			System.out.println("1-Harf Saydýrma");
			System.out.println("2-Harf Deðiþtirme");
			System.out.println("3-Polindrom Kontrolu");
			System.out.println("4-Sayfa Açma");
			System.out.println("5-Sayfa Açma 2");
			System.out.println("0-çýkýþ");
			int secim = scanner.nextInt();
			scanner.nextLine();

			switch (secim) {
			case 1:
				int sayac = 0;
				String indexler = "";
				System.out.println("Lütfen bir kelime giriniz");
				String kelime = scanner.nextLine();
				System.out.println("Lütfen bir harf giriniz");
				String harf = scanner.nextLine();
				if (!kelime.contains(harf)) {
					System.out.println("Aradýðýnýz harf kelimede bulunmamaktadýr");
					break;
				}
				for (int i = 0; i < kelime.length(); i++) {
					if (kelime.charAt(i) == harf.charAt(0)) {
						sayac++;
						indexler += i + ",";
					}
				}
				System.out.println(harf + " harfi kelime içinde" + sayac + " adet bulunuyor");
				System.out.println(harf + " deðerinin indexleri ===> " + indexler.substring(0, indexler.length() - 1));
				break;

			case 2:
				String yeniKelime = "";
				System.out.println("Lütfen Bir kelime Giriniz");
				String kelime2 = scanner.nextLine();
				System.out.println("Lütfen Deðiþtirmek istediðiniz harfi Giriniz");
				String eskiHarf = scanner.nextLine();

				if (kelime2.contains(eskiHarf)) {
					System.out.println("Lütfen yeni harfi Giriniz");
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
				System.out.println("Lütfen bir kelime giriniz");
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
					System.out.println("Kelimeniz Polindrom Deðildir!!!");
				}

				break;

			case 4:
				int a = 0, b = 0, c = 0, d = 0, toplam = 0;
				System.out.println("5 adet deðer giriniz");
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
				System.out.println("toplam dosya sayýsý " + toplam);

				break;

			case 5:
				String defter = "";
				for (int i = 0; i < 5; i++) {
					System.out.println("lütfen bir deðer giriniz");
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
				System.out.println("Açýlan sayfa Sayýsý :" + defter.length());
				break;
			case 0:
				System.out.println("Programdan Çýkýlýyor.....!");
				kontrol = false;
				break;
			default:
				break;
			}

		}

	}

}
