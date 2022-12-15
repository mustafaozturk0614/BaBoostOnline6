package com.bilgeadam.lesson028.menuodevcozum;

public class Menu {

	private EYemek yemek;
	private ECorba corba;
	private EIcecekler icecek;
	private ETatli tatli;

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(EYemek yemek, ECorba corba, EIcecekler icecek, ETatli tatli) {
		super();
		this.yemek = yemek;
		this.corba = corba;
		this.icecek = icecek;
		this.tatli = tatli;
	}

	public EYemek getYemek() {
		return yemek;
	}

	public ECorba getCorba() {
		return corba;
	}

	public EIcecekler getIcecek() {
		return icecek;
	}

	public ETatli getTatli() {
		return tatli;
	}

	public void setYemek(EYemek yemek) {
		this.yemek = yemek;
	}

	public void setCorba(ECorba corba) {
		this.corba = corba;
	}

	public void setIcecek(EIcecekler icecek) {
		this.icecek = icecek;
	}

	public void setTatli(ETatli tatli) {
		this.tatli = tatli;
	}

	@Override
	public String toString() {
		return "Menu [yemek=" + yemek + ", corba=" + corba + ", icecek=" + icecek + ", tatli=" + tatli + "]";
	}

}
