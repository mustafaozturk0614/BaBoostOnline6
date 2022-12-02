package com.bilgeadam.lesson020.pokemon;

public class Test {

	public static void main(String[] args) {

		Pokemon pokemon = new Pokemon();
		pokemon.setDerece(3);
		pokemon.setId(1);
		pokemon.setGüc(220);
		pokemon.setTür("Ates");

		pokemon.pokedex();

		AtesPokemonu atesPokemonu = new AtesPokemonu(2, "charmander", "Ates", 120, 200, 2, 50);
		atesPokemonu.pokedex();
		SuPokemonu suPokemonu = new SuPokemonu(3, "squrtile", "Su", 200, 200, 2, 100, 78);
		suPokemonu.pokedex();
		// atesPokemonu.setAd("charmander");
//		atesPokemonu.setDerece(2);
//		pokemon.setId(2);
//		atesPokemonu.setCan(80);
//		pokemon.setGüc(120);
//		pokemon.setTür("Ates");

		// 1.yöntem
		// String[] array = { "Su", "Hava" };
		// atesPokemonu.setHandikap(array)
		// 2.yöntem;
//		String[] array = new String[2];
//		array[0] = "Su";
//		array[1] = "Hava";
//		atesPokemonu.setHandikap(array);
		// 3.yöntem
//		atesPokemonu.handikap = new String[2];
//		atesPokemonu.setHandikap(array);
//		atesPokemonu.getHandikap()[0] = "Su";
//		atesPokemonu.getHandikap()[1] = "Hava";
//		atesPokemonu.pokedex();
//		System.out.println(atesPokemonu.getHandikap()[1]);
//		System.out.println(atesPokemonu.getYakicilikGücü());

		// Pokemon pokemon2 = new Pokemon(3, "pikachu", "Elektrik", 150, 300);
//		pokemon2.pokedex();
//

	}

}
