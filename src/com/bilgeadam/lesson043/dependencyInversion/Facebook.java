package com.bilgeadam.lesson043.dependencyInversion;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

public class Facebook extends SosyalMedya implements IEmailSendable, IPostable, IStroy {

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

	@Override
	public void postGonder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sohbetEt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resimPaylas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emailGonder(Kullanici kullanici) {
		if (kullanici.getEmail() != null) {
			Bildirim.emailGonder(kullanici.getEmail());
		}
	}

	@Override
	public void hikayePaylas() {
		// TODO Auto-generated method stub

	}

}
