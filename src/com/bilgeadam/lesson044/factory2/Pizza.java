package com.bilgeadam.lesson044.factory2;

/*
 * 
 * Boy
 * fiyatý
 * malzemeleri
 * tür (Ad)
 * Hamur tipi;
 * 
 * 
 * 2 tane Alt sýnýf olusturalým Biri Vejeteryan Pizza
 * -EtliPizza olsun daha sonra bir pizzafactory olusturcagýz 
 * -pizza sec metodunda yaptýgýmýz secimlere gore factory sýnýfýndan bize bir pizza donecek
 * 
 * 
 */
public abstract class Pizza {

	ETur tur;
	EBoyut boyut;
	EHamurTipi hamurTipi;
	double fiyat;
	String[] malzemleri;

	public Pizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		super();
		this.tur = tur;
		this.boyut = boyut;
		this.hamurTipi = hamurTipi;
	}

	@Override
	public String toString() {
		return "Pizza [tur=" + tur + ", boyut=" + boyut + ", hamurTipi=" + hamurTipi + ", fiyat=" + fiyat + "]";
	}

}
