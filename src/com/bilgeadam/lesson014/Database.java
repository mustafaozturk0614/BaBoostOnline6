package com.bilgeadam.lesson014;

public class Database {

	static Kullanici[] kullaniciListesi = new Kullanici[6];

	static int uzunluk = 0;

	public static void veriTabanýBaslangýcDegerleri() {

		Kullanici kullanici = new Kullanici();
		kullanici.email = "mustafa@gmail.com";
		kullanici.isim = "Mustafa";
		kullanici.password = "123";
		kullanici.id = uzunluk + 1;
		uzunluk++;

		kullaniciListesi[0] = kullanici;
		Kullanici kullanici2 = new Kullanici();
		kullanici2.email = "merve@gmail.com";
		kullanici2.isim = "Merve";
		kullanici2.password = "123";
		kullanici2.id = uzunluk + 1;
		kullaniciListesi[1] = kullanici2;
		uzunluk++;
		Kullanici kullanici3 = new Kullanici();
		kullanici3.email = "yasin@gmail.com";
		kullanici3.isim = "Yasin";
		kullanici3.password = "123";
		kullanici3.id = uzunluk + 1;
		kullaniciListesi[2] = kullanici3;
		uzunluk++;
	}

	public static void kullancýEkle(Kullanici x) {

		if (uzunluk >= kullaniciListesi.length - 2) {
			listeBoyutunuArttýr();

		}

		if (uzunluk < kullaniciListesi.length) {
			kullaniciListesi[uzunluk] = x;
			uzunluk += 1;
		}

	}

	public static void listeBoyutunuArttýr() {

		Kullanici[] tmp = new Kullanici[kullaniciListesi.length + 5];
		for (int i = 0; i < kullaniciListesi.length; i++) {
			tmp[i] = kullaniciListesi[i];
		}

		kullaniciListesi = tmp;

	}

	public static boolean kullaniciVarmi(String email, String password) {

		for (int i = 0; i < kullaniciListesi.length; i++) {
			if (kullaniciListesi[i] != null) {

				if (kullaniciListesi[i].email.equalsIgnoreCase(email)
						&& kullaniciListesi[i].password.equals(password)) {
					System.out.println("Hoþgeldiniz==>" + kullaniciListesi[i].isim);
					return true;
				}
			}
		}
		return false;

	}

}
