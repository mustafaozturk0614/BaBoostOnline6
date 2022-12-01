package com.bilgeadam.lesson019.müzikaletleri;

public class MüzikAleti {

	String menþei;
	String uretimTarihi;
	String ad;
	String tur;
	double boyut;

	public void cal() {
		System.out.println(ad + " Çalýnýyor");
	}

	public MüzikAleti() {

	}

	public MüzikAleti(String Mmensei, String MuretimTarihi, String Mad, String Mtur, double Mboyut) {
		menþei = Mmensei;
		uretimTarihi = MuretimTarihi;
		ad = Mad;
		tur = Mtur;
		boyut = Mboyut;
	}

	public void bilgileriGoster() {
		System.out.println("ad= " + ad);
		System.out.println("mensei= " + menþei);
		System.out.println("üretim tarihi= " + uretimTarihi);
		System.out.println("tur= " + tur);
		System.out.println("boyut= " + boyut);
		System.out.println("//////////////////////");
	}

}
