package com.bilgeadam.lesson004;

/*
 * 1 den 100 ekadar olan �ift say�lar�n toplam�n�n
 * tek say�lar�n toplam�na oran� 
 * 
 */
public class Question16 {

	public static void main(String[] args) {

		double tekToplam = 0, �iftToplam = 0;

		for (int n = 1; n < 100; n++) {
			if (n % 2 == 0) {
				�iftToplam += n;
			} else {
				tekToplam += n;
			}
		}
		double oran = �iftToplam / tekToplam;
		System.out.println("Ciftlerin toplam�:" + �iftToplam);
		System.out.println("Teklerin toplam�:" + tekToplam);
		System.out.println("oran:" + oran);

		tekToplam = 0;
		�iftToplam = 0;
		oran = 0;
		System.out.println("//////////////////////////////");

		for (double i = 1; i < 100; i += 2) {

			tekToplam += i;
			�iftToplam += i - 1;
		}
		oran = �iftToplam / tekToplam;
		System.out.println("Ciftlerin toplam�:" + �iftToplam);
		System.out.println("Teklerin toplam�:" + tekToplam);
		System.out.println("oran:" + oran);

	}

}
