package com.bilgeadam.lesson028.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * String bir kuyruk tanýmlýyacagýz 
 * 
 * bu kuyruga 10-12 tane isim ekleyeceðiz 
 * 
 * 
 * random 1-10 arasý sayý uretecegýz  buda bizim pide sayýmýz olucak
 * 
 * kuruga gore pideleri dagýtacagýz  pide bittiðinde pide bitti yazalým 
 * birde pide alamayanlarý yazdýralým 
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
		ramazanPidesiKuyrugu.pideDagýt();
		ramazanPidesiKuyrugu.geriyeKalanlar();

	}

	public void kuyrukOlustur() {
		kuyruk.offer("Ahmet");
		kuyruk.offer("Murat");
		kuyruk.offer("Hasan");
		kuyruk.offer("Ozan");
		kuyruk.offer("Zeliha");
		kuyruk.offer("Sümeyye");
		kuyruk.offer("Ezgi");
		kuyruk.offer("Gizem");
		kuyruk.offer("Oguz");
		kuyruk.offer("Attilla");
		kuyruk.offer("Mustafa");

	}

	public void pideDagýt() throws InterruptedException {
		Random random = new Random();
		int pideSayisi = random.nextInt(10) + 1;
		System.out.println("Pideler Cýkýyor");
		System.out.println("Pide sayýsý= " + pideSayisi);
		Thread.sleep(2000);

		for (int i = 0; i < pideSayisi; i++) {
			if (!kuyruk.isEmpty()) {
				System.out.println(kuyruk.poll() + " pidesini aldý");
			}
		}

	}

	public void geriyeKalanlar() {
		if (kuyruk.isEmpty()) {
			System.out.println("Pidesini almayan musteri kalmadý");

		} else {
			System.out.println("Pide bitti pide alamayanlar:");
			kuyruk.forEach(System.out::println);
		}

	}

}
