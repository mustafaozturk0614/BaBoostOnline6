package com.bilgeadam.lesson024.enumornek;

/*
 * 
 * Boy
 * fiyat�
 * malzemeleri
 * t�r (Ad)
 * Hamur tipi;
 * 
 * 
 */
public class Pizza {

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
