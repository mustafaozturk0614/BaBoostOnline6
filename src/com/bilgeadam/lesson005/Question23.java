package com.bilgeadam.lesson005;

import java.util.Scanner;

//Mükemmel sayý=kendisi hariç pozitif tam bölenlerinin toplamý kendisine eþit
// olan sayý
// 6=1+2+3;
public class Question23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		int toplam = 0;
		for (int i = 1; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (sayi == toplam) {
			System.out.println(sayi + " Mükemmel sayýdýr");
		} else {
			System.out.println(sayi + " Mükemmel sayý deðildir");
		}

	}

}
