package com.bilgeadam.lesson038;

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
 * 
 * 
 * 
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

	public void yukyeriSec2() {
		liman.getYukler()[0] = new Yuk("1", 100, LocalDate.now());
		System.out.println("Lütfen bir yük yeri seçiniz");
		int index = scanner.nextInt();
		if (index < 0 || index >= liman.getYukler().length) {
//			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA,
//					"lütfen 0 ile " + liman.getYukler().length + " arasýnda bir seçim yapýnýz");
//			
			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);

		} else if (liman.getYukler()[index] != null) {
			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
		}

	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		try {
			uygulama.yukyeriSec2();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
