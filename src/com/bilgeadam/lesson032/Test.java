package com.bilgeadam.lesson032;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		// sansliNumaralar.sayilarMap.forEach((k, v) -> System.out.println(k + "=" +
		// v));
		sansliNumaralar.listeOlustur();
		// sansliNumaralar.sayilarListesi.forEach(System.out::println);
		sansliNumaralar.sansliNumaralariBul();
		int i = 1;
		for (Integer sayi : sansliNumaralar.sansliNumaralar) {
			System.out.println((i) + "-" + sayi);
			i++;
		}

		System.out.println("50 den büyük sayýlar");
		// Stream<Integer> strem=sansliNumaralar.sansliNumaralar.stream();
		Set<Integer> set = sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50).collect(Collectors.toSet());
		List<Integer> list = sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50)
				.collect(Collectors.toList());
		set.forEach(System.out::println);
		System.out.println("50 den büyük sayýlar");
		sansliNumaralar.sansliNumaralar.stream().filter((y) -> y > 50).forEach(System.out::println);

		System.out.println("Sayýlarýn toplamý");
		System.out.println(sansliNumaralar.sansliNumaralar.stream().reduce((x, y) -> x + y));
		Optional<Integer> toplam = sansliNumaralar.sansliNumaralar.stream().reduce((x, y) -> x + y);
		System.out.println(toplam);

		System.out.println("50den büyük sayýlarýn toplamý");
		Optional<Integer> toplam2 = sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50)
				.reduce((x, y) -> x + y);
		System.out.println(toplam2);

		sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50).reduce((x, y) -> x + y)
				.ifPresent(System.out::println);
		toplam2.ifPresent(System.out::println);

		// Optional Metotlarý
		Integer toplam3 = toplam2.get();
		Optional<String> kelime = Optional.empty();
		System.out.println(toplam3);
		System.out.println(kelime);
		Optional<String> kelime2 = Optional.ofNullable(null);
		System.out.println(kelime2);
		Optional<String> kelime3 = Optional.of("Merhaba Dünya");
		System.out.println(kelime3.get());
		System.out.println(kelime2.isEmpty());
		System.out.println(kelime2.isPresent());

	}
}
