package com.bilgeadam.lesson008;

public class Question41 {
	// Çarpým tablosu
	// 1x1=1
	// 1x2=2
	// 1 ile 10 arasý 10 dahil

	public static void main(String[] args) {

		String[][] array = new String[10][10];
		String[][] array2 = new String[10][10];
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i + 1) + "x" + (j + 1) + "=" + ((i + 1) * (j + 1));
			}
		}

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.println(array[i][j]);

			}

		}

//		String[][] array3 = new String[3][3];
//
//		array3[0][0] = "A";
//		array3[0][1] = "b";
//		array3[0][2] = "s";
//		array[2][0] = "x";
		/*
		 * 2, 3, 4, 4 1, 5, 6, 4 5, 8, 7, 6
		 * 
		 * 
		 * 
		 */
		// int[][] array4 = { { 2, 3, 4, 4 }, { 1, 5, 6, 4 }, { 5, 8, 7, 6 } };

//		for (int i = 1; i < array2.length + 1; i++) {
//
//			for (int j = 1; j < array2[i].length + 1; j++) {
//				array2[i - 1][j - 1] = (i) + "x" + (j) + "=" + ((i) * (j));
//			}
//		}
	}

}
