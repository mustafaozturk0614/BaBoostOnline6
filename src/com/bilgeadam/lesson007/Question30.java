package com.bilgeadam.lesson007;

import java.util.Scanner;

/*
 * 
 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH yerine 
 * Ki 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200201…
 * 
 * 
 * 
 * 
 * 
 */

public class Question30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen bir Iban giriniz");
		String iban = scanner.nextLine();
		if (iban.startsWith("TR")) {
//			System.out.println("Yurt içi İşlemler");
//			if (iban.endsWith("5001")) {
//				System.out.println("Ziraat Bankası");
//			} else if (iban.endsWith("5002")) {
//
//				System.out.println("Garanti Bankası");
//			} else if (iban.endsWith("5003")) {
//				System.out.println("İş Bankası");
//			} else {
//				System.out.println("Diğer");
//			}

			String bankaKodu = iban.substring(iban.length() - 4);

			switch (bankaKodu) {
			case "5001":
				System.out.println("Ziraat Bankası");
				break;
			case "5002":
				System.out.println("Garanti Bankası");
				break;

			case "5003":
				System.out.println("İş Bankası");
				break;
			default:
				System.out.println("Diğer");
				break;
			}

		} else if (iban.startsWith("OTH")) {
			System.out.println("Yurt Dışı işlemler");
			if (iban.endsWith("2000")) {
				System.out.println("Kıta içi işlemler");
				System.out.println(iban.replace("OTH", "Kİ"));
			} else {
				System.out.println("Kıta dışı işlemler");
				System.out.println(iban.replace("OTH", "KD"));

			}

		} else {
			System.out.println("Yanlış Iban Girdiniz");
		}
	}

}
