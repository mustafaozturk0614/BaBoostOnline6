package com.bilgeadam.lesson013;

/*
 * 
 * bir isimleri birde numaralar�
 * 
 * ��renci numaralar� 1 den ba�las�n yeni ��renci kayt� olduk�a numaralar�m arts�n 
 * 
 */
public class Student {

	String ad;
	static int numara;

	public void kayit() {
		numara += 1;
		System.out.println(ad + " adl� ��renci " + numara + " nosu ile kay�t olmu�tur");
	}

}
