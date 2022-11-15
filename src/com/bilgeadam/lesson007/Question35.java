package com.bilgeadam.lesson007;

// bir dizide ard arda gelen 2 indexdeki sayý deðeri 2 ise true yazdýrýp döngü
// sonlansýn yoksa false yazdýralým 
public class Question35 {

	public static void main(String[] args) {
		int[] sayilar = { 2, -256, 2, 1258, 2, 2 };
		boolean kontrol = false;
		for (int i = 0; i < sayilar.length - 1; i++) {

			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {

				kontrol = true;
				break;
			}
		}
		System.out.println(kontrol);
		kontrol = false;
		for (int i = 1; i < sayilar.length; i++) {

			if (sayilar[i] == 2 && sayilar[i - 1] == 2) {

				kontrol = true;
				break;
			}
		}
		System.out.println(kontrol);
	}
}
