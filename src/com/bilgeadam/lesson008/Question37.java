package com.bilgeadam.lesson008;

public class Question37 {
	/*
	 * 
	 * int [] sayilar={1,4,5,6,1,1,4,8};
	 * 
	 * dizi i�erisinde 1 ve 4 ka� kere ge�ti�ini ve 1 say�s�n�n adeti 4 say�s�n�n
	 * adetinden b�y�kse true de�ilse false
	 * 
	 */
	public static void main(String[] args) {
		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };

		int sayac1 = 0;
		int sayac4 = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 4)
				sayac4++;
			else if (sayilar[i] == 1)
				sayac1++;

		}

		boolean kontrol = sayac1 > sayac4;
		if (kontrol) {
			System.out.println(true);
		} else {
			System.out.println(false);

		}

		System.out.println("1 say�s� " + sayac1 + " tanse vard�r");
		System.out.println("4 say�s� " + sayac4 + " tanse vard�r");

	}

}
