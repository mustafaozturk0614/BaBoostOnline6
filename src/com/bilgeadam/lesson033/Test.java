package com.bilgeadam.lesson033;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		List<Optional<Urun>> yeniUrunler = new ArrayList<>();
		UrunManager urunManager = new UrunManager();

		// Urun urun = urunManager.urunOlustur("yeni urun", 0, 1990);

		for (int i = 0; i < 3; i++) {

			urunManager.urunEkle(urunManager.urunOlustur2());
			// yeniUrunler.add(urunManager.urunOlustur2());

		}

		// urunManager.sonKullanmaTarihiGecmisUrunleriListele(urunManager.urunler);

		// urunManager.zamYap(urunManager.urunler);

		urunManager.fiyatOrtalamasý(urunManager.urunler);

		// double ort =
		// urunManager.urunler.stream().collect(Collectors.averagingDouble(Urun::getFiyat));
		// System.out.println("ort=>>>>>" + ort);

//		for (Urun urun : urunManager.urunler) {
//			System.out.println(urun.getIsim());
//		}
		// eger urun varsa fiyatýný 2yle carpalým
//		for (Optional<Urun> urun : yeniUrunler) {
//			urun.map((x) -> {
//				x.setFiyat(x.getFiyat() * 2);
//				return x;
//			}).ifPresent(System.out::println);
//
//		}

//		Optional<String> kelime1 = Optional.ofNullable(null);
//		Optional<String> kelime2 = Optional.ofNullable("yeni  ");
//		Optional<String> kelime3 = Optional.ofNullable("merhaba dünya");
//
//		kelime1.filter((x) -> x.length() > 5).ifPresent(System.out::println);
//		kelime2.filter((x) -> x.trim().length() > 5).ifPresent(System.out::println);
//		kelime3.filter((x) -> x.length() > 5).ifPresent(System.out::println);
//
//		System.out.println(kelime1.orElse("xxx"));
//		System.out.println(kelime2.orElse("xxx"));
//		System.out.println(kelime3.orElse("xxx"));

	}
}
