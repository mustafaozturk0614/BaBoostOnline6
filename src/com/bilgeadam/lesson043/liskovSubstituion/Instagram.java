package com.bilgeadam.lesson043.liskovSubstituion;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

/*
 * liskov substituion===> Bir s�n�f inherit edildi�i s�n�f gibi davaranmal�d�r. 
 * 
 * 1-Bizim Email ve Sms gonderme metotlar�m�z var sonra bir gun 
 * Facebook dedi ki ben art�k sms gondermeyi desteklemiyorum burdaki sorun nedir
 * bu sorunu nas�l ��zeriz
 * 
 * 
 * 2- Whatsappp sadece video konferans yapabiliyor,sohbet edilebilir,resimpaylas,hikaye paylas
 * facebook -> post atabilir,resim payla�abilir,sohbet edilebilir,hikaye paylas
 * instagram-> post atabilir,resim payla�abilir,sohbet edilebilir,hikaye paylas
 * burda sosyal medyada bu metotlar� abstrac olarak yazm�st�k �imdi burdaki 
 * sorunu bulup nas�l ��zece�imize dair kodlamalar� yapal�m 
 * 
 * 
 */
public class Instagram extends SosyalMedya implements IEmailSendable, ISmsSenadable, IPostable {

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
