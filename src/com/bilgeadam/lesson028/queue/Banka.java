package com.bilgeadam.lesson028.queue;
/*
 * 
 * 
 * M��teri kuyrugumuz olacak 
 * bu musteri kuyrugna musteri ekleyece�zi sonrada
 * musterilieri s�rayla i�leme alacag�z 65 yas ustu �ncelikli olsun 
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

	public void kuyruguYazd�r() {

		while (!musteriler.isEmpty()) {
			System.out.println(musteriler.poll());
		}

	}

	public static void main(String[] args) {

		Banka banka = new Banka();
		banka.kuyruguYazd�r();

	}

}
