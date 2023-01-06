package com.bilgeadam.lesson039.com.bilgeadam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Uygulama {

	List<Film> filmler;
	static Scanner scanner = new Scanner(System.in);

	public Uygulama() {
		baslangýcVerisiOlustur();
	}

	public void baslangýcVerisiOlustur() {

		Yonetmen yonetmen1 = new Yonetmen("Miyazaki", "Japonya");
		Film movie1 = new Film("RuhlarýnKAcýsý", LocalDate.of(2001, 10, 10), 5000000, ETur.ANIME, yonetmen1, 9.5);
		Film movie2 = new Film("Ruzgarli Vadi", LocalDate.of(1984, 06, 8), 1000000, ETur.ANIME, yonetmen1, 9.1);
		Film movie3 = new Film("Prenses Mononoke", LocalDate.of(1997, 10, 10), 30000000, ETur.ANIME, yonetmen1, 9.6);
		Film movie4 = new Film("Yuruyen Sato", LocalDate.of(2004, 10, 10), 1000000, ETur.ANIME, yonetmen1, 8.7);
		Yonetmen yonetmen2 = new Yonetmen("Reha Erdem", "Türkiye");
		Film movie5 = new Film("KaÃ§ Para KaÃ§", LocalDate.of(1999, 10, 10), 100000, ETur.DRAMA, yonetmen2, 7.5);
		Film movie6 = new Film("Korkuyorum Anne", LocalDate.of(2004, 06, 8), 300000, ETur.KARAMIZAH, yonetmen2, 8.1);
		Film movie7 = new Film("Kosmos", LocalDate.of(2009, 12, 12), 500000, ETur.DRAMA, yonetmen2, 8.6);
		Film movie8 = new Film("Seni Buldum Ya", LocalDate.of(2021, 12, 12), 400000, ETur.KARAMIZAH, yonetmen2, 7.2);
		Yonetmen yonetmen3 = new Yonetmen("David Fincher", "Amerika");
		Film movie9 = new Film("Seven", LocalDate.of(1995, 10, 10), 2500000, ETur.DRAMA, yonetmen3, 8.8);
		Film movie10 = new Film("Dovus Kulubu", LocalDate.of(1999, 06, 8), 2500000, ETur.AKSIYON, yonetmen3, 9.4);
		Film movie11 = new Film("Zodiac", LocalDate.of(2007, 11, 20), 800000, ETur.GERILIM, yonetmen3, 7.8);
		Film movie12 = new Film("Gone Girl", LocalDate.of(2014, 10, 10), 1500000, ETur.DRAMA, yonetmen3, 8.2);
		Film movie13 = new Film("Mank", LocalDate.of(2020, 12, 12), 2000000, ETur.DRAMA, yonetmen3, 8.4);

		Yonetmen yonetmen4 = new Yonetmen("Cohens", "Amerika");
		Film movie14 = new Film("Barton Fink", LocalDate.of(1991, 12, 12), 500000, ETur.GERILIM, yonetmen4, 8.5);
		Film movie15 = new Film("Fargo", LocalDate.of(1996, 12, 12), 800000, ETur.GERILIM, yonetmen4, 8.1);
		Film movie16 = new Film("Big Lebowski", LocalDate.of(1998, 12, 12), 1100000, ETur.KARAMIZAH, yonetmen4, 9.2);
		Film movie17 = new Film("Nerdesin Be Birader", LocalDate.of(2000, 02, 2), 1500000, ETur.KARAMIZAH, yonetmen4,
				7.8);
		Film movie18 = new Film("Orada Olmayan Adam", LocalDate.of(2001, 7, 17), 500000, ETur.GERILIM, yonetmen4, 8.3);
		Film movie19 = new Film("Ä°htiyarlara Yer Yok", LocalDate.of(2007, 7, 17), 1700000, ETur.DRAMA, yonetmen4, 9.3);
		Film movie20 = new Film("Ciddi Bir Adam", LocalDate.of(2009, 7, 17), 500000, ETur.KARAMIZAH, yonetmen4, 8.0);

		Yonetmen yonetmen5 = new Yonetmen("Emin Alper", "Türkiye");
		Film movie21 = new Film("Tepenin Ardý", LocalDate.of(2012, 7, 17), 50000, ETur.DRAMA, yonetmen5, 7.7);
		Film movie22 = new Film("Kýz Kardesler", LocalDate.of(2019, 7, 17), 400000, ETur.DRAMA, yonetmen5, 8.5);
		Film movie23 = new Film("Kurak Gunler", LocalDate.of(2022, 7, 17), 600000, ETur.DRAMA, yonetmen5, 8.4);
		Yonetmen yonetmen6 = new Yonetmen("Wes Anderson", "Amerika");
		Film movie24 = new Film("Yaman Tilki", LocalDate.of(2009, 7, 17), 900000, ETur.ANIMASYON, yonetmen6, 7.8);
		Film movie25 = new Film("Moonrise Kingdom", LocalDate.of(2012, 7, 17), 8500000, ETur.FANTASTIK, yonetmen4, 8.6);
		Film movie26 = new Film("BuyukBudapeste Oteli ", LocalDate.of(2014, 7, 17), 1200000, ETur.FANTASTIK, yonetmen4,
				9.0);
		Film movie27 = new Film("Kopek Adasý ", LocalDate.of(2018, 7, 17), 1500000, ETur.ANIMASYON, yonetmen4, 9.2);

		filmler = List.of(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11,
				movie12, movie13, movie14, movie15, movie16, movie17, movie18, movie19, movie20, movie21, movie22,
				movie23, movie24, movie25, movie26, movie27);

	}

	// Dýsarýdan bir ulke ismi girelim bu ülke ýsmýne gore yonetmenleri bir listede
	// toplayalým
	// eger ulke ýsmý yoksa bu ulkde yonetemen bulunamadý dýye bir cýktý versýn
	// bulmussada listeyi yazdýrsýn
	public void ulkeyeGoreYonetmenler() {
		List<Yonetmen> yonetmenler = new ArrayList<>();
		String isim = scanner.nextLine();

		// List<Film> x = filmler.stream().filter(null).collect(Collectors.toList());
//		yonetmenler = filmler.stream().map(x -> {
//			if (x.getYonetmen().getCountry().equals(isim)) {
//				return x.getYonetmen();
//			} else {
//				return null;
//			}
//
//		}).collect(Collectors.toList());
//
//		yonetmenler = filmler.stream().filter(y -> y.getYonetmen().getCountry().equals(isim)).map(z -> z.getYonetmen())
//				.distinct().collect(Collectors.toList());

		filmler.stream().filter(y -> y.getYonetmen().getCountry().equals(isim)).forEach(z -> {
			if (!yonetmenler.contains(z.getYonetmen())) {
				yonetmenler.add(z.getYonetmen());
			}
		});

		yonetmenler.forEach(System.out::println);

	}
	// puanlarý 8 den yuksek olan filmleri yazdýran metot

	public void puanlarý8denBuyukOlanFilmler() {

		filmler.stream().filter(x -> x.getPuan() > 8).forEach(y -> System.out.println(y));

		Set<Double> puanlar = filmler.stream().filter(x -> x.getPuan() > 8).map(x -> x.getPuan())
				.collect(Collectors.toSet());
	}

	public void filmlerinpuanortalamasý() {

		double ortalama = filmler.stream().collect(Collectors.averagingDouble(x -> x.getPuan()));
		System.out.println(ortalama);

	}

	public void yonetmenlerinpuanortalamasý() {

		Map<Yonetmen, List<Film>> yonetmenMap = new HashMap<>();// rehaerdem = {Kosmos,KAc para kac }

		Map<String, Double> yonetmenOrt = new HashMap<>();

		yonetmenMap = filmler.stream().collect(Collectors.groupingBy(Film::getYonetmen));
		yonetmenMap = filmler.stream().collect(Collectors.groupingBy(x -> x.getYonetmen()));

		// yonetmenMap.forEach((k, v) -> System.out.println(k + "-" + v));

		yonetmenOrt = yonetmenMap.entrySet().stream().collect(Collectors.toMap(x -> x.getKey().getIsim(),
				y -> y.getValue().stream().collect(Collectors.averagingDouble(z -> z.getPuan()))));

		yonetmenOrt.forEach((k, v) -> System.out.println(k + "-" + v));

		Map<String, Long> yeniMap = filmler.stream().collect(Collectors.toMap(x -> x.getIsim(), y -> y.getHasilat()));
		yeniMap.forEach((k, v) -> System.out.println(k + "-" + v));
	}

	public void hasýlatToplamý() {

		Optional<Long> hasýlat = filmler.stream().map(x -> x.getHasilat()).reduce((f1, f2) -> f1 + f2);
		System.out.println(hasýlat);

	}

	public static void main(String[] args) {

		Uygulama uygulama = new Uygulama();
		// uygulama.ulkeyeGoreYonetmenler();
		// uygulama.puanlarý8denBuyukOlanFilmler();
		// uygulama.filmlerinpuanortalamasý();
		// uygulama.yonetmenlerinpuanortalamasý();
		uygulama.hasýlatToplamý();

	}

}
