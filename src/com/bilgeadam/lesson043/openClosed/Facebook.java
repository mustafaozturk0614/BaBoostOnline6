package com.bilgeadam.lesson043.openClosed;

public class Facebook extends SosyalMedya {

	@Override
	public void boyutlandirma(String type) {
		if (type.equals("jpg")) {
			setKucultmeKatsayisi(34.0);
		} else if (type.equals("png")) {
			setKucultmeKatsayisi(37.0);
		} else {
			setKucultmeKatsayisi(45);
		}
	}

}
