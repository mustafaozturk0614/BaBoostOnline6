package com.bilgeadam.lesson042.yuzemetreyarýs;
/*
 * Kosucu bir thread olacak
 * kosucunun=> ismi, mesafe,sure
 * 
 * ismi ile bir kosucu olusturabilecegiz
 * 
 * 
 * thread için bir metot yazacagýz 
 * bu metodda her kosucu 100 metreye kadar kosacak 
 * ve dongu her çalýþtýgýnda 1 metre mesefa alacak 
 * her dongu arasýnda 200 milisaniye beklesin metodumuz
 * ve her 10 metrede bir bilgilendirme mesajý yazdýralým 
 *  mustafa --> 10.metrede 
 *  mustafa --> 20.metrede 
 *  metodun sonundada 
 *  mustafa adlý kosusucu 100 metreyi 20000 milisaniyede kostu
 * 
 * 
 * -YuzMetreYarýsý clasýnda 5 tane kosucu olustrup thread leri çalýstýralým 
 * 
 * 
 */

public class Kosucu implements Runnable {

	public String getIsim() {
		return isim;
	}

	public int getMesafe() {
		return mesafe;
	}

	public long getSure() {
		return sure;
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setMesafe(int mesafe) {
		this.mesafe = mesafe;
	}

	public void setSure(long sure) {
		this.sure = sure;
	}

	public void setBaslangicZamani(long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

	String isim;
	int mesafe;
	long sure;
	long baslangicZamani;

	public Kosucu(String isim, long baslangicZamani) {
		super();
		this.isim = isim;
		this.mesafe = 0;
		this.baslangicZamani = baslangicZamani;

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
		long bitisZamaný = System.currentTimeMillis();
		this.sure = bitisZamaný - baslangicZamani;
		System.out.println(isim + " adlý kosucu 100 metreyi <" + sure + "> milisaniyede koþmusutur");

	}

	@Override
	public String toString() {
		return "Kosucu [isim=" + isim + ", mesafe=" + mesafe + ", sure=" + sure + ", baslangicZamani=" + baslangicZamani
				+ "]";
	}

}
