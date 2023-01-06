package com.bilgeadam.lesson038;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * 
 * 1-bir yuk yeri secme metodumuz olsun 
 * bu metot limandaki yukler aray�ndan bir yer belirlesin kendine
 * eger s�n�r d�s� ise hataya� yakalay�m ve gosterelim 
 * 2- Kendi exception s�n�fm�z� yaratal�m  () LimanAppException 
 * daha sonra se�ti�imiz indexdeki yer null de�ilse hata f�rlatacag�z 
 * se�ti�iniz yer dolu ;
 * 
 * 3-ag�rl�k belirle()==> liman�m�z 100 kilo alt� yukleri kabul etmiyor 
 * yukumuz bu kurala uymuyorsa bir exception f�rlatal�m
 * 
 * 4-liman�m�z cuma gunleri kabul yapm�yor bunun i�in metot yazacag�z
 * kabultarhihikontrol==> 
 * cuma gunu olup olmad�g�n� kontrol edip bir exception f�rlatacag�z
 * 
 * 5-y�kolustur metodunu yazal�m bir yuk olusturken asag�daki kontrolleri yapal�m 
 * kontrollerden ge�iyorsa yukumuzu ekleyelim 
 * 
 */
public class Uygulama {

	Liman liman;
	static Scanner scanner = new Scanner(System.in);

	public Uygulama() {
		super();
		this.liman = new Liman();
	}

	public void yukyeriSec() {
		System.out.println("L�tfen bir y�k yeri se�iniz");
		int index = scanner.nextInt();
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("L�tfen s�n�rlar dahilinde bir yer se�iniz");
		}
	}

	public int yukyeriSec2() {
		liman.getYukler()[0] = new Yuk("1", 100, LocalDate.now());

		int index = Utility.intDegerAlma("L�tfen bir y�k yeri se�iniz");
		if (index < 0 || index >= liman.getYukler().length) {
//			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA,
//					"l�tfen 0 ile " + liman.getYukler().length + " aras�nda bir se�im yap�n�z");
//			
			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);

		} else if (liman.getYukler()[index] != null) {
			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
		}

		return index;

	}

	public double kantar() {

		double yuk = Utility.doubleDegerAlma("L�tfen bir ag�rl�k giriniz");

		if (yuk < 100) {
			throw new LimanAppException(ErrorType.YETERSIZ_AGIRLIK);
		}
		return yuk;

	}

	public LocalDate kabulTarihiKontrol() {

		LocalDate date = Utility.stringTarihAlma();

		if (date.isBefore(LocalDate.now())) {
			throw new LimanAppException(ErrorType.GECERSIZ_KABUL_TARIHI);
		}

		if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			throw new LimanAppException(ErrorType.MESAI_GUNLERI_DISI);
		}
		return date;
	}

	public void yukOlustur() {
		Yuk yuk = null;
		int index = 0;
		try {
			index = yukyeriSec2();
			LocalDate date = kabulTarihiKontrol();
			double agirlik = kantar();
			String isim = Utility.stringDegerAlma("L�tfen yukunuzun ismini giriniz");
			yuk = new Yuk(isim, agirlik, date);
			liman.getYukler()[index] = yuk;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (yuk == null) {
				System.out.println("Yukunuz kabul olmam�st�r");
			} else {
				System.out.println("Yukunuz kabul olmustur" + index + "nolu yere yerle�mi�tir");

			}

		}

	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.yukOlustur();
//		try {
//			uygulama.yukyeriSec2();
//			uygulama.kantar();
//			uygulama.kabulTarihiKontrol();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

	}

}
