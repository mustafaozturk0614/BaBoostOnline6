package com.bilgeadam.lesson038;

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
		System.out.println("L�tfen bir y�k yeri se�iniz");
		int index = scanner.nextInt();
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("L�tfen s�n�rlar dahilinde bir yer se�iniz");
		}
	}

	public void yukyeriSec2() {
		liman.getYukler()[0] = new Yuk("1", 100, LocalDate.now());
		System.out.println("L�tfen bir y�k yeri se�iniz");
		int index = scanner.nextInt();
		if (index < 0 || index >= liman.getYukler().length) {
//			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA,
//					"l�tfen 0 ile " + liman.getYukler().length + " aras�nda bir se�im yap�n�z");
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
