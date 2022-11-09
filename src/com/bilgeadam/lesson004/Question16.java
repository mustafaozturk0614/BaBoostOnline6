package com.bilgeadam.lesson004;

/*
 * 1 den 100 ekadar olan çift sayýlarýn toplamýnýn
 * tek sayýlarýn toplamýna oraný 
 * 
 */
public class Question16 {

	public static void main(String[] args) {

		double tekToplam = 0, çiftToplam = 0;

		for (int n = 1; n < 100; n++) {
			if (n % 2 == 0) {
				çiftToplam += n;
			} else {
				tekToplam += n;
			}
		}
		double oran = çiftToplam / tekToplam;
		System.out.println("Ciftlerin toplamý:" + çiftToplam);
		System.out.println("Teklerin toplamý:" + tekToplam);
		System.out.println("oran:" + oran);

		tekToplam = 0;
		çiftToplam = 0;
		oran = 0;
		System.out.println("//////////////////////////////");

		for (double i = 1; i < 100; i += 2) {

			tekToplam += i;
			çiftToplam += i - 1;
		}
		oran = çiftToplam / tekToplam;
		System.out.println("Ciftlerin toplamý:" + çiftToplam);
		System.out.println("Teklerin toplamý:" + tekToplam);
		System.out.println("oran:" + oran);

	}

}
