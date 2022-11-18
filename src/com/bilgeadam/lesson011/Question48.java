package com.bilgeadam.lesson011;

public class Question48 {
	// Dizideki elemanlar arasýnda ki farkýn en küçük olduðu deðer nedir.
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

	// Bir dizi içerisinde tekrar eden elemanlarýn kaç kere tekrar ettiðini bulalým
	int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
}
