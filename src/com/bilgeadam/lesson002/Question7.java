package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * D��ar�dan  2 tane say�sal de�er alal�m  iki say�n�n toplam�
 * �ift ise true yazd�ralm de�ilse false yazd�ral�m 
 * en sonrada toplam�n yar�s�n�da ekra yazd�ral�m
 * 
 */
public class Question7 {

	public static void main(String[] args) {

		int sayi1, sayi2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen Bir say� giriniz");
		sayi1 = scanner.nextInt();
		System.out.println("L�tfen Bir say� giriniz");
		sayi2 = scanner.nextInt();
		int toplam = sayi1 + sayi2;
		boolean kontrol = toplam % 2 == 0;
		System.out.println("say�lar�m�z�n toplam� �iftmi : " + kontrol);
		// float toplam�nYar�s� = toplam / 2f;
		System.out.println(toplam / 2f);

	}

}
