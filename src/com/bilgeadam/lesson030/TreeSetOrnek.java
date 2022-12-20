package com.bilgeadam.lesson030;
/*
 * klavyeden rastgele 10 sayý girini ve bunu  bir sete ekleyin sonra 
 * 
 * setimizi yazdýlralým 
 * 
 * 
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOrnek {

	static Scanner scanner;
	static Set<Integer> sayýlar = new HashSet<>();
	static Set<Integer> ekledigimSýraIle = new LinkedHashSet<>();
	static Set<Integer> kucuktenbuyuge = new TreeSet<>();
	static Set<String> stringTreeSet = new TreeSet<>();
	static Set<Ogrenci> ogrenciSet = new TreeSet<>();

	// treesetler comparable
	// interfacini implemente etmiþ sýnýflar istiyor
	// tree setler karsýlastýrýlabilir bir sýnýf bir sýnýf bekliyor
	public static void sayýEkle() {

		scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Lütfen Bir sayý giriniz");
			int sayi = scanner.nextInt();
			sayýlar.add(sayi);
			ekledigimSýraIle.add(sayi);
			kucuktenbuyuge.add(sayi);
		}
	}

	public static void yazdýr(Set<Integer> set) {

		set.forEach(System.out::println);
	}

	public static void main(String[] args) {
//		sayýEkle();
//		System.out.println("====Has set====");
//		yazdýr(sayýlar);
//		System.out.println("===========");
//		System.out.println("====Linked set====");
//		yazdýr(ekledigimSýraIle);
//		System.out.println("===========");
//		System.out.println("====Tree set====");
//		yazdýr(kucuktenbuyuge);
//		System.out.println("===========");

//		stringTreeSet.add("Mustafa");
//		stringTreeSet.add("Ahmet");
//		stringTreeSet.add("Zehra");
//		stringTreeSet.add("Kemal");
//		stringTreeSet.forEach(System.out::println);

		ogrenciSet.add(new Ogrenci(100));
		ogrenciSet.add(new Ogrenci(2));
		ogrenciSet.add(new Ogrenci(3));
		ogrenciSet.add(new Ogrenci(4));
		ogrenciSet.add(new Ogrenci(55));
		ogrenciSet.add(new Ogrenci(15));
		ogrenciSet.add(new Ogrenci(23));
		ogrenciSet.add(new Ogrenci(12));
		ogrenciSet.forEach(System.out::println);

	}

}
