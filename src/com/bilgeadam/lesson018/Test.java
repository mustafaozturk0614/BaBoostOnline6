package com.bilgeadam.lesson018;

public class Test {

	public static void main(String[] args) {
//		Soru soru = new Soru();
//		String[] cevapSecenekleri = { "A", "B", "C", "D" };
//		soru.soruOlustur(cevapSecenekleri);
//		System.out.println("/////////////////////////////////");
//		for (int i = 0; i < soru.cevapIcerikleri.length; i++) {
//			System.out.println(soru.cevapIcerikleri[i]);
//		}

		S�nav s�nav = new S�nav();
		s�nav.s�navOlustur();
		s�nav.cevaplar�Gir();
		s�nav.cevaplar�KontrolEt();

	}

}
