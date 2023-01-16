package com.bilgeadam.lesson043.liskovSubstituion;

public abstract class SosyalMedya implements ISocialMedia {

	private double kucultmeKatsayisi;

	public double getKucultmeKatsayisi() {
		return kucultmeKatsayisi;
	}

	public void setKucultmeKatsayisi(double kucultmeKatsayisi) {
		this.kucultmeKatsayisi = kucultmeKatsayisi;
	}

//	public void smsGonder(Kullanici kullanici) {
//		if (kullanici.getPhone() != null) {
//			Bildirim.smsGonder(kullanici.getPhone());
//		}
//	}
//
//	public void emailGonder(Kullanici kullanici) {
//		if (kullanici.getEmail() != null) {
//			Bildirim.emailGonder(kullanici.getEmail());
//		}
//	}

	public abstract void boyutlandirma(String type);

//	public abstract void postGonder();
//
//	public abstract void sohbetEt();
//
//	public abstract void resimPaylas();
//
//	public abstract void videKonferansYap();

}
