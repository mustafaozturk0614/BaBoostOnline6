package com.bilgeadam.lesson002;

public class Question2 {
	/*
	 * Bir ürünün fiyatında %18 kdv %15 kar olduğunu biliyoruz
	 * 
	 * bir urun fiyatımız olsun elimizde
	 * 
	 * bu urun fiyatından ürünün ham fiyatını bulalım ( karsız ve kdvsiz fiyatı)
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		float rawPrice = 0, price = 100, priceWithoutVat;
		priceWithoutVat = price / 1.18f;
		System.out.println("kdvsiz fiyat:" + priceWithoutVat);
		rawPrice = priceWithoutVat / 1.15f;
		System.out.println("ham fiyat:" + rawPrice);

	}

}
