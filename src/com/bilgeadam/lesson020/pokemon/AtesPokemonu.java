package com.bilgeadam.lesson020.pokemon;

public class AtesPokemonu extends Pokemon {

//	public AtesPokemonu(long id, String ad) {
//		super(id, ad);
//	
//	}

	private int yakicilikG�c�;

	public AtesPokemonu(long id, String ad, String t�r, int can, int g�c, int derece, int yakicilikG�c�) {
		super(id, ad, t�r, can, g�c, derece);
		this.yakicilikG�c� = yakicilikG�c�;

	}

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yakicilik g�c�=" + yakicilikG�c�);
		System.out.println("====================");
	}

	public AtesPokemonu(int yakicilikG�c�) {

		this.yakicilikG�c� = yakicilikG�c�;
	}

	public int getYakicilikG�c�() {
		return yakicilikG�c�;
	}

}
