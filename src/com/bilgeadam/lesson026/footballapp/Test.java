package com.bilgeadam.lesson026.footballapp;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//		Takim takim = new Takim("Ev Sahibi");
//		System.out.println(takim.getKaleci());
//		for (AktifFutbolcu futbolcu : takim.getFutbolcular()) {
//			System.out.println(futbolcu.pasVer());
//		}

		Takim takim1 = new Takim("Ev sahibi");
		Takim takim2 = new Takim("Deplasman");
		List<Takim> takimlar = new ArrayList<>();
		takimlar.add(takim1);
		takimlar.add(takim2);
//
		Mac mac = new Mac(60000, takimlar);
//
		mac.mac();

//		System.out.println(System.currentTimeMillis());

//		Takim takim = mac.takimDegistir2(mac.takimlar.get(0));
//
//		System.out.println(takim.getAd());
//
//		System.out.println(mac.takimDegistir2(takim).getAd());

	}

}
