package com.bilgeadam.lesson024.database;
/*
 * 
 * Mysql database bir s�n�f olusturman�z� 
 * bu s�n�fa bir interface yazacag�z 
 * eklem silme getirme ve guncelleme metodlar� olsun 
 * 
 * bir manger s�nf� yazal�m burda menumuz olsun olsun 
 * 
 * 1-veri ekle
 * 2-veri sil
 * 3-veri g�ncelle
 * 4-verileri getir
 * 
 * secim yap�p bu metotlar� cal�st�racag�z
 * 
 * 
 * 
 */

public class Test {

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {

		Manager manager;

		int secim = 0;
		do {
			System.out.println("1-Mysql");
			System.out.println("2-Oracle");
			secim = Utility.intDegerAlma("L�tfen Hangi veri tan�n� kullan�ca��n�z� seciniz");

			switch (secim) {
			case 1:
				Mysql mysql = new Mysql();

				manager = new Manager(mysql);
				mysql.login();
				manager.calistir();
				break;
			case 2:
				Oracle oracle = new Oracle();
				manager = new Manager(oracle);
				oracle.login();
				manager.calistir();
				break;

			default:
				break;
			}

		} while (secim != 0);

	}

}
