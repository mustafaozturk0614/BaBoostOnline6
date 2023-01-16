package com.bilgeadam.lesson043.interfacesgragation;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

public class WhatsApp extends SosyalMedya implements IEmailSendable, ISmsSenadable, IVideoCallable, IStroy {

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

	@Override
	public void sohbetEt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resimPaylas() {
		// TODO Auto-generated method stub

	}

	@Override
	public void smsGonder(Kullanici kullanici) {
		if (kullanici.getPhone() != null) {
			Bildirim.smsGonder(kullanici.getPhone());
		}
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

	@Override
	public void videoKonferans() {

	}

}
