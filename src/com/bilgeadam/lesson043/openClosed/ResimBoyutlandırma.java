package com.bilgeadam.lesson043.openClosed;

public class ResimBoyutlandırma {
	// 1.adımda sadece instagram var onun kucultme katsayısnı belirliyoruz
	public void boyutlandırma(Instagram instagram, String type) {
		if (type.equals("jpg")) {
			instagram.setKucultmeKatsayisi(38.0);
		} else if (type.equals("png")) {
			instagram.setKucultmeKatsayisi(30.0);
		} else {
			instagram.setKucultmeKatsayisi(40);
		}
	}

	// 2.adımda facebook da eklendi onunda kücütlme katsayıyı belirlenecek
	public void boyutlandırma2(SosyalMedya sosyalMedya, String type) {

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

	public void boyutlandırma3(SosyalMedya sosyalMedya, String type) {
		sosyalMedya.boyutlandirma(type);
	}

}
