package com.bilgeadam.lesson017;

public class OopTekrar {

	public static void main(String[] args) {
		// class(sýnýf) ve obje(nesne)

		// sýnýflarýmýzý olustururken

		Profile myProfile = new Profile();
		myProfile.username = "mustafa";
		myProfile.postOlustur();
		System.out.println(myProfile.username + "-" + myProfile.postSayisis);

		Profile myProfile2 = new Profile();
		myProfile2.username = "Burhan";
		System.out.println(myProfile2.username + "-" + myProfile2.postSayisis);
	}

}
