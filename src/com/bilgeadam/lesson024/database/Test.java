package com.bilgeadam.lesson024.database;
/*
 * 
 * Mysql database bir sýnýf olusturmanýzý 
 * bu sýnýfa bir interface yazacagýz 
 * eklem silme getirme ve guncelleme metodlarý olsun 
 * 
 * bir manger sýnfý yazalým burda menumuz olsun olsun 
 * 
 * 1-veri ekle
 * 2-veri sil
 * 3-veri güncelle
 * 4-verileri getir
 * 
 * secim yapýp bu metotlarý calýstýracagýz
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
			secim = Utility.intDegerAlma("Lütfen Hangi veri tanýný kullanýcaðýnýzý seciniz");

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
