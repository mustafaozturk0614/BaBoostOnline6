package com.bilgeadam.lesson019.m�zikaletleri;

public class M�zikAleti {

	String men�ei;
	String uretimTarihi;
	String ad;
	String tur;
	double boyut;

	public void cal() {
		System.out.println(ad + " �al�n�yor");
	}

	public M�zikAleti() {

	}

	public M�zikAleti(String Mmensei, String MuretimTarihi, String Mad, String Mtur, double Mboyut) {
		men�ei = Mmensei;
		uretimTarihi = MuretimTarihi;
		ad = Mad;
		tur = Mtur;
		boyut = Mboyut;
	}

	public void bilgileriGoster() {
		System.out.println("ad= " + ad);
		System.out.println("mensei= " + men�ei);
		System.out.println("�retim tarihi= " + uretimTarihi);
		System.out.println("tur= " + tur);
		System.out.println("boyut= " + boyut);
		System.out.println("//////////////////////");
	}

}
