package com.bilgeadam.lesson017.otobusuygulamasý;

public class Otobus {

	public int yolcuKapasitesi;
	public String soforÝsmi;
	public double beygir;
	public int koltukSayisi;
	public String marka;
	public double yakitMiktari;
	public int kapiSayisi;
	public boolean klimaVarmi;
	public int vites;
	public String renk;
	public boolean koruklumu;
//	public int hatNo;// güzergah=>> hat no durak listesi
//	public String[] duraklar;// durak adý durak no otobuslistesi konum
//	public Durak[] duraklar;	

	public Güzergah guzergah;
	public int yolcuSayisi;

	public void yolcuAl(int yolcular) {

		yolcuSayisi += yolcular;

	}
}
