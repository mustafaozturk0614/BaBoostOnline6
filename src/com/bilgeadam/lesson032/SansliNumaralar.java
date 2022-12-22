package com.bilgeadam.lesson032;
/*
 * 
 * 1 den 100 e kadar rastgele
 * 10 000 tane sayý ureteceðiz 
 * 1- sayýolustur metodu ile rastgele olusturduðumuz sayýlarý map a atacaðýz 
 * sayýnýn kaç kere olduðunu tutacaðýz key deðeri sayý 
 * value deðeri ise kaç kere üretildiði.
 * 
 * 
 * 2-map de gezinirken  listeye ekleyeceðiz her elaman
 *  ne kadar tekrar ediyorsa o kadar
 * kez listeye ekleyeceðiz
 * 
 *3- en son listeden rastgele 10 adet deðer alacðýz ve bunu bir set e ekleyeceðiz 
 *önce listeyi karýstýralm Collections.suhffle();
 *ben bir set olusturacagým bu setin içine 10 tane rakam ekleyecegim 
 *
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {

	static final int maxSayi = 100;
	static final int uretlienSayiMiktari = 10000;

	Map<Integer, Integer> sayilarMap = new HashMap<>();
	List<Integer> sayilarListesi = new ArrayList<>();
	Set<Integer> sansliNumaralar = new TreeSet<>();

	public void mapOlustur() {
		for (int i = 0; i < uretlienSayiMiktari; i++) {
			int sayi = Utility.randomSayýUret(1, maxSayi + 1);
			if (sayilarMap.containsKey(sayi)) {
				sayilarMap.put(sayi, sayilarMap.get(sayi) + 1);
			} else {
				sayilarMap.put(sayi, 1);
			}
		}

	}

	public void listeOlustur() {

		for (Entry<Integer, Integer> sayi : sayilarMap.entrySet()) {
			for (int i = 0; i < sayi.getValue(); i++) {
				sayilarListesi.add(sayi.getKey());
			}
		}

//		sayilarMap.forEach((x, y) -> {
//			for (int i = 0; i < y; i++) {
//				sayilarListesi.add(x);
//			}
//		});

	}

	public void sansliNumaralariBul() {

		Collections.shuffle(sayilarListesi);

		while (sansliNumaralar.size() < 10) {
			int index = Utility.randomSayýUret(0, sayilarListesi.size());
			sansliNumaralar.add(sayilarListesi.get(index));
			sayilarListesi.remove(index);
		}
	}

}
