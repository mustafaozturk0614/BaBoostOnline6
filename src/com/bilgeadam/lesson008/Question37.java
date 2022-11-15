package com.bilgeadam.lesson008;

public class Question37 {
	/*
	 * 
	 * int [] sayilar={1,4,5,6,1,1,4,8};
	 * 
	 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısının adeti 4 sayısının
	 * adetinden büyükse true değilse false
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

		System.out.println("1 sayısı " + sayac1 + " tanse vardır");
		System.out.println("4 sayısı " + sayac4 + " tanse vardır");

	}

}
