package com.bilgeadam.lesson043.openClosed;

public class WhatsApp extends SosyalMedya {

	@Override
	public void boyutlandirma(String type) {
		if (type.equals("jpg")) {
			setKucultmeKatsayisi(28.0);
		} else if (type.equals("png")) {
			setKucultmeKatsayisi(32.0);
		} else {
			setKucultmeKatsayisi(36);
		}
	}

}
