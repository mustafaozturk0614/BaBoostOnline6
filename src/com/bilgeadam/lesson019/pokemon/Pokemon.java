package com.bilgeadam.lesson019.pokemon;

public class Pokemon {
	long id;
	String ad;
	String t�r;
	int can;
	int g�c;
	int derece;
	String[] handikap;
	Kullanici kullanici;

	public Pokemon() {
		can = 100;
	}

	public Pokemon(long myId, String pokemonIsmi, String pokemonTuru, int pokemnCani, int pokemonGucu) {
		id = myId;
		ad = pokemonIsmi;
		t�r = pokemonTuru;
		can = pokemnCani;
		g�c = pokemonGucu;
	}

	public void pokedex() {
		System.out.println("PokeDex");
		System.out.println("====================");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("t�r= " + t�r);
		System.out.println("can= " + can);
		System.out.println("g�c= " + g�c);
		System.out.println("derece= " + derece);
		System.out.println("====================");
	}

}
