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
