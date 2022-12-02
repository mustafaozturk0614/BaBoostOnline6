package com.bilgeadam.lesson020.pokemon;

public class SuPokemonu extends Pokemon {

	int suBasincGucu;
	int yuzmeHizi;

	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("suBasincGucu=" + suBasincGucu);
		System.out.println("yuzmeHizi=" + yuzmeHizi);
		System.out.println("====================");
	}

	public SuPokemonu(long id, String ad, String tür, int can, int güc, int derece, int suBasincGucu, int yuzmeHizi) {
		super(id, ad, tür, can, güc, derece);
		this.suBasincGucu = suBasincGucu;
		this.yuzmeHizi = yuzmeHizi;

	}

	public SuPokemonu(long id, String ad) {
		super(id, ad);

	}

}
