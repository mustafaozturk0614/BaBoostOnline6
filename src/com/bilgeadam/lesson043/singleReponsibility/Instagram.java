package com.bilgeadam.lesson043.singleReponsibility;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

/*
 * Single Responsibilty==> Bir nesne veya bir metotun tek bir gorevi olmasý lazým 
 * 
 */
public class Instagram extends SosyalMedya {

	/*
	 * Metodumuz kullanýcýnýn emaili varsa email telefonu varsa smsm bildirimi
	 * yapýyor 2 side varsa hem sms hem email bildirimi yapýyor fakat bu yapý single
	 * responsibilitye uymuyor o yuzden 1.adýmda bu metodu iptal edip ayrý ayrý
	 * metotlar yazacagýz // 2 . adýmda 2 farklý metot olusturduk // daha sonra
	 * bunlarý bir ana sýnýfta topladýk
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

	// 2 . adýmda 2 farklý metot olusturduk
	// daha sonra bunlarý bir ana sýnýfta topladýk
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
