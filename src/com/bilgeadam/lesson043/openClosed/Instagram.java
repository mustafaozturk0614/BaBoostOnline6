package com.bilgeadam.lesson043.openClosed;

/*
 * * Open Closed===> Kodlarýmýz geliþtirmeye acýk degistirmeye 
 * kapalý olsun var olan modelleri degiþtirmek yerine geliþtirmeliyiz
 * 
 * 1-Resim boyutlandýrma sýnýfýna bir metot yazacagýz bu metot bizden bir insatagramý alacak 
 * bir String type lacak eðer jpg ise kücültme katsayisi 38 png 30 olsun 
 * 
 *2- Yeni bir sosyal medya uygulamasý daha eklendi ve facbookun jpg kucultme katsayýsý 34
 * png 37 olsun diðer 45
 *3- Yeni bir sosyal medya uygulamsý daha ekledik Whats app bunun jpg =>>28 png 32 ,diðerleri 36
 *
 *sorunumuz her sosyal medya eklandýgýnde Resým boyutlandýrma daki boyutlandýrma2 metoduna 
 *yeni if else ler eklemk zorunda kalýyoruz bunu gidermek ne yapabiliriz
 *
 *(cozum: Sosyal medya clasýnda bir abstract metoto olusturduk boyutlandýrma adýnda 
 *ve her sýnýf kendi ozelinde boutlandýrma degerlerini setledi ve daha sonra 
 *Resim boyutlandýrma sýnýfýnda ki boyutlandýrma metodunda Sosyal medya abstrac sýnýfý uzerinden 
 *kalýtým yapýsý ile beraber abstarac metoto cagýrýldý ve test sýnýfýnda da 3 farklý sýnýf
 *olusturularak bu tek metot ile çalýþtýrýldý daha sonra bir sosyal medyaya daha ihtiyaç duyarsak 
 *Resim boyutlandýrma sýnýfndaki boyutlandrma metodunu degiþtirmeden kullabilecek bir hala getirmiþ olduk) 
 *
 *
 */
public class Instagram extends SosyalMedya {

	@Override
	public void boyutlandirma(String type) {
		if (type.equals("jpg")) {
			setKucultmeKatsayisi(38.0);
		} else if (type.equals("png")) {
			setKucultmeKatsayisi(30.0);
		} else {
			setKucultmeKatsayisi(40);
		}
	}

}
