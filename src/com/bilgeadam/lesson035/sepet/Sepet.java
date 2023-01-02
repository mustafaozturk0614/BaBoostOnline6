package com.bilgeadam.lesson035.sepet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 1-Urun sýnýfýmýzda isim ve fiyat degerlerini tutacagýz 
 * bunlar için gerekli get set ve constructor yapýlarýný kuracagýz 
 * 2- Sepette Eurunlerden bir arrayimiz olsun 
 * - birde Urun listemiz olsun bir urunolustur metodu yapýp 
 * -Eurun product arrayýndaki enumlarýn degerleri ile urun oluþtrup listemizi dolduralým   
 * 3- bir urun fiyat mapimiz olsun bu mapi urunler listesi uzerinden olusturalým;
 * 
 
 * 4- urun ekle metodu ekleyelim listeden donup indexine göre secebilirz yada String olarak girebilirz
 * burdaki mapimize dýþarýdan bir urun ekleyeceðiz her seçiþte bir tane ekleiyecek yani 1er 1 er atacak 
 
 *5- 2 tane mapimiz var 1.map sepet sepet uzerinde bir urune denk geldiðimde bu urunun kaç adet oldugunu 
 *biliyorum ayný urun urun fiyat mapinde de tutuluyor ayný urun ismiylede diðier mapden fiyatý cekerim
 *sonra adet*fiyattan bir fiyat degerim olur 
 *bunu mapdaki her bir eleman için yapacaðýz ve her bir elam için bize bir double fiyat doneek 
 *bu fiyatlarýda bir double listede toplayalým 
 *ve daha sonra bu double listedeki deðerleri toplayalým buda bize sepetteki toplam fiyatý verecek
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
