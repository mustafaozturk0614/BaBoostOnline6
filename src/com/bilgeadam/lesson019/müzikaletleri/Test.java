package com.bilgeadam.lesson019.m�zikaletleri;

public class Test {

	public static void main(String[] args) {

		M�zikAleti m�zikAleti = new M�zikAleti("T�rkiye", "2020", "Zil", "Vurmal�", 2);
		m�zikAleti.bilgileriGoster();
		m�zikAleti.cal();
		TelliMuzikAletleri gitar = new TelliMuzikAletleri();
		gitar.ad = "Gitar";
		gitar.men�ei = "Amerika";
		gitar.tur = "Telli Calg�";
		gitar.uretimTarihi = "1956";
		gitar.telSayisi = 6;
		gitar.bilgileriGoster();
		System.out.println("tel sayisi= " + gitar.telSayisi);
		gitar.cal();
		gitar.telleriDegistir();

		Bateri bateri = new Bateri();
		bateri.ad = "Bateri";
		bateri.yuzeyGenisli�i = 20;
	}

}
