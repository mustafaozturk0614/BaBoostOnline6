package com.bilgeadam.etut;

public class Test {

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		int secim = 0;
		do {
			System.out.println("1-Kitap ekle");
			System.out.println("2-Kitap Sil");
			System.out.println("3-ÝsmeGöre  Kitap");
			System.out.println("4-Yazaragöre kitap");
			System.out.println("5-Kitap Listesi");
			System.out.println("6-Yazar Listesi");
			secim = Utility.intDegerAlma("Lütfen bir SeçimYapýnýz");

			switch (secim) {
			case 1:
				uygulama.kitapEkle();
				break;
			case 2:

				break;
			case 3:
				uygulama.kitaplik.getIsmeGoreKitaplar().entrySet().forEach(System.out::println);
				break;
			case 4:
				uygulama.kitaplik.getYazaraGoreKitaplar().entrySet().forEach(System.out::println);
				break;
			case 5:
				uygulama.kitaplik.getKitaplar().forEach(System.out::println);
				break;
			case 6:

				break;

			default:
				break;
			}

		} while (secim != 0);
	}

}
