package com.bilgeadam.lesson042.taksiapp;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * Taksilerimizin her biri bir thread olacak
 * 
 * taksilerde -> id ,musterisayýsý,musterilerin idsinin tutuldugu bir liste ,bekleme suresi
 * 
 * bekleme suresini random long bir deger olusturalým 1000-5000 arasýnda olsun 
 * 
 * duragýmýzda taksilerimiz olsun 
 * duragýmýzda bir musteri kuyrugumuz olacak  bu kutukda musterilermizin id si tutualacak 
 * kuyrugumuzda 100 tane musteri olsun 
 * duragýmýzda da 10 tane taksimiz olsun 
 * 
 * 
 * kuyrugumuz bosalana kadar taksilerimiz sýra ile kuyrgumuzdan musterileri alsýn 
 * 
 * kuyrukdan aldýgý musteri nosunu kendi içinde tutugu listeye eklsein 
 * 1.nolu taksi  5.musterisni aldý ---> musteri idsi--->8 
 * daha sonra taksimiz bekleme suresi kadar bekleyip dongumuze devam etsin 
 * dongumuz sona erdýgýndede 
 * 1 nolu taksi toplamda ->20 musteri aldý ve mesaisi sona erdi 
 *  2 nolu taksi toplamda ->30 musteri aldý ve mesaisi sona erdi 
 * 
 * 
 * 
 */
public class Taksi implements Runnable {

	int id;
	List<Integer> musteriNolar;
	long beklemeZamaný;

	public Taksi(int id) {
		this.id = id;
		this.musteriNolar = new LinkedList<>();
		Random random = new Random();
		// beklemeZamaný = random.nextLong(4001) + 1000;
		beklemeZamaný = random.nextLong(1000, 5001);
	}

	@Override
	public void run() {

		while (!Durak.musteriKuyrugu.isEmpty()) {
			int musteriId = Durak.musteriKuyrugu.poll();
			musteriNolar.add(musteriId);
			System.out.println(this.id + ". Taksi " + musteriNolar.size() + ". musterisini aldý ---> musteri idsi--->"
					+ musteriId);
			try {
				Thread.sleep(this.beklemeZamaný);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 1 nolu taksi toplamda ->20 musteri aldý ve mesaisi sona erdi
		System.out.println(this.id + " li taksi toplamda" + musteriNolar.size() + " musteri aldý ve mesaisi sona erdi");

	}

}
