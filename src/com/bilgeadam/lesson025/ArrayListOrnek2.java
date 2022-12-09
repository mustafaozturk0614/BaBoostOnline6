package com.bilgeadam.lesson025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 
 * 1tane tek sayılar 1 tane çift sayılar için bir liste olusturalım
 * 
 * sonra 35 tane random sayıyı çift ise çiftlere tek ise teklere atalım 
 * 
 * en sonunda tekler ve çiftler listesini yazdıralım
 * 
 * 
 * 
 * 
 */

public class ArrayListOrnek2 {

	public static void main(String[] args) {

		List<Integer> tekSayilar = new ArrayList<>();
		List<Integer> cifSayilar = new ArrayList<>();

		for (int i = 0; i < 35; i++) {
			int sayi = randomSayi();

			if (sayi % 2 == 0) {
				cifSayilar.add(sayi);
			} else {
				tekSayilar.add(sayi);

			}

		}
		System.out.println("Cift Sayılar");
		for (Integer sayi : cifSayilar) {

			System.out.print(sayi + ", ");
		}
		System.out.println();
		System.out.println("Tek Sayılar");
		for (Integer sayi : tekSayilar) {
			System.out.print(sayi + ", ");
		}

//		tekSayilar.forEach((x) -> System.out.print(x + ","));
//		tekSayilar.forEach(System.out::print);

	}

	public static int randomSayi() {
		Random random = new Random();
		return random.nextInt(500);

	}

}