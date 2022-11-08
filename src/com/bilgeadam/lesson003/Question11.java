package com.bilgeadam.lesson003;

/**
 * 
 * 1 den baþlayarak sayýlarý toplayalým toplamýmýz 50 den buyuk olana kadar
 * programýmýz çalýsýn; sonunda toplamý ve kaç kere çalýþdýðýný yazdýralým
 * 
 *
 *
 */
public class Question11 {

	public static void main(String[] args) {

		int toplam = 0;
		int i = 1;
		int sayac = 0;

		while (toplam <= 50) {
			toplam += i;
			sayac = i;
			i++;
			System.out.println("Toplam=>" + toplam + "-Dögü=>" + sayac);
		}
	}

}
