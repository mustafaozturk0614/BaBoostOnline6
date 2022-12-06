package com.bilgeadam.lesson022.cal�san;

public class Muhendis extends Calisan implements IHarcOdeme {

	public Muhendis(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(10000);
		// setUnvan(getMaas());
		setUnvan("Muhendis");
		setBonus(250);

	}

	public Muhendis(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		setUnvan(maas);
		setBonus(250);
	}

	@Override
	public void setUnvan(double maas) {
		if (maas >= 17000) {
			setUnvan("Uzman M�hendis ");
		} else if (maas >= 12000) {

			setUnvan("K�demli M�hendis");
		} else if (maas >= 10000) {
			setUnvan("Muhendis");
		} else {
			setUnvan("Stajyer");
		}
	}

	@Override
	public void harcOde() {
		// TODO Auto-generated method stub

	}

}
