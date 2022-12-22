package com.bilgeadam.lesson033;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
/*
 * skt tarihi geçmemiþ urunlre %54 zam yapalým 
 * bunlarý bir sete atalým 
 * sonra seti yazdýralim
 * 
 * 
 * 
 * ürünlerimiz fiyatlarýnýn ortalamasýný getiren stram kodunu yazýn 
 * 
 * 
 */

public class UrunManager {

	List<Urun> urunler = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public Urun urunOlustur() {
		System.out.println("Urun adýný giriniz");
		String urunAdi = scanner.nextLine();
		System.out.println("Urun fiyatý giriniz");
		double fiyat = Double.parseDouble(scanner.nextLine());
		System.out.println("Urunun son kullanma tarihi giriniz");
		int skt = Integer.parseInt(scanner.nextLine());

		if (urunAdi.isBlank() || fiyat <= 0) {
			return null;
		} else {
			return new Urun(urunAdi, fiyat, skt);
		}

	}

	public Optional<Urun> urunOlustur2() {
		System.out.println("Urun adýný giriniz");
		String urunAdi = scanner.nextLine();
		System.out.println("Urun fiyatý giriniz");
		double fiyat = Double.parseDouble(scanner.nextLine());
		System.out.println("Urunun son kullanma tarihi giriniz");
		int skt = Integer.parseInt(scanner.nextLine());
		if (urunAdi.isBlank() || fiyat <= 0) {
			return Optional.empty();
		} else {
			return Optional.of(new Urun(urunAdi, fiyat, skt));
		}
	}

	public void urunEkle(Optional<Urun> urun) {

		if (urun.isPresent()) {
			urunler.add(urun.get());
		}

	}

	public void sonKullanmaTarihiGecmisUrunleriListele(List<Urun> urunler) {

		urunler.stream().filter((x) -> x.getSonKullanamTarihi() < 2022).forEach(System.out::println);
		// List<Urun> eskiUrunler = urunler.stream().filter((x) ->
		// x.getSonKullanamTarihi() < 2022)
		// .collect(Collectors.toList());

	}

	public void zamYap(List<Urun> urunler) {

//		Set<Urun> zamliUrunler = urunler.stream().filter((x) -> x.getSonKullanamTarihi() > 2022).map((y) -> {
//			y.setFiyat(y.getFiyat() * 1.54);
//			return y;
//		}).collect(Collectors.toSet());

		Set<Urun> zamliUrunler2 = urunler.stream().filter((x) -> {
			if (x.getSonKullanamTarihi() > 2022) {
				x.setFiyat(x.getFiyat() * 1.54);
				return true;
			}
			return false;
		}).collect(Collectors.toSet());

//		Set<Double> fiyatlar = urunler.stream().filter((x) -> x.getSonKullanamTarihi() > 2022).map((y) -> {
//			y.setFiyat(y.getFiyat() * 1.54);
//			return y.getFiyat();
//		}).collect(Collectors.toSet());
//		Set<Urun> zamliUrunler = urunler.stream().filter((x) -> x.getSonKullanamTarihi() > 2022)
//				.collect(Collectors.toSet());

		// zamliUrunler.forEach(System.out::println);
		zamliUrunler2.forEach(System.out::println);

	}

	public void fiyatOrtalamasý(List<Urun> urunler) {

		double ort = urunler.stream().collect(Collectors.averagingDouble(Urun::getFiyat));
		// double ort2 = urunler.stream().collect(Collectors.averagingDouble((x) ->
		// x.getFiyat()));

		urunler.stream().mapToDouble(Urun::getFiyat).average().ifPresent(System.out::println);
		// DoubleStream stream = urunler.stream().mapToDouble(Urun::getFiyat);

		// System.out.println(stream.);
		// System.out.println("ortalama fiyat:" + ort);

	}

}
