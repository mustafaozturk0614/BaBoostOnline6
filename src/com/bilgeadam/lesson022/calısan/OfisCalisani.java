package com.bilgeadam.lesson022.calýsan;

public class OfisCalisani extends Calisan {

	public OfisCalisani(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(8000);
		setUnvan(getMaas());
	}

	public OfisCalisani(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		setUnvan(maas);
	}

	@Override
	public void setUnvan(double maas) {
		if (maas >= 12000) {
			setUnvan("Kýdemli Calýsan");
		} else if (maas >= 8000) {
			setUnvan("Çalýþan");
		} else {
			setUnvan("Stajyer");
		}
	}

}
