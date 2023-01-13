package com.bilgeadam.lesson042.yuzemetreyar�s;

import java.util.Comparator;
import java.util.List;

public class YuzMetreYaris {

	public static void main(String[] args) {

		// Queue<Kosucu> kosucular = new LinkedList<>();
		long baslang�cZamani = System.currentTimeMillis();

		Kosucu kosucu1 = new Kosucu("Mustafa", baslang�cZamani);
		Kosucu kosucu2 = new Kosucu("Mert", baslang�cZamani);
		Kosucu kosucu3 = new Kosucu("Berkin", baslang�cZamani);
		Kosucu kosucu4 = new Kosucu("Arda", baslang�cZamani);
		Kosucu kosucu5 = new Kosucu("Murat", baslang�cZamani);
		List<Kosucu> kosucular = List.of(kosucu1, kosucu2, kosucu3, kosucu4, kosucu5);

		// Thread thread1 = new Thread(new Kosucu("Mustafa", baslang�cZamani));
		Thread thread1 = new Thread(kosucu1);
		Thread thread2 = new Thread(kosucu2);
		Thread thread3 = new Thread(kosucu3);
		Thread thread4 = new Thread(kosucu4);
		Thread thread5 = new Thread(kosucu5);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			System.out.println("=====Y�z metre Ko�u sonu�lar� =====");
			thread1.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// kosucular.forEach(System.out::println);
		// Map<Long, List<Kosucu>> map = new TreeMap<>();

//		kosucular.stream().forEach(x -> {
//			map.put(x.isim, x.sure);
//		});

		// map = kosucular.stream().collect(Collectors.groupingBy(Kosucu::getSure,
		// TreeMap::new, Collectors.toList()));

		// map.forEach((k, v) -> System.out.println(k + "--->" + v));
		kosucular.stream().sorted(Comparator.comparingLong(x -> x.getSure())).forEach(System.out::println);

	}
}
