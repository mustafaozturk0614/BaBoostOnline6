package com.bilgeadam.lesson030;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 * 
 * 
 * 
 */
public class MapOrnek {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		Map<Integer, Integer> map3 = new HashMap<>();
		Map<String, String> map4 = new HashMap<>();
		Map<Integer, Boolean> map5 = new HashMap<>();
		Map<Boolean, List<String>> map6 = new HashMap<>();
		Map<String, Map<Integer, List<Integer>>> map7 = new HashMap<>();
		Map<Integer, Ogrenci> ogrenciMap = new HashMap<>();

		ogrenciMap.put(1, new Ogrenci(1, "Mustafa"));
		ogrenciMap.put(2, new Ogrenci(2, "Merve"));
		ogrenciMap.put(3, new Ogrenci(3, "Ahmet"));
		ogrenciMap.put(3, new Ogrenci(111, "Zehra"));
		System.out.println(ogrenciMap.get(3));
		System.out.println(ogrenciMap.containsKey(11));

	}
}
