package com.bilgeadam.lesson026.footballapp;

import java.util.Random;

public class Defans extends AktifFutbolcu {

	private int pozisyonAlma;
	private int kafa;
	private int sicrama;

	public Defans(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.pozisyonAlma = rastgeleYetenekPuan�Ata();
		this.kafa = rastgeleYetenekPuan�Ata();
		this.sicrama = rastgeleYetenekPuan�Ata();
	}

	@Override
	public int rastgeleYetenekPuan�Ata() {
		Random random = new Random();
		return random.nextInt(60, 91);
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

	@Override
	public String toString() {
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama + ", getAdSoyad()="
				+ getAdSoyad() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + "]";
	}

	@Override
	public int pasSkor() {
		Random random = new Random();
		/*
		 * Bonus= 0 ile 4 aras�nda rastgele bir say�d�r
		 * pas*0.2+yetenek*0.2+dayaniklilik*0.1+dogalForm*0.1+pozisyonAlma*0.1+sans*0.2+
		 * bonus
		 */
		int bonus = random.nextInt(4);

		return (int) (getPas() * 0.2 + getYetenek() * 0.2 + getDayaniklilik() * 0.1 + getDogalForm() * 0.1
				+ pozisyonAlma * 0.1 + getSans() * 0.2 + bonus);
	}

	@Override
	public int golSkor(int kurtaris) {
		/*
		 * 
		 * Defans oyuncusu i�in bonus bir puan hesab� daha yap�l�r Bonus= 2 ile 5
		 * aras�nda rastgele bir say� * dogalForm*0.075 Kurtar��=kar�� tak�m
		 * kalecisinden gelen kurtar�� skor de�eri.
		 * yetenek*0.3+sut*0.2+kararlilik*0.1+sans*0.1+kafa*0.1+sicrama*0.1+dogalForm*0.
		 * 1+bonus-kurtar��
		 * 
		 * 
		 */
		Random random = new Random();
		double bonus = (random.nextDouble(2, 5) * getDogalForm() * 0.075);

		return (int) (getYetenek() * 0.3 + getSut() * 0.2 + getKararlilik() * 0.2 + getSans() * 0.1 + kafa * 0.1
				+ sicrama * 0.1 + getDogalForm() * 0.1 + bonus - kurtaris);
	}

}
