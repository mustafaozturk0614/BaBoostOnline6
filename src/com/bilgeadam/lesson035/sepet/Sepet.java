package com.bilgeadam.lesson035.sepet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
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

	public Sepet() {
		urunOlustur2();
		urunFiyatMapOlustur();
	}

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
		sepet.forEach((k, v) -> System.out.println(k + "-" + v));
		sepetToplami4();
	}

	public void urunEkle() {
//		int sayac = sepet.containsKey(urunIsmi) ? sepet.get(urunIsmi) : 0;
//
//		sepet.put(urunIsmi, sayac + 1);
		System.out.println("Eklemek istediðiniz urun ismini giriniz");
		Scanner scanner = new Scanner(System.in);
		String urunIsmi = scanner.nextLine();

		if (sepet.containsKey(urunIsmi)) {

			sepet.put(urunIsmi, sepet.get(urunIsmi) + 1);
		} else {

			sepet.put(urunIsmi, 1);
		}

	}

	public void urunEkle2() {
//		int sayac = sepet.containsKey(urunIsmi) ? sepet.get(urunIsmi) : 0;
//
//		sepet.put(urunIsmi, sayac + 1);

		AtomicInteger i = new AtomicInteger(1);
		urunler.forEach(x -> {
			System.out.println(i + "-" + x.getIsim() + "==>" + x.getFiyat());
			i.set(i.get() + 1);

		});
		System.out.println("Eklemek istediðiniz urun numarasýný giriniz");
		Scanner scanner = new Scanner(System.in);
		int urunIndex = scanner.nextInt();
		String urunIsmi = urunler.get(urunIndex - 1).getIsim();

		if (sepet.containsKey(urunIsmi)) {

			sepet.put(urunIsmi, sepet.get(urunIsmi) + 1);
		} else {

			sepet.put(urunIsmi, 1);
		}
		System.out.println(urunIsmi + " sepete baþarýyla eklendi");

	}

	// ?
	public void sepetToplami() {
		List<Double> fiyatlar = new ArrayList<>();
		DoubleSummaryStatistics toplam;

		for (Entry<String, Integer> urun : sepet.entrySet()) {
			fiyatlar.add(urun.getValue() * urunFiyatMap.get(urun.getKey()));
		}

		toplam = fiyatlar.stream().collect(Collectors.summarizingDouble(Double::doubleValue));

		System.out.println("Sepetin toplam fiyati " + toplam.getSum());
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
		//
		// toplam=40 +80=120+120=240

		toplam = 0;
		sepet.forEach((isim, adet) -> toplam += (urunFiyatMap.get(isim) * adet));
		System.out.println("Sepetin toplam fiyati " + toplam);
	}

	public void sepetToplami5() {
		AtomicInteger toplam2 = new AtomicInteger(0);
		int toplam3 = 0;
		sepet.entrySet().stream().forEach(x -> {
			double fiyat = toplam2.get() + urunFiyatMap.get(x.getKey()) * x.getValue();
			toplam2.set((int) fiyat);
		});
		System.out.println("Sepetin toplam fiyati " + toplam2);
	}

	public void sepetToplami4() {

		List<Double> fiyatlar = sepet.entrySet().stream().map(urun -> urunFiyatMap.get(urun.getKey()) * urun.getValue())
				.collect(Collectors.toList());

		// Entry set - Map Farký
		// urunfiyatMap
		// cola=20
		// cips=15
		// urunFiyatMap.get(cola) ===> donen deger 20
		// urunFiyatMap.get(cips) ===> donen deger 15

		// sepet
		// cola=2
		// cips=3
		// sepet.get(cola) ===> donen deger 2
		// sepet.get(cips) ===> donen deger 3

		// sepetEntrySet
		// 0.index ==> cola:2
		// 1.index ==> cips:3

		// 0.index.getKey()==> donen deger cola 0.index.getValue() ===> donen deger 2

		Double toplam = fiyatlar.stream().reduce((s1, s2) -> s1 + s2).get();

		Double toplam2 = sepet.entrySet().stream().map(urun -> urunFiyatMap.get(urun.getKey()) * urun.getValue())
				.reduce((s1, s2) -> s1 + s2).get();

		Optional<Double> toplam3 = sepet.entrySet().stream()
				.map(urun -> urunFiyatMap.get(urun.getKey()) * urun.getValue()).reduce((s1, s2) -> s1 + s2);

		// System.out.println("Sepetin toplam fiyati " + toplam);

		System.out.println("Sepetin toplam fiyati " + toplam2);

	}

	public void urunLeriListele() {

		urunFiyatMap.forEach((k, v) -> System.out.println(k + "=" + v));

	}

	public void menu() {
		int kontrol = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("-----------");
			System.out.println("1-ÜrünListesi Goster");
			System.out.println("2-Ürün Ekle");
			System.out.println("3-Sepeti Goster");
			System.out.println("0-Çýkýþ");
			System.out.println("-----------");
			System.out.println("Lütfen bir iþlem seciniz");
			kontrol = scanner.nextInt();

			switch (kontrol) {
			case 1:
				urunLeriListele();
				break;
			case 2:
				urunEkle2();
				break;
			case 3:
				sepetiGoset();
				break;
			case 0:

				break;
			default:
				break;
			}

		} while (kontrol != 0);

	}
}
