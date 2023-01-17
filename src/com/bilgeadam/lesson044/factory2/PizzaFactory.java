package com.bilgeadam.lesson044.factory2;

public class PizzaFactory {
	/*
	 * 1-.etliPizza 2-vejeteryan pizza
	 * 
	 */
	public static Pizza pizzaOlustur(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		switch (tur) {
		case TONBALIKLI, KARISIK:
			return new EtliPizza(tur, boyut, hamurTipi);
		case AKDENÝZ:
			return new VejeteryanPizza(tur, boyut, hamurTipi);
		default:
			throw new RuntimeException("hatalý giriþ");
		}
	}

}
