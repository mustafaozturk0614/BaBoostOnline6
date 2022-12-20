package com.bilgeadam.lesson030;
/*
 * klavyeden rastgele 10 say� girini ve bunu  bir sete ekleyin sonra 
 * 
 * setimizi yazd�lral�m 
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
	static Set<Integer> say�lar = new HashSet<>();
	static Set<Integer> ekledigimS�raIle = new LinkedHashSet<>();
	static Set<Integer> kucuktenbuyuge = new TreeSet<>();
	static Set<String> stringTreeSet = new TreeSet<>();
	static Set<Ogrenci> ogrenciSet = new TreeSet<>();

	// treesetler comparable
	// interfacini implemente etmi� s�n�flar istiyor
	// tree setler kars�last�r�labilir bir s�n�f bir s�n�f bekliyor
	public static void say�Ekle() {

		scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("L�tfen Bir say� giriniz");
			int sayi = scanner.nextInt();
			say�lar.add(sayi);
			ekledigimS�raIle.add(sayi);
			kucuktenbuyuge.add(sayi);
		}
	}

	public static void yazd�r(Set<Integer> set) {

		set.forEach(System.out::println);
	}

	public static void main(String[] args) {
//		say�Ekle();
//		System.out.println("====Has set====");
//		yazd�r(say�lar);
//		System.out.println("===========");
//		System.out.println("====Linked set====");
//		yazd�r(ekledigimS�raIle);
//		System.out.println("===========");
//		System.out.println("====Tree set====");
//		yazd�r(kucuktenbuyuge);
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
