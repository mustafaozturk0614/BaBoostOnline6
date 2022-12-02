package com.bilgeadam.lesson020.pokemon;

public class AtesPokemonu extends Pokemon {

//	public AtesPokemonu(long id, String ad) {
//		super(id, ad);
//	
//	}

	private int yakicilikGücü;

	public AtesPokemonu(long id, String ad, String tür, int can, int güc, int derece, int yakicilikGücü) {
		super(id, ad, tür, can, güc, derece);
		this.yakicilikGücü = yakicilikGücü;

	}

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yakicilik gücü=" + yakicilikGücü);
		System.out.println("====================");
	}

	public AtesPokemonu(int yakicilikGücü) {

		this.yakicilikGücü = yakicilikGücü;
	}

	public int getYakicilikGücü() {
		return yakicilikGücü;
	}

}
