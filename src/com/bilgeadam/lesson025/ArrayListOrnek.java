package com.bilgeadam.lesson025;

import java.util.ArrayList;
import java.util.List;

/*
 * Bir tane String arraylisti oluþturalým 
 * 
 * Ankara
 * Bursa
 * Antalya
 * Artvin 
 * Erzurum 
 * Karaman
 * 
 */
public class ArrayListOrnek {

	public static void main(String[] args) {

		List<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Bolu");
		sehirler.add("Artvin");
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Erzurum");
		sehirler.add("Karaman");
		sehirler.add("Ankara");

//		for (int i = 0; i < sehirler.size(); i++) {
//
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);	
//		
//				i--;
//			}
//		}
//
//		for (int i = 0; i < sehirler.size(); i++) {
//
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				sehirler.add(i, "xxx");
//
//			}
//		}

//		for (int i = 0; i < sehirler.size(); i++) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.set(i, "xxx");
//			}
//		}

		for (String sehir : sehirler) {

			if (sehir.startsWith("An")) {
				sehirler.set(sehirler.indexOf(sehir), "xxx");

			}

		}

		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

	}

}
