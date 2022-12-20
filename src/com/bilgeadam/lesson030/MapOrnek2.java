package com.bilgeadam.lesson030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * ogrenci ve notlardan map olusturmanýzý istiyorum 
 * 
 * ogrenciyi cagýrdýgýmda bana notu donsun 
 * 
 * mapi yazdýralým 
 * 
 */
public class MapOrnek2 {

	String[] ogrenci = { "Ayþe", "Ece", "Mahmut" };

	int[] notlar = { 60, 80, 70 };

	int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };

	Map<String, Integer> sinif = new HashMap<>();
	Map<String, List<Integer>> map = new HashMap<>();

	public void mapOlustur() {

		for (int i = 0; i < notlar.length; i++) {
			sinif.put(ogrenci[i], notlar[i]);
		}

	}

	public void mapOlustur2() {
//int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
		// String[] ogrenci = { "Ayþe", "Ece", "Mahmut" };

		for (int i = 0; i < ogrenci.length; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < notlar2[i].length; j++) {
				list.add(notlar2[i][j]);
			}
			map.put(ogrenci[i], list);
		}
	}

	public static void main(String[] args) {
		MapOrnek2 mapOrnek2 = new MapOrnek2();
		mapOrnek2.mapOlustur2();

//		System.out.println(mapOrnek2.sinif.get("Ece"));
		// mapOrnek2.sinif.forEach((k, v) -> System.out.println(k + "-->" + v));

//		for (Entry<String, Integer> r : mapOrnek2.sinif.entrySet()) {
//			System.out.println(r.getKey() + "--->" + r.getValue());
//		}
//		

		mapOrnek2.map.forEach((k, v) -> {
			System.out.println(k + ": ");
			v.forEach((t) -> System.out.print(t + ","));
//			for (int i = 0; i < v.size(); i++) {
//				System.out.print(v.get(i) + ",");
//			}
			System.out.println();
		});
//Map<String, List<Integer>> map = new HashMap<>();
		for (Entry<String, List<Integer>> ogrenciler : mapOrnek2.map.entrySet()) {
			System.out.print(ogrenciler.getKey() + "==> ");
			for (Integer not : ogrenciler.getValue()) {
				System.out.print(not + " ");
			}
		}

	}

}
