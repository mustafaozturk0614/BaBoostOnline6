package com.bilgeadam.lesson017.otobusuygulamas�;

public class Test {

	public static void main(String[] args) {

		Otobus otobus = new Otobus();

		otobus.kapiSayisi = 3;
		otobus.yolcuKapasitesi = 100;
		otobus.klimaVarmi = true;
		otobus.renk = "k�rm�z�";
		System.out.println(otobus.yolcuSayisi);
		otobus.yolcuAl(5);
		System.out.println(otobus.yolcuSayisi);

		Durak durak1 = new Durak();
		durak1.durakNo = 12256;
		durak1.durak�smi = "Ulus";
		durak1.konum = "Ankara/Ulus";
		durak1.otobusListesi = new Otobus[8];
		Durak durak2 = new Durak();
		durak2.durakNo = 12260;
		durak2.otobusListesi = new Otobus[8];
		durak2.durak�smi = "Ke�i�ren";
		durak2.konum = "Ankara/Ke�i�ren";

		// G�zergah g�zergah = new G�zergah();
		otobus.guzergah = new G�zergah();
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
		durak3.durak�smi = "Yenimahalle";
		durak3.konum = "Ankara/Yenimahalle";

		Durak durak4 = new Durak();
		durak4.otobusListesi = new Otobus[8];
		durak4.durakNo = 12254;
		durak4.durak�smi = "K�z�lay";
		durak4.konum = "Ankara/K�z�lay";

//		Durak[] benimDurakListem = new Durak[3];
//		benimDurakListem[0] = durak3;
//		benimDurakListem[1] = durak1;
//		benimDurakListem[2] = durak4;

		G�zergah g�zergah = new G�zergah();
		g�zergah.hatNo = 114;
//		g�zergah.durakListesi = benimDurakListem;

		g�zergah.durakListesi = new Durak[3];
		g�zergah.durakListesi[0] = durak3;
		g�zergah.durakListesi[1] = durak1;
		g�zergah.durakListesi[2] = durak4;
		System.out.println(otobus2.guzergah);

		otobus2.guzergah = g�zergah;
// her durak i�in bir otobus listesi olusturduktan sonra 1inci duraga od uraktan gecen otobusleri atad�k 
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
