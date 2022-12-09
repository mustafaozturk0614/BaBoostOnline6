package com.bilgeadam.lesson025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 
 * 1tane tek say�lar 1 tane �ift say�lar i�in bir liste olustural�m
 * 
 * sonra 35 tane random say�y� �ift ise �iftlere tek ise teklere atal�m 
 * 
 * en sonunda tekler ve �iftler listesini yazd�ral�m
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
		System.out.println("Cift Say�lar");
		for (Integer sayi : cifSayilar) {

			System.out.print(sayi + ", ");
		}
		System.out.println();
		System.out.println("Tek Say�lar");
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