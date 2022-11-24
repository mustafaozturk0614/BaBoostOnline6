package com.bilgeadam.lesson015;

public class Test {

	public static void main(String[] args) {
		Question52 test1 = new Question52();
		test1.boyut1 = 10;
		Question52 test2 = new Question52();
		test2.boyut1 = 15;
		boolean kontrol = test2.boyut1 == test1.boyut1;
		System.out.println(kontrol);
		test2.boyut1 = 10;
		kontrol = test2.boyut1 == test1.boyut1;
		System.out.println(kontrol);
		// System.out.println(test1.diziUret() == test1.boyut1);// true
		test2.diziUret();
		System.out.println("x=>" + test2.boyut1);// 10

		test1.dizi = test1.diziUret();
		kontrol = test1.dizi.length == test2.dizi.length;
		System.out.println(kontrol);
		Question52 test3 = new Question52();

		for (int i = 0; i < test3.dizi.length; i++) {
			System.out.println(test3.dizi[i]);
		}

	}

}
