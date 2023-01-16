package com.bilgeadam.lesson043.openClosed;

public class Test {

	public static void main(String[] args) {

		ResimBoyutland�rma resimBoyutland�rma = new ResimBoyutland�rma();
		Instagram instagram = new Instagram();
		Facebook facebook = new Facebook();

		resimBoyutland�rma.boyutland�rma2(instagram, "png");
		resimBoyutland�rma.boyutland�rma2(facebook, "png");
		System.out.println("instagram==>" + instagram.getKucultmeKatsayisi());
		System.out.println("facebook==>" + facebook.getKucultmeKatsayisi());

		////////// open closed yap�s� sagland�ktan sonraki test
		System.out.println("////////////////////////////////////////////");
		// polimorfizm
		Instagram sosyalMedya1 = new Instagram();
		SosyalMedya sosyalMedya2 = new Facebook();
		SosyalMedya sosyalMedya3 = new WhatsApp();
		resimBoyutland�rma.boyutland�rma3(sosyalMedya1, "png");
		resimBoyutland�rma.boyutland�rma3(sosyalMedya2, "png");
		resimBoyutland�rma.boyutland�rma3(sosyalMedya3, "png");
		System.out.println("instagram==>" + sosyalMedya1.getKucultmeKatsayisi());
		System.out.println("facebook==>" + sosyalMedya2.getKucultmeKatsayisi());
		System.out.println("whatsapp==>" + sosyalMedya3.getKucultmeKatsayisi());

	}
}
