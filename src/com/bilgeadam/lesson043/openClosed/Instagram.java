package com.bilgeadam.lesson043.openClosed;

/*
 * * Open Closed===> Kodlar�m�z geli�tirmeye ac�k degistirmeye 
 * kapal� olsun var olan modelleri degi�tirmek yerine geli�tirmeliyiz
 * 
 * 1-Resim boyutland�rma s�n�f�na bir metot yazacag�z bu metot bizden bir insatagram� alacak 
 * bir String type lacak e�er jpg ise k�c�ltme katsayisi 38 png 30 olsun 
 * 
 *2- Yeni bir sosyal medya uygulamas� daha eklendi ve facbookun jpg kucultme katsay�s� 34
 * png 37 olsun di�er 45
 *3- Yeni bir sosyal medya uygulams� daha ekledik Whats app bunun jpg =>>28 png 32 ,di�erleri 36
 *
 *sorunumuz her sosyal medya ekland�g�nde Res�m boyutland�rma daki boyutland�rma2 metoduna 
 *yeni if else ler eklemk zorunda kal�yoruz bunu gidermek ne yapabiliriz
 *
 *(cozum: Sosyal medya clas�nda bir abstract metoto olusturduk boyutland�rma ad�nda 
 *ve her s�n�f kendi ozelinde boutland�rma degerlerini setledi ve daha sonra 
 *Resim boyutland�rma s�n�f�nda ki boyutland�rma metodunda Sosyal medya abstrac s�n�f� uzerinden 
 *kal�t�m yap�s� ile beraber abstarac metoto cag�r�ld� ve test s�n�f�nda da 3 farkl� s�n�f
 *olusturularak bu tek metot ile �al��t�r�ld� daha sonra bir sosyal medyaya daha ihtiya� duyarsak 
 *Resim boyutland�rma s�n�fndaki boyutlandrma metodunu degi�tirmeden kullabilecek bir hala getirmi� olduk) 
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
