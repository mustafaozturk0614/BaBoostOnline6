package com.bilgeadam.lesson011;

public class Question48 {
	// Dizideki elemanlar aras�nda ki fark�n en k���k oldu�u de�er nedir.
	public static void main(String[] args) {
		int[] array = { 1, 5, -4, 3 };

		Math.abs(-4);
		int fark;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				fark = Math.abs(array[i] - array[j]);

				if (fark < min) {
					min = fark;
				}
			}

		}
		System.out.println(min);

	}

	// Bir dizi i�erisinde tekrar eden elemanlar�n ka� kere tekrar etti�ini bulal�m
	int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
}
