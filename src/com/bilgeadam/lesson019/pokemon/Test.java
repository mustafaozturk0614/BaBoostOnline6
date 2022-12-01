package com.bilgeadam.lesson019.pokemon;

public class Test {

	public static void main(String[] args) {

		Pokemon pokemon = new Pokemon();
		pokemon.derece = 3;
		pokemon.id = 1;
		pokemon.güc = 220;
		pokemon.tür = "Ates";
		pokemon.pokedex();

		AtesPokemonu atesPokemonu = new AtesPokemonu();
		atesPokemonu.ad = "charmander";
		atesPokemonu.derece = 2;
		atesPokemonu.id = 2;
		atesPokemonu.can = 80;
		atesPokemonu.güc = 120;
		atesPokemonu.tür = "Ates";
		atesPokemonu.yakicilikGücü = 50;
		atesPokemonu.handikap = new String[2];
		atesPokemonu.handikap[0] = "Su";
		atesPokemonu.handikap[1] = "Hava";
		atesPokemonu.pokedex();

		Pokemon pokemon2 = new Pokemon(3, "pikachu", "Elektrik", 150, 300);
		pokemon2.pokedex();

		SuPokemonu suPokemonu = new SuPokemonu();

	}

}
