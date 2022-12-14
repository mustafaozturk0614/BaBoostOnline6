package com.bilgeadam.lesson027;

import java.util.Stack;

public class ParaSayma {

	/*
	 * bir stack olusturacagýz bu stacke e 5 6 tane deger ekleyeceðiz
	 * 
	 * 100 tlden yuksek olanlarý toplam degerýne ekleyelim kucuk olanlarýda baþka
	 * bir stack e ekleyelim en sonundada toplamý ve yeni olusturdugumuz stacki
	 * yazdýralým
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Stack<Integer> paralar = new Stack<>();
		int toplam = 0;
		Stack<Integer> yuztldenKucukparalar = new Stack<>();
		paralar.push(120);
		paralar.push(12);
		paralar.push(250);
		paralar.push(180);
		paralar.push(80);
		paralar.push(10);
		paralar.push(1);
		paralar.push(1);

		// System.out.println(paralar.push(3));
		// System.out.println(paralar.add(3));

		while (!paralar.isEmpty()) {
			// int sayi = paralar.pop();
			if (paralar.peek() > 100) {
				toplam += paralar.pop();
			} else {
				yuztldenKucukparalar.add(paralar.pop());
			}
		}

		System.out.println("toplam= " + toplam);

		yuztldenKucukparalar.forEach(System.out::println);
	}
}
