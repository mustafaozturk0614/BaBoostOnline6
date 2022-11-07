package com.bilgeadam.lesson002;

public class Question4 {

	/**
	 * 
	 * iki tane string değişkenimiz olsun isim soy isim daha sonra bunları birleşik
	 * bir şekilde ekrana yazdıraım
	 * 
	 * a ve b karakterlerinin toplamını ekrana yazdıralım
	 * 
	 */
	public static void main(String[] args) {
		String isim = "Mustafa";
		String soyIsim = "Öztürk";
		String isimSoyisim = isim + " \n" + soyIsim;
		System.out.println(isimSoyisim);
		char a = 'a';
		char b = 'b';
		System.out.println(a + b);
		System.out.println('a' + 'b');

	}

}
