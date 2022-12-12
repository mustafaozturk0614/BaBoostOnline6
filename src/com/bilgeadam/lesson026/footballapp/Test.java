package com.bilgeadam.lesson026.footballapp;

public class Test {

	public static void main(String[] args) {

		Takim takim = new Takim("Ev Sahibi");
		System.out.println(takim.getKaleci());
		for (AktifFutbolcu futbolcu : takim.getFutbolcular()) {
			System.out.println(futbolcu.pasVer());
		}

	}

}
