package com.bilgeadam.lesson014.et�t;

public class Kutuphane {

	static int boyut;
	static int index = 0;
	Kitap[] kitapListesi;
	Yazar[] yazarListesi;
	static int yazarIndex = 0;

	public Yazar yazarKontrol(String yeniIsim) {
		Yazar yeniYazar = new Yazar();
		if (yazarListesi == null) {

			yazarListesi = new Yazar[50];

			yeniYazar.isim = yeniIsim;
			yazarListesi[yazarIndex] = yeniYazar;
			yazarIndex++;

		} else {

			for (int i = 0; i < yazarListesi.length; i++) {
				if (yazarListesi[i] != null) {
					if (!yazarListesi[i].isim.equals(yeniIsim)) {

						yeniYazar.isim = yeniIsim;
						yazarListesi[yazarIndex] = yeniYazar;
						yazarIndex++;

					} else {
						System.out.println("Yazar databse de kay�tl�d�r");
						return yazarListesi[i];

					}

				}

			}
		}
		return yeniYazar;

	}

}
