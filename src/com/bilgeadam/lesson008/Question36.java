package com.bilgeadam.lesson008;

public class Question36 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		// dizi deki t�m say�lar�n toplam� ve
		// bu say� �iftdir ve bu say� tekdir �eklinde ��kt� alal�m.

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " �ift Say�d�r");
			} else {
				System.out.println(sayilar[i] + " Tek Say�d�r");
			}
		}
		System.out.println("toplam= " + toplam);

	}

}
