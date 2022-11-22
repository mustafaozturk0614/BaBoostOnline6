package com.bilgeadam.lesson013;

/*
 * 
 * bir isimleri birde numaralarý
 * 
 * öðrenci numaralarý 1 den baþlasýn yeni öðrenci kaytý oldukça numaralarým artsýn 
 * 
 */
public class Student {

	String ad;
	static int numara;

	public void kayit() {
		numara += 1;
		System.out.println(ad + " adlý öðrenci " + numara + " nosu ile kayýt olmuþtur");
	}

}
