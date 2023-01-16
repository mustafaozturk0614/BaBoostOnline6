package com.bilgeadam.lesson043.singleReponsibility;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

public class SosyalMedya {

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
}
