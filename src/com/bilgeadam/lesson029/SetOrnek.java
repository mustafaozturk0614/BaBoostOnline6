package com.bilgeadam.lesson029;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetOrnek {
	/*
	 * Birtane String bir setimiz olsun daha sonra d��ar�dan bir kategori
	 * istedi�imiz metot olsun bu kategorileri setimize ekleyelim
	 * 
	 * eger daha once eklemi�sek bize boyle bir kategori eklendi diye bir c�kt�
	 * versin
	 * 
	 * setimizi yazd�ral�m
	 * 
	 */
	public static void main(String[] args) {

		// Set<String> set = new HashSet<>();
		Set<String> set = new LinkedHashSet<>();
		kategoriEkle("Romantik", set);
		kategoriEkle("Dram", set);
		kategoriEkle("Romantik", set);
		kategoriEkle("Bilim Kurgu", set);

		for (String kategori : set) {
			System.out.println(kategori);
		}

	}

	public static void kategoriEkle(String kategori, Set<String> set) {
		if (set.contains(kategori)) {
			System.out.println(kategori + " kategorisi daha once eklenmi�tir bir daha ekleyemezsiniz!!!");
		} else {
			System.out.println(kategori + " basar�l� bir �ekilde eklenmi�tir");
			set.add(kategori);
		}
	}

	public static void kategoriEkle2(String kategori, Set<String> set) {
		if (!set.add(kategori)) {
			System.out.println(kategori + " kategorisi daha once eklenmi�tir bir daha ekleyemezsiniz!!!");
		} else {
			System.out.println(kategori + " basar�l� bir �ekilde eklenmi�tir");
		}
	}

}
