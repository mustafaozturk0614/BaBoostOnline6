package com.bilgeadam.lesson028.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Hastane {

	Queue<Hasta> hastalar = new PriorityQueue<>();

	public static void main(String[] args) {
		Hastane hastane = new Hastane();
		hastane.hastalar.offer(new Hasta("Mustafa", ESikayet.APANDISIT));
		hastane.hastalar.offer(new Hasta("Oguz", ESikayet.BASAGRISI));
		hastane.hastalar.offer(new Hasta("Oznur", ESikayet.COVID));
		hastane.hastalar.offer(new Hasta("Kemal", ESikayet.APANDISIT));
		hastane.hastalar.offer(new Hasta("Ayse", ESikayet.YANIK));
		hastane.hastalar.offer(new Hasta("Zeliha", ESikayet.YANIK));
		hastane.hastalar.offer(new Hasta("Okan", ESikayet.APANDISIT));
		hastane.hastalar.offer(new Hasta("Orhan", ESikayet.YANIK));
		hastane.hastalar.offer(new Hasta("MErve", ESikayet.BASAGRISI));
		hastane.hastalar.offer(new Hasta("Burhan", ESikayet.COVID));
		hastane.hastalar.offer(new Hasta("gizem", ESikayet.YANIK));

		while (!hastane.hastalar.isEmpty()) {
			System.out.println("****************************");
			System.out.println(hastane.hastalar.poll());
			System.out.println("****************************");
		}

	}
}
