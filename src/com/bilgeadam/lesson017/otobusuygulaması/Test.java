package com.bilgeadam.lesson017.otobusuygulamasý;

public class Test {

	public static void main(String[] args) {

		Otobus otobus = new Otobus();

		otobus.kapiSayisi = 3;
		otobus.yolcuKapasitesi = 100;
		otobus.klimaVarmi = true;
		otobus.renk = "kýrmýzý";
		System.out.println(otobus.yolcuSayisi);
		otobus.yolcuAl(5);
		System.out.println(otobus.yolcuSayisi);

		Durak durak1 = new Durak();
		durak1.durakNo = 12256;
		durak1.durakÝsmi = "Ulus";
		durak1.konum = "Ankara/Ulus";
		durak1.otobusListesi = new Otobus[8];
		Durak durak2 = new Durak();
		durak2.durakNo = 12260;
		durak2.otobusListesi = new Otobus[8];
		durak2.durakÝsmi = "Keçiören";
		durak2.konum = "Ankara/Keçiören";

		// Güzergah güzergah = new Güzergah();
		otobus.guzergah = new Güzergah();
		otobus.guzergah.durakListesi = new Durak[2];
		otobus.guzergah.durakListesi[0] = durak1;
		otobus.guzergah.durakListesi[1] = durak2;
		otobus.guzergah.hatNo = 420;
//--------------------------------------------------------------------------
		Otobus otobus2 = new Otobus();
		otobus2.yolcuKapasitesi = 140;
		otobus2.kapiSayisi = 5;
		otobus2.koruklumu = true;

		Durak durak3 = new Durak();
		durak3.otobusListesi = new Otobus[8];
		durak3.durakNo = 13560;
		durak3.durakÝsmi = "Yenimahalle";
		durak3.konum = "Ankara/Yenimahalle";

		Durak durak4 = new Durak();
		durak4.otobusListesi = new Otobus[8];
		durak4.durakNo = 12254;
		durak4.durakÝsmi = "Kýzýlay";
		durak4.konum = "Ankara/Kýzýlay";

//		Durak[] benimDurakListem = new Durak[3];
//		benimDurakListem[0] = durak3;
//		benimDurakListem[1] = durak1;
//		benimDurakListem[2] = durak4;

		Güzergah güzergah = new Güzergah();
		güzergah.hatNo = 114;
//		güzergah.durakListesi = benimDurakListem;

		güzergah.durakListesi = new Durak[3];
		güzergah.durakListesi[0] = durak3;
		güzergah.durakListesi[1] = durak1;
		güzergah.durakListesi[2] = durak4;
		System.out.println(otobus2.guzergah);

		otobus2.guzergah = güzergah;
// her durak için bir otobus listesi olusturduktan sonra 1inci duraga od uraktan gecen otobusleri atadýk 
		durak1.otobusListesi[0] = otobus;
		durak1.otobusListesi[1] = otobus2;

		System.out.println(otobus2.guzergah);

		System.out.println("Otobus 1in durak listesi");
		for (int i = 0; i < otobus.guzergah.durakListesi.length; i++) {
			System.out.print(otobus.guzergah.durakListesi[i].durakNo + ", ");

		}
		System.out.println();
		System.out.println("Otobus 2nin durak listesi");
		for (int i = 0; i < otobus2.guzergah.durakListesi.length; i++) {
			System.out.print(otobus2.guzergah.durakListesi[i].durakNo + ", ");

		}
		System.out.println();
		for (int i = 0; i < durak1.otobusListesi.length; i++) {
				if(durak1.otobusListesi[i]!=null) {
					System.out.println(durak1.otobusListesi[i].yolcuKapasitesi);
				}
			

		}

	}

}
