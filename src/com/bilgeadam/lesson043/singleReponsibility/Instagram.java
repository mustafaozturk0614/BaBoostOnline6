package com.bilgeadam.lesson043.singleReponsibility;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

/*
 * Single Responsibilty==> Bir nesne veya bir metotun tek bir gorevi olmas� laz�m 
 * 
 */
public class Instagram extends SosyalMedya {

	/*
	 * Metodumuz kullan�c�n�n emaili varsa email telefonu varsa smsm bildirimi
	 * yap�yor 2 side varsa hem sms hem email bildirimi yap�yor fakat bu yap� single
	 * responsibilitye uymuyor o yuzden 1.ad�mda bu metodu iptal edip ayr� ayr�
	 * metotlar yazacag�z // 2 . ad�mda 2 farkl� metot olusturduk // daha sonra
	 * bunlar� bir ana s�n�fta toplad�k
	 *
	 *
	 */

	public void bildirimGonder(Kullanici kullanici) {

		if (kullanici.getEmail() != null) {

			Bildirim.emailGonder(kullanici.getEmail());
		}

		if (kullanici.getPhone() != null) {
			Bildirim.smsGonder(kullanici.getPhone());
		}

	}

	// 2 . ad�mda 2 farkl� metot olusturduk
	// daha sonra bunlar� bir ana s�n�fta toplad�k
//	public void smsGonder(Kullanici kullanici) {
//		if (kullanici.getPhone() != null) {
//			Bildirim.smsGonder(kullanici.getPhone());
//		}
//	}
//
//	public void emailGonder(Kullanici kullanici) {
//		if (kullanici.getEmail() != null) {
//
//			Bildirim.emailGonder(kullanici.getEmail());
//		}
//
//	}

}
