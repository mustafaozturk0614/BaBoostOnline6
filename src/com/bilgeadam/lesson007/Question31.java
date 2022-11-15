package com.bilgeadam.lesson007;

public class Question31 {

	public static void main(String[] args) {
		String[] stringArray = new String[4];
		String[] stringArray3 = { "Kelime", "Kelime2" };
		// String stringArray2[] = new String[3];
		boolean[] boolenArray = new boolean[4];
		boolenArray[0] = false;
		boolenArray[boolenArray.length - 1] = true;
		boolean[] boolenArray2 = { false, false, true };
		System.out.println(boolenArray2.length);// 3
		System.out.println(boolenArray[3]);// null,hata
		boolenArray[3] = false;
		System.out.println(boolenArray[3]);
		System.out.println(boolenArray[1]);
		System.out.println(stringArray[1]);
		Integer[] integerArray = new Integer[2];
		System.out.println(integerArray[0]);
		System.out.println(stringArray3[0]);
		System.out.println(stringArray3[1]);
		/// wrapper claslar ile primitive türler arasýndaki iliþkiyi araþtýrýn

	}

}
