package com.bilgeadam.lesson013;

public class Question51 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;

		System.out.println(a);// 5
		System.out.println(b);// 3

		a = b;
		b = 8;
		System.out.println(a);// 3
		System.out.println(b);// 8

		String[] sehirler1 = { "Ankara", "Ýstanbul", "Ýzmir" };
		String[] sehirler2 = { "Bursa", "Konya", "Mersin" };
		System.out.println(sehirler1[0]);// Ankara
		System.out.println(sehirler2[1]);// Konya
		sehirler2 = sehirler1;
		System.out.println(sehirler2[0]);// Ankara
		sehirler1[0] = "Bolu";
		System.out.println(sehirler2[0]);// Ankara,Bolu
		sehirler2[1] = "Hatay";
		System.out.println(sehirler1[1]);// Ýstanbul,Hatay

	}

}
