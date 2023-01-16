package com.bilgeadam.lesson043.openClosed;

public class ResimBoyutlandýrma {
	// 1.adýmda sadece instagram var onun kucultme katsayýsný belirliyoruz
	public void boyutlandýrma(Instagram instagram, String type) {
		if (type.equals("jpg")) {
			instagram.setKucultmeKatsayisi(38.0);
		} else if (type.equals("png")) {
			instagram.setKucultmeKatsayisi(30.0);
		} else {
			instagram.setKucultmeKatsayisi(40);
		}
	}

	// 2.adýmda facebook da eklendi onunda kücütlme katsayýyý belirlenecek
	public void boyutlandýrma2(SosyalMedya sosyalMedya, String type) {

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

	public void boyutlandýrma3(SosyalMedya sosyalMedya, String type) {
		sosyalMedya.boyutlandirma(type);
	}

}
