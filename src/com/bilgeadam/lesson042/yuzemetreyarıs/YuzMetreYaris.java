package com.bilgeadam.lesson042.yuzemetreyarýs;

import java.util.LinkedList;
import java.util.Queue;

public class YuzMetreYaris {

	public static void main(String[] args) {

		Queue<Kosucu> kosucular = new LinkedList<>();
		long baslangýcZamani = System.currentTimeMillis();

		Kosucu kosucu1 = new Kosucu("Mustafa", baslangýcZamani, kosucular);
		Kosucu kosucu2 = new Kosucu("Mert", baslangýcZamani, kosucular);
		Kosucu kosucu3 = new Kosucu("Berkin", baslangýcZamani, kosucular);
		Kosucu kosucu4 = new Kosucu("Arda", baslangýcZamani, kosucular);
		Kosucu kosucu5 = new Kosucu("Murat", baslangýcZamani, kosucular);

		Thread thread1 = new Thread(new Kosucu("Mustafa", baslangýcZamani, kosucular));
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
			System.out.println("=====Yüz metre Koþu sonuçlarý =====");
			thread1.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (!kosucular.isEmpty()) {
			System.out.println(kosucular.poll());
		}

	}
}
