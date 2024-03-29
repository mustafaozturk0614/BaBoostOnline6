package com.bilgeadam.lesson043.openClosed;

public class Test {

	public static void main(String[] args) {

		ResimBoyutlandırma resimBoyutlandırma = new ResimBoyutlandırma();
		Instagram instagram = new Instagram();
		Facebook facebook = new Facebook();

		resimBoyutlandırma.boyutlandırma2(instagram, "png");
		resimBoyutlandırma.boyutlandırma2(facebook, "png");
		System.out.println("instagram==>" + instagram.getKucultmeKatsayisi());
		System.out.println("facebook==>" + facebook.getKucultmeKatsayisi());

		////////// open closed yapısı saglandıktan sonraki test
		System.out.println("////////////////////////////////////////////");
		// polimorfizm
		Instagram sosyalMedya1 = new Instagram();
		SosyalMedya sosyalMedya2 = new Facebook();
		SosyalMedya sosyalMedya3 = new WhatsApp();
		resimBoyutlandırma.boyutlandırma3(sosyalMedya1, "png");
		resimBoyutlandırma.boyutlandırma3(sosyalMedya2, "png");
		resimBoyutlandırma.boyutlandırma3(sosyalMedya3, "png");
		System.out.println("instagram==>" + sosyalMedya1.getKucultmeKatsayisi());
		System.out.println("facebook==>" + sosyalMedya2.getKucultmeKatsayisi());
		System.out.println("whatsapp==>" + sosyalMedya3.getKucultmeKatsayisi());

	}
}
