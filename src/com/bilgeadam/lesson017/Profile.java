package com.bilgeadam.lesson017;

public class Profile {
//ststic havuzunda Profile.id

//s�n�f�m�z�n �zelli�i 
	static int id = 5;

// nesne �zelliklerimiz(s�n�f�m�zda olusturdu�umuz fakat nesneler taraf�ndan kullan�lan �zellikler)
	// nesne �zelliklerine yeni bir nesene yaratarark ula�abilirz
	String profilResmi;
	String[] posts = new String[10];
	int postSayisis = posts.length;
	String username;
	String isim;
	int takipciSayisi;
	int takipSayiysi;

	// metotlar
	public void postOlustur() {

		System.out.println("Post olu�tu");
	}

	public void profiliD�zenle() {

		System.out.println("Profil D�zenlendi");
	}
}
