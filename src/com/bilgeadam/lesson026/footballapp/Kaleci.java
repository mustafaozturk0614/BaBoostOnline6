package com.bilgeadam.lesson026.footballapp;

import java.util.Random;

public class Kaleci extends Futbolcu {

	private int kurtaris;

	public Kaleci(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.kurtaris = rastgeleYetenekPuan�Ata();
	}

	@Override
	public int rastgeleYetenekPuan�Ata() {
		Random random = new Random();
		return random.nextInt(65, 101);
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	@Override
	public String toString() {
		return "Kaleci [kurtaris=" + kurtaris + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	public int kurtarisSkor() {
		/*
		 * Bonus= 1 ile 5 aras�nda rastgele say� *(dogalForm*0.025) Skor=
		 * kurtar�s*0.2+kararlilik*0.1)+bonu
		 * 
		 */

		Random random = new Random();

		double bonus = random.nextDouble(1, 5) * getDogalForm() * 0.025;

		return (int) (kurtaris * 0.2 + getKararlilik() * 0.1 + bonus);
	}

}
