package com.bilgeadam.lesson002;

public class Question3 {
	/**
	 * Türk lirası amount alalım onu dolara çevirelim
	 * 
	 */
	public static void main(String[] args) {

		double tl, dolarKuru, sonuc;
		tl = 100;
		dolarKuru = 18.62;
		sonuc = tl / dolarKuru;
		System.out.println(tl + "TL: " + sonuc + " dolar");

	}

}
