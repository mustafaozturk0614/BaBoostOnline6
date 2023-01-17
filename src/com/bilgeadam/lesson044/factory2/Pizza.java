package com.bilgeadam.lesson044.factory2;

/*
 * 
 * Boy
 * fiyat�
 * malzemeleri
 * t�r (Ad)
 * Hamur tipi;
 * 
 * 
 * 2 tane Alt s�n�f olustural�m Biri Vejeteryan Pizza
 * -EtliPizza olsun daha sonra bir pizzafactory olusturcag�z 
 * -pizza sec metodunda yapt�g�m�z secimlere gore factory s�n�f�ndan bize bir pizza donecek
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
