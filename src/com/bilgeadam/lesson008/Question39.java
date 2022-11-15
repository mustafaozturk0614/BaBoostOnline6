package com.bilgeadam.lesson008;

public class Question39 {
	public static void main(String[] args) {

		String sehirler = "01-Adana;02-Adýyaman;03-Afyonkarahisar;04-Aðrý;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydýn;10-Balýkesir;42-Konya";

		String[] array = sehirler.split(";");

		for (int i = 0; i < array.length; i++) {
			int index = array[i].indexOf("-");
			System.out.println(array[i].substring(index + 1) + "nýn plaka kodu= " + array[i].substring(0, index));

		}
//
//		System.out.println("Ankara".indexOf("x"));

	}
}
