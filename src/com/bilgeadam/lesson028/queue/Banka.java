package com.bilgeadam.lesson028.queue;
/*
 * 
 * 
 * Müþteri kuyrugumuz olacak 
 * bu musteri kuyrugna musteri ekleyeceðzi sonrada
 * musterilieri sýrayla iþleme alacagýz 65 yas ustu öncelikli olsun 
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class Banka {

	Queue<Musteri> musteriler = new PriorityQueue<>();

	public Banka() {
		musteriEkle();
	}

	public void musteriEkle() {

		musteriler.offer(new Musteri("Mustafa", 35, 1));
		musteriler.offer(new Musteri("Kemal", 67, 2));
		musteriler.offer(new Musteri("Okan", 70, 3));
		musteriler.offer(new Musteri("Gizem", 24, 4));
		musteriler.offer(new Musteri("Zeliha", 65, 5));
		musteriler.offer(new Musteri("Ali", 14, 6));
		musteriler.offer(new Musteri("Merve", 10, 7));
		musteriler.offer(new Musteri("Merve", 1, 8));

	}

	public void kuyruguYazdýr() {

		while (!musteriler.isEmpty()) {
			System.out.println(musteriler.poll());
		}

	}

	public static void main(String[] args) {

		Banka banka = new Banka();
		banka.kuyruguYazdýr();

	}

}
