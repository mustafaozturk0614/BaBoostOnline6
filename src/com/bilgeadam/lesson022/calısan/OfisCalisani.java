package com.bilgeadam.lesson022.cal�san;

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
			setUnvan("K�demli Cal�san");
		} else if (maas >= 8000) {
			setUnvan("�al��an");
		} else {
			setUnvan("Stajyer");
		}
	}

}
