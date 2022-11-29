package com.bilgeadam.lesson017;

public class Profile {
//ststic havuzunda Profile.id

//sýnýfýmýzýn özelliði 
	static int id = 5;

// nesne özelliklerimiz(sýnýfýmýzda olusturduðumuz fakat nesneler tarafýndan kullanýlan özellikler)
	// nesne özelliklerine yeni bir nesene yaratarark ulaþabilirz
	String profilResmi;
	String[] posts = new String[10];
	int postSayisis = posts.length;
	String username;
	String isim;
	int takipciSayisi;
	int takipSayiysi;

	// metotlar
	public void postOlustur() {

		System.out.println("Post oluþtu");
	}

	public void profiliDüzenle() {

		System.out.println("Profil Düzenlendi");
	}
}
