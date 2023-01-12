package com.bilgeadam.lesson042.yuzemetreyar�s;
/*
 * Kosucu bir thread olacak
 * kosucunun=> ismi, mesafe,sure
 * 
 * ismi ile bir kosucu olusturabilecegiz
 * 
 * 
 * thread i�in bir metot yazacag�z 
 * bu metodda her kosucu 100 metreye kadar kosacak 
 * ve dongu her �al��t�g�nda 1 metre mesefa alacak 
 * her dongu aras�nda 200 milisaniye beklesin metodumuz
 * ve her 10 metrede bir bilgilendirme mesaj� yazd�ral�m 
 *  mustafa --> 10.metrede 
 *  mustafa --> 20.metrede 
 *  metodun sonundada 
 *  mustafa adl� kosusucu 100 metreyi 20000 milisaniyede kostu
 * 
 * 
 * -YuzMetreYar�s� clas�nda 5 tane kosucu olustrup thread leri �al�st�ral�m 
 * 
 * 
 */

import java.util.Queue;

public class Kosucu implements Runnable {

	String isim;
	int mesafe;
	long sure;
	long baslangicZamani;
	Queue<Kosucu> kosucular;

	public Kosucu(String isim, long baslangicZamani, Queue<Kosucu> kosucular) {
		super();
		this.isim = isim;
		this.mesafe = 0;
		this.baslangicZamani = baslangicZamani;
		this.kosucular = kosucular;
	}

	@Override
	public void run() {

		while (mesafe < 100) {
			mesafe++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (mesafe % 10 == 0) {
				System.out.println(isim + "-->" + mesafe + ".metrede");
			}
		}
		long bitisZaman� = System.currentTimeMillis();
		this.sure = bitisZaman� - baslangicZamani;
		System.out.println(isim + " adl� kosucu 100 metreyi <" + sure + "> milisaniyede ko�musutur");
		kosucular.offer(this);

	}

	@Override
	public String toString() {
		return "Kosucu [isim=" + isim + ", mesafe=" + mesafe + ", sure=" + sure + ", baslangicZamani=" + baslangicZamani
				+ "]";
	}

}
