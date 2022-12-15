package com.bilgeadam.lesson028.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * String bir kuyruk tan�ml�yacag�z 
 * 
 * bu kuyruga 10-12 tane isim ekleyece�iz 
 * 
 * 
 * random 1-10 aras� say� ureteceg�z  buda bizim pide say�m�z olucak
 * 
 * kuruga gore pideleri dag�tacag�z  pide bitti�inde pide bitti yazal�m 
 * birde pide alamayanlar� yazd�ral�m 
 * 
 * 
 * 
 * 
 */
public class RamazanPidesiKuyrugu {

	Queue<String> kuyruk = new LinkedList<>();

	public RamazanPidesiKuyrugu() {

		kuyrukOlustur();
	}

	public static void main(String[] args) throws InterruptedException {
		RamazanPidesiKuyrugu ramazanPidesiKuyrugu = new RamazanPidesiKuyrugu();
		ramazanPidesiKuyrugu.pideDag�t();
		ramazanPidesiKuyrugu.geriyeKalanlar();

	}

	public void kuyrukOlustur() {
		kuyruk.offer("Ahmet");
		kuyruk.offer("Murat");
		kuyruk.offer("Hasan");
		kuyruk.offer("Ozan");
		kuyruk.offer("Zeliha");
		kuyruk.offer("S�meyye");
		kuyruk.offer("Ezgi");
		kuyruk.offer("Gizem");
		kuyruk.offer("Oguz");
		kuyruk.offer("Attilla");
		kuyruk.offer("Mustafa");

	}

	public void pideDag�t() throws InterruptedException {
		Random random = new Random();
		int pideSayisi = random.nextInt(10) + 1;
		System.out.println("Pideler C�k�yor");
		System.out.println("Pide say�s�= " + pideSayisi);
		Thread.sleep(2000);

		for (int i = 0; i < pideSayisi; i++) {
			if (!kuyruk.isEmpty()) {
				System.out.println(kuyruk.poll() + " pidesini ald�");
			}
		}

	}

	public void geriyeKalanlar() {
		if (kuyruk.isEmpty()) {
			System.out.println("Pidesini almayan musteri kalmad�");

		} else {
			System.out.println("Pide bitti pide alamayanlar:");
			kuyruk.forEach(System.out::println);
		}

	}

}
