package com.bilgeadam.lesson019.pokemon;

public class Pokemon {
	long id;
	String ad;
	String tür;
	int can;
	int güc;
	int derece;
	String[] handikap;
	Kullanici kullanici;

	public Pokemon() {
		can = 100;
	}

	public Pokemon(long myId, String pokemonIsmi, String pokemonTuru, int pokemnCani, int pokemonGucu) {
		id = myId;
		ad = pokemonIsmi;
		tür = pokemonTuru;
		can = pokemnCani;
		güc = pokemonGucu;
	}

	public void pokedex() {
		System.out.println("PokeDex");
		System.out.println("====================");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("tür= " + tür);
		System.out.println("can= " + can);
		System.out.println("güc= " + güc);
		System.out.println("derece= " + derece);
		System.out.println("====================");
	}

}
