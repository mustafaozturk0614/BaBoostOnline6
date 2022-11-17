package com.bilgeadam.lesson009;

import java.util.Scanner;

public class Question46 {
	/*
	 * Dýþarýdan kaç sayý alacaðýmýzý alalým 2,3
	 * 
	 * eðer iki gelirse topla() içinde iki deðerimizi alýp toplayalým
	 * 
	 * eðer 3 gelirsede bu metodu overload þeklinde yazlým aldýðýmýz 3 deðeri metoda
	 * geçelim
	 * 
	 * 
	 * main dýþarýdan kaç asyý alcaðýmýzý belirliyoruz o sayýlara göre koþullarýmýzý
	 * belirleyip okuþllarda yukarýda yazdýðýmýz 2 metoddan birini çaðýracaðýz
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sayi adedi giriniz");
		int sayiAdedi = scanner.nextInt();

		if (sayiAdedi == 2) {

			System.out.println(topla());

		} else if (sayiAdedi == 3) {
			System.out.println("Lütfen 1.sayýyý giriniz");
			int sayi1 = scanner.nextInt();
			System.out.println("Lütfen 2.sayýyý giriniz");
			int sayi2 = scanner.nextInt();
			System.out.println("Lütfen 3.sayýyý giriniz");
			int sayi3 = scanner.nextInt();
			System.out.println(topla(sayi1, sayi2, sayi3));

		}

	}

	public static int topla(int sayi1, int sayi2, int sayi3) {
		int toplam = sayi1 + sayi2 + sayi3;
		return toplam;
	}

	public static int topla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1.sayýyý giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("Lütfen 2.sayýyý giriniz");
		int sayi2 = scanner.nextInt();

		return sayi1 + sayi2;
	}

}
