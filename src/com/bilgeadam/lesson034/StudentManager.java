package com.bilgeadam.lesson034;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 1-ortalama hesaplayan stream yapýsný yazýnýz  hepsi için ayrý hesaplayýp ortalama 
 * notlar double listemiz olacak not ortalamalýrný bu listede toplayacagýz 
 * birde sýnýf ortalammýz bulunsun;
 * 
 * 2- bolüme göre maplayelim 
 * 3-not ortlamasý 50 ve altý olanlar için durum guncellemesi Kaldý diðerleri için Geçti olsun
 * 
 */
public class StudentManager {

	List<Student> ogrenciler;

	public StudentManager() {
		baslangicVerisi();
	}

	public void bolumeGoreMaple() {
		Map<String, List<Student>> bolumeGoreMap;
		Map<String, List<Student>> bolumeGoreMap2;
		bolumeGoreMap = ogrenciler.stream().collect(Collectors.groupingBy(x -> x.getBolum()));
		bolumeGoreMap2 = ogrenciler.stream().collect(Collectors.groupingBy(Student::getBolum));
		bolumeGoreMap.forEach((x, y) -> System.out.println(x + "-" + y));
		bolumeGoreMap2.entrySet().forEach(System.out::println);

	}

	public void durmuGuncelle() {

//		ogrenciler.stream().filter((x) -> {
//			if (x.notOrtHesapla() > 50) {
//				x.setDurum("Geçti");
//				return true;
//			} else {
//				x.setDurum("Kaldý");
//				return false;
//			}
//		}).forEach(System.out::println);
//
//		ogrenciler.stream().filter(x -> x.notOrtHesapla() > 50).forEach(y -> y.setDurum("Geçti"));
//		ogrenciler.stream().filter(x -> x.notOrtHesapla() <= 50).forEach(y -> y.setDurum("Kaldý"));
//
//		ogrenciler.forEach(System.out::println);

		ogrenciler.stream().forEach(s -> {

			if (s.notOrtHesapla() <= 50) {
				s.setDurum("Kaldý");
			} else {
				s.setDurum("Geçti");
			}

		});
//		ogrenciler.stream().map(s -> {
//
//			if (s.notOrtHesapla() <= 50) {
//				s.setDurum("Kaldý");
//				return s;
//			} else {
//				s.setDurum("Geçti");
//				return s;
//			}
//
//		});
		ogrenciler.stream().forEach(s -> s.setDurum(s.notOrtHesapla() > 50 ? "Geçti" : "Kaldi"));
		ogrenciler.forEach(System.out::println);
	}

	public void baslangicVerisi() {
		ogrenciler = new ArrayList<>();
		Student student1 = new Student(1, "Mustafa", "mat");
		student1.getNotlar().add(50D);
		student1.getNotlar().add(50.0);
		student1.getNotlar().add(50D);
		Student student2 = new Student(2, "Ayþe", "tm");
		student2.getNotlar().add(80D);
		student2.getNotlar().add(55D);
		student2.getNotlar().add(79.5);
		Student student3 = new Student(3, "Hakan", "tm");
		student3.getNotlar().add(86D);
		student3.getNotlar().add(97.5);
		student3.getNotlar().add(50.5);
		Student student4 = new Student(4, "Mert", "mat");
		student4.getNotlar().add(80D);
		student4.getNotlar().add(30D);
		student4.getNotlar().add(82.5);
		Student student5 = new Student(5, "Gamze", "mat");
		student5.getNotlar().add(10D);
		student5.getNotlar().add(35.7);
		student5.getNotlar().add(58.3);
		Student student6 = new Student(6, "Merve", "tm");
		student6.getNotlar().add(36D);
		student6.getNotlar().add(23.5D);
		student6.getNotlar().add(57.5);
		ogrenciler = List.of(student1, student2, student3, student4, student5, student6);
	}

	public void notEkle() {

		ogrenciler.stream().forEach(x -> x.getNotlar().add(80D));

	}

	public void notEkle2() {

		ogrenciler.stream().forEach(x -> x.setNotlar(x.getNotlar().stream().map(y -> y + 5.0)// double listem= 50 50 60
																								// liste2= 55 55 65
				.collect(Collectors.toList())));

	}

	public void ogrenciVeNotOrtalamsýMapleme() {
		Map<String, Double> map = new HashMap<>();
		Map<Student, Double> map2 = new HashMap<>();

//		ogrenciler.stream().collect(Collectors.groupingBy(x -> x.notOrtHesapla()));

		map = ogrenciler.stream().collect(Collectors.toMap(Student::getIsim, Student::notOrtHesapla));

		map2 = ogrenciler.stream().collect(Collectors.toMap(x -> x, y -> y.notOrtHesapla()));

		map = ogrenciler.stream().collect(Collectors.toMap(x -> x.getIsim(), y -> y.notOrtHesapla()));

		map.entrySet().forEach(System.out::println);

	}

	public void ortalamaHesaplama() {

		List<Double> notlar = new ArrayList<Double>();
		// 1. çözüm map li çözüm
		// notlar = ogrenciler.stream().map((x) ->
		// x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)))
		// .collect(Collectors.toList());

		// notlar.forEach(System.out::println);

		// 2.çözüm For Eachli Cozum
//		ogrenciler.stream().forEach((x) -> {
//
//			System.out.println(x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//		});

//		ogrenciler.stream().forEach((x) -> {
//			notlar.add(x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//		});

		// notlar.forEach(System.out::println);

		// 3.çözüm
//		ogrenciler.stream().forEach(x -> System.out.println(x.notOrtHesapla()));
//
//		notlar = ogrenciler.stream().map(x -> x.notOrtHesapla()).collect(Collectors.toList());
//
//		notlar.forEach(System.out::println);

		Double ort = ogrenciler.stream().map(x -> x.notOrtHesapla()).collect(Collectors.averagingDouble(t -> t));

		Double ort2 = ogrenciler.stream().collect(
				Collectors.averagingDouble((x) -> x.getNotlar().stream().collect(Collectors.averagingDouble(t -> t))));

		System.out.println(ort);
		System.out.println(ort2);
	}

}
