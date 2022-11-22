package com.bilgeadam.lesson012;

public class Question50 {

	public static void main(String[] args) {
		int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		// {false,false,true,false,false,true,false,false}

//		kacTane(dizi);
		frekans(dizi);

	}

	public static void frekans(int[] dizi) {
		boolean[] kontrol = new boolean[dizi.length];

		for (int i = 0; i < dizi.length; i++) {

			if (kontrol[i] == true) {
				continue;
			}
			int count = 1;

			for (int j = i + 1; j < dizi.length; j++) {

				if (dizi[i] == dizi[j]) {
					kontrol[j] = true;
					count++;
				}
			}
			System.out.println(dizi[i] + " sayisi " + count + " kere tekrar etmiþtir");

		}

	}

	public static void kacTane(int... sayi) {

		int sayac = 1;

		int[][] dizi = new int[sayi.length][2];

		for (int i = 0; i < sayi.length; i++) {
			sayac = 1;
			int k = i - 1;
			for (int j = i + 1; j < sayi.length; j++) {
				if (sayi[i] == sayi[j]) {
					sayac++;
				}
				dizi[i][0] = sayi[i];
				dizi[i][1] = sayac;
			}
			if (i == 0) {
				System.out.println(dizi[i][0] + "-" + dizi[i][1] + "kere tekrar emiþtir");

			} else if (i != 0) {

				for (k = i - 1; k >= 0; k--) {
					if (dizi[i][0] == dizi[k][0]) {
						break;
					} else if (dizi[i][0] != dizi[k][0] && k == 0) {
						System.out.println(dizi[i][0] + "-" + dizi[i][1] + "kere tekrar emiþtir");
					}
				}
			}

		}

	}

}
