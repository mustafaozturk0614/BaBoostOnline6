package com.bilgeadam.lesson043.openClosed;

public class Test {

	public static void main(String[] args) {

		ResimBoyutlandýrma resimBoyutlandýrma = new ResimBoyutlandýrma();
		Instagram instagram = new Instagram();
		Facebook facebook = new Facebook();

		resimBoyutlandýrma.boyutlandýrma2(instagram, "png");
		resimBoyutlandýrma.boyutlandýrma2(facebook, "png");
		System.out.println("instagram==>" + instagram.getKucultmeKatsayisi());
		System.out.println("facebook==>" + facebook.getKucultmeKatsayisi());

		////////// open closed yapýsý saglandýktan sonraki test
		System.out.println("////////////////////////////////////////////");
		// polimorfizm
		Instagram sosyalMedya1 = new Instagram();
		SosyalMedya sosyalMedya2 = new Facebook();
		SosyalMedya sosyalMedya3 = new WhatsApp();
		resimBoyutlandýrma.boyutlandýrma3(sosyalMedya1, "png");
		resimBoyutlandýrma.boyutlandýrma3(sosyalMedya2, "png");
		resimBoyutlandýrma.boyutlandýrma3(sosyalMedya3, "png");
		System.out.println("instagram==>" + sosyalMedya1.getKucultmeKatsayisi());
		System.out.println("facebook==>" + sosyalMedya2.getKucultmeKatsayisi());
		System.out.println("whatsapp==>" + sosyalMedya3.getKucultmeKatsayisi());

	}
}
