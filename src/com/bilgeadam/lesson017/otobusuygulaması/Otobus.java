package com.bilgeadam.lesson017.otobusuygulamas�;

public class Otobus {

	public int yolcuKapasitesi;
	public String sofor�smi;
	public double beygir;
	public int koltukSayisi;
	public String marka;
	public double yakitMiktari;
	public int kapiSayisi;
	public boolean klimaVarmi;
	public int vites;
	public String renk;
	public boolean koruklumu;
//	public int hatNo;// g�zergah=>> hat no durak listesi
//	public String[] duraklar;// durak ad� durak no otobuslistesi konum
//	public Durak[] duraklar;	

	public G�zergah guzergah;
	public int yolcuSayisi;

	public void yolcuAl(int yolcular) {

		yolcuSayisi += yolcular;

	}
}
