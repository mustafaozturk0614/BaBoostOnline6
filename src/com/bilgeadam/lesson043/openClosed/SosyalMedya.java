package com.bilgeadam.lesson043.openClosed;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

public abstract class SosyalMedya {

	private double kucultmeKatsayisi;

	public double getKucultmeKatsayisi() {
		return kucultmeKatsayisi;
	}

	public void setKucultmeKatsayisi(double kucultmeKatsayisi) {
		this.kucultmeKatsayisi = kucultmeKatsayisi;
	}

	public void smsGonder(Kullanici kullanici) {
		if (kullanici.getPhone() != null) {
			Bildirim.smsGonder(kullanici.getPhone());
		}
	}

	public void emailGonder(Kullanici kullanici) {
		if (kullanici.getEmail() != null) {
			Bildirim.emailGonder(kullanici.getEmail());
		}
	}

	public abstract void boyutlandirma(String type);
}
