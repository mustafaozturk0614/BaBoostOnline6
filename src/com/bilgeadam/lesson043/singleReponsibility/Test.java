package com.bilgeadam.lesson043.singleReponsibility;

import com.bilgeadam.lesson043.utility.Kullanici;

public class Test {

	public static void main(String[] args) {

		Facebook facebook = new Facebook();

		Instagram ýnstagram = new Instagram();

		Kullanici kullanici = new Kullanici("Mustafa", "mustafa@gmail.com");

		facebook.emailGonder(kullanici);
		ýnstagram.emailGonder(kullanici);

	}
}
