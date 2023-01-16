package com.bilgeadam.lesson043.interfacesgragation;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

/*
 *  * i --> interface Segregation -->  Sorumluluklarýn hepsini tek bir ara yuze!!!! yuklemeyelim !!!!!-> 
 * 
 * twitter hikaye paylaþma özelliðini desteklemiyor o yuzden bir hata meydana geliyor bunu nasýl çözeriz
 */
public class Instagram extends SosyalMedya implements IEmailSendable, ISmsSenadable, IPostable, IStroy {

	@Override
	public void boyutlandirma(String type) {
		if (type.equals("jpg")) {
			setKucultmeKatsayisi(38.0);
		} else if (type.equals("png")) {
			setKucultmeKatsayisi(30.0);
		} else {
			setKucultmeKatsayisi(40);
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

}
