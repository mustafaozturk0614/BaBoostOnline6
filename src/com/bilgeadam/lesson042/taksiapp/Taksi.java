package com.bilgeadam.lesson042.taksiapp;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * Taksilerimizin her biri bir thread olacak
 * 
 * taksilerde -> id ,musterisay�s�,musterilerin idsinin tutuldugu bir liste ,bekleme suresi
 * 
 * bekleme suresini random long bir deger olustural�m 1000-5000 aras�nda olsun 
 * 
 * durag�m�zda taksilerimiz olsun 
 * durag�m�zda bir musteri kuyrugumuz olacak  bu kutukda musterilermizin id si tutualacak 
 * kuyrugumuzda 100 tane musteri olsun 
 * durag�m�zda da 10 tane taksimiz olsun 
 * 
 * 
 * kuyrugumuz bosalana kadar taksilerimiz s�ra ile kuyrgumuzdan musterileri als�n 
 * 
 * kuyrukdan ald�g� musteri nosunu kendi i�inde tutugu listeye eklsein 
 * 1.nolu taksi  5.musterisni ald� ---> musteri idsi--->8 
 * daha sonra taksimiz bekleme suresi kadar bekleyip dongumuze devam etsin 
 * dongumuz sona erd�g�ndede 
 * 1 nolu taksi toplamda ->20 musteri ald� ve mesaisi sona erdi 
 *  2 nolu taksi toplamda ->30 musteri ald� ve mesaisi sona erdi 
 * 
 * 
 * 
 */
public class Taksi implements Runnable {

	int id;
	List<Integer> musteriNolar;
	long beklemeZaman�;

	public Taksi(int id) {
		this.id = id;
		this.musteriNolar = new LinkedList<>();
		Random random = new Random();
		// beklemeZaman� = random.nextLong(4001) + 1000;
		beklemeZaman� = random.nextLong(1000, 5001);
	}

	@Override
	public void run() {

		while (!Durak.musteriKuyrugu.isEmpty()) {
			int musteriId = Durak.musteriKuyrugu.poll();
			musteriNolar.add(musteriId);
			System.out.println(this.id + ". Taksi " + musteriNolar.size() + ". musterisini ald� ---> musteri idsi--->"
					+ musteriId);
			try {
				Thread.sleep(this.beklemeZaman�);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 1 nolu taksi toplamda ->20 musteri ald� ve mesaisi sona erdi
		System.out.println(this.id + " li taksi toplamda" + musteriNolar.size() + " musteri ald� ve mesaisi sona erdi");

	}

}
