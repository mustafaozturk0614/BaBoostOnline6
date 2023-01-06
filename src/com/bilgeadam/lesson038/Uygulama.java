package com.bilgeadam.lesson038;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * 
 * 1-bir yuk yeri secme metodumuz olsun 
 * bu metot limandaki yukler arayýndan bir yer belirlesin kendine
 * eger sýnýr dýsý ise hatayaý yakalayým ve gosterelim 
 * 2- Kendi exception sýnýfmýzý yaratalým  () LimanAppException 
 * daha sonra seçtiðimiz indexdeki yer null deðilse hata fýrlatacagýz 
 * seçtiðiniz yer dolu ;
 * 
 * 3-agýrlýk belirle()==> limanýmýz 100 kilo altý yukleri kabul etmiyor 
 * yukumuz bu kurala uymuyorsa bir exception fýrlatalým
 * 
 * 4-limanýmýz cuma gunleri kabul yapmýyor bunun için metot yazacagýz
 * kabultarhihikontrol==> 
 * cuma gunu olup olmadýgýný kontrol edip bir exception fýrlatacagýz
 * 
 * 5-yükolustur metodunu yazalým bir yuk olusturken asagýdaki kontrolleri yapalým 
 * kontrollerden geçiyorsa yukumuzu ekleyelim 
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
		System.out.println("Lütfen bir yük yeri seçiniz");
		int index = scanner.nextInt();
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lütfen sýnýrlar dahilinde bir yer seçiniz");
		}
	}

	public int yukyeriSec2() {
		liman.getYukler()[0] = new Yuk("1", 100, LocalDate.now());

		int index = Utility.intDegerAlma("Lütfen bir yük yeri seçiniz");
		if (index < 0 || index >= liman.getYukler().length) {
//			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA,
//					"lütfen 0 ile " + liman.getYukler().length + " arasýnda bir seçim yapýnýz");
//			
			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);

		} else if (liman.getYukler()[index] != null) {
			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
		}

		return index;

	}

	public double kantar() {

		double yuk = Utility.doubleDegerAlma("Lütfen bir agýrlýk giriniz");

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
			String isim = Utility.stringDegerAlma("Lütfen yukunuzun ismini giriniz");
			yuk = new Yuk(isim, agirlik, date);
			liman.getYukler()[index] = yuk;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (yuk == null) {
				System.out.println("Yukunuz kabul olmamýstýr");
			} else {
				System.out.println("Yukunuz kabul olmustur" + index + "nolu yere yerleþmiþtir");

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
