package com.bilgeadam.lesson003;

/**
 * 
 * 1 den ba�layarak say�lar� toplayal�m toplam�m�z 50 den buyuk olana kadar
 * program�m�z �al�s�n; sonunda toplam� ve ka� kere �al��d���n� yazd�ral�m
 * 
 *
 *
 */
public class Question11 {

	public static void main(String[] args) {

		int toplam = 0;
		int i = 1;
		int sayac = 0;

		while (toplam <= 50) {
			toplam += i;
			sayac = i;
			i++;
			System.out.println("Toplam=>" + toplam + "-D�ng�=>" + sayac);
		}
	}

}
