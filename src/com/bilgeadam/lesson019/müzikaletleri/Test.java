package com.bilgeadam.lesson019.müzikaletleri;

public class Test {

	public static void main(String[] args) {

		MüzikAleti müzikAleti = new MüzikAleti("Türkiye", "2020", "Zil", "Vurmalý", 2);
		müzikAleti.bilgileriGoster();
		müzikAleti.cal();
		TelliMuzikAletleri gitar = new TelliMuzikAletleri();
		gitar.ad = "Gitar";
		gitar.menþei = "Amerika";
		gitar.tur = "Telli Calgý";
		gitar.uretimTarihi = "1956";
		gitar.telSayisi = 6;
		gitar.bilgileriGoster();
		System.out.println("tel sayisi= " + gitar.telSayisi);
		gitar.cal();
		gitar.telleriDegistir();

		Bateri bateri = new Bateri();
		bateri.ad = "Bateri";
		bateri.yuzeyGenisliði = 20;
	}

}
