package com.bilgeadam.lesson035.sepet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 1-Urun s�n�f�m�zda isim ve fiyat degerlerini tutacag�z 
 * bunlar i�in gerekli get set ve constructor yap�lar�n� kuracag�z 
 * 2- Sepette Eurunlerden bir arrayimiz olsun 
 * - birde Urun listemiz olsun bir urunolustur metodu yap�p 
 * -Eurun product array�ndaki enumlar�n degerleri ile urun olu�trup listemizi doldural�m   
 * 3- bir urun fiyat mapimiz olsun bu mapi urunler listesi uzerinden olustural�m;
 * 
 
 * 4- urun ekle metodu ekleyelim listeden donup indexine g�re secebilirz yada String olarak girebilirz
 * burdaki mapimize d��ar�dan bir urun ekleyece�iz her se�i�te bir tane ekleiyecek yani 1er 1 er atacak 
 
 *5- 2 tane mapimiz var 1.map sepet sepet uzerinde bir urune denk geldi�imde bu urunun ka� adet oldugunu 
 *biliyorum ayn� urun urun fiyat mapinde de tutuluyor ayn� urun ismiylede di�ier mapden fiyat� cekerim
 *sonra adet*fiyattan bir fiyat degerim olur 
 *bunu mapdaki her bir eleman i�in yapaca��z ve her bir elam i�in bize bir double fiyat doneek 
 *bu fiyatlar�da bir double listede toplayal�m 
 *ve daha sonra bu double listedeki de�erleri toplayal�m buda bize sepetteki toplam fiyat� verecek
 *
 *
 *
 */

public class Sepet {

	EUrun[] product = EUrun.values();

	List<Urun> urunler = new ArrayList<>();

	Map<String, Double> urunFiyatMap = new HashMap<>();

	Map<String, Integer> sepet = new HashMap<>();

	double toplam = 0;

//	List<String> urunler2;// "Cips-20","Kola-25"

	public void urunOlustur() {

//		for (int i = 0; i < product.length; i++) {
//			Urun urun = new Urun();
//			urun.setFiyat(product[i].fiyat);
//			urun.setIsim(product[i].name());
//			// urun.setIsim(product[i].toString());
//			urunler.add(urun);
//		}

		for (EUrun urun : product) {
//			Urun myUrun = new Urun();
//			myUrun.setFiyat(urun.fiyat);
//			myUrun.setIsim(urun.name());
//			urunler.add(myUrun);
			urunler.add(new Urun(urun.name(), urun.fiyat));

			// urunler2.add(myUrun.getIsim() + "-" + myUrun.getFiyat());

		}
	}

	public void urunOlustur2() {

//		List<EUrun> urunListesi = Arrays.asList(product);
//
//		urunListesi.stream().forEach(x -> urunler.add(new Urun(x.name(), x.fiyat)));

		Arrays.asList(product).stream().forEach(x -> urunler.add(new Urun(x.name(), x.fiyat)));

//		Arrays.stream(product).forEach(x -> urunler.add(new Urun(x.name(), x.fiyat)));

	}

	public void urunFiyatMapOlustur() {

		urunler.stream().forEach(x -> urunFiyatMap.put(x.getIsim(), x.getFiyat()));

		urunFiyatMap = urunler.stream().collect(Collectors.toMap(x -> x.getIsim(), y -> y.getFiyat()));
	}

	public void sepetiGoset() {

	}

	public void urunEkle(String urunIsmi) {
//		int sayac = sepet.containsKey(urunIsmi) ? sepet.get(urunIsmi) : 0;
//
//		sepet.put(urunIsmi, sayac + 1);

		if (sepet.containsKey(urunIsmi)) {

			sepet.put(urunIsmi, sepet.get(urunIsmi) + 1);
		} else {

			sepet.put(urunIsmi, 1);
		}

	}

	public void sepetToplami() {
		List<Double> fiyatlar = new ArrayList<>();
		DoubleSummaryStatistics toplam;

		for (EUrun urun : product) {
			fiyatlar.add(sepet.get(urun) * urunFiyatMap.get(urun));
		}

		toplam = fiyatlar.stream().collect(Collectors.summarizingDouble(Double::doubleValue));

		System.out.println("Sepetin toplam fiyati " + toplam);
	}

	public void sepetToplami2() {
		List<Double> fiyatlar = new ArrayList<>();
		sepet.forEach((isim, adet) -> {
			double fiyat = urunFiyatMap.get(isim) * adet;
			fiyatlar.add(fiyat);
		});
		double toplam = 0;
		for (Double fiyat : fiyatlar) {
			toplam += fiyat;
		}
		System.out.println("Sepetin toplam fiyati " + toplam);
	}

	public void sepetToplami3() {
		sepet.forEach((isim, adet) -> toplam += (urunFiyatMap.get(isim)) * adet);

		System.out.println("Sepetin toplam fiyati " + toplam);
	}

	public void sepetToplami4() {

		List<Double> fiyatlar = sepet.entrySet().stream().map(urun -> urunFiyatMap.get(urun.getKey()) * urun.getValue())
				.collect(Collectors.toList());

		Double toplam = fiyatlar.stream().reduce((s1, s2) -> s1 + s2).get();

		Double toplam2 = sepet.entrySet().stream().map(urun -> urunFiyatMap.get(urun.getKey()) * urun.getValue())
				.reduce((s1, s2) -> s1 + s2).get();

		System.out.println("Sepetin toplam fiyati " + toplam);

		System.out.println("Sepetin toplam fiyati " + toplam2);

	}
}
