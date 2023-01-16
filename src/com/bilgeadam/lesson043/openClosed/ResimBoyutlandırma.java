package com.bilgeadam.lesson043.openClosed;

public class ResimBoyutland�rma {
	// 1.ad�mda sadece instagram var onun kucultme katsay�sn� belirliyoruz
	public void boyutland�rma(Instagram instagram, String type) {
		if (type.equals("jpg")) {
			instagram.setKucultmeKatsayisi(38.0);
		} else if (type.equals("png")) {
			instagram.setKucultmeKatsayisi(30.0);
		} else {
			instagram.setKucultmeKatsayisi(40);
		}
	}

	// 2.ad�mda facebook da eklendi onunda k�c�tlme katsay�y� belirlenecek
	public void boyutland�rma2(SosyalMedya sosyalMedya, String type) {

		if (sosyalMedya instanceof Instagram) {
			if (type.equals("jpg")) {
				sosyalMedya.setKucultmeKatsayisi(38.0);
			} else if (type.equals("png")) {
				sosyalMedya.setKucultmeKatsayisi(30.0);
			} else {
				sosyalMedya.setKucultmeKatsayisi(40);
			}
		} else if (sosyalMedya instanceof Facebook) {
			if (type.equals("jpg")) {
				sosyalMedya.setKucultmeKatsayisi(34.0);
			} else if (type.equals("png")) {
				sosyalMedya.setKucultmeKatsayisi(37.0);
			} else {
				sosyalMedya.setKucultmeKatsayisi(45);
			}
		}

	}

	public void boyutland�rma3(SosyalMedya sosyalMedya, String type) {
		sosyalMedya.boyutlandirma(type);
	}

}
