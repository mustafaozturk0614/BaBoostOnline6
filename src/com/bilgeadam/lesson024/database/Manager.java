package com.bilgeadam.lesson024.database;

public class Manager {

//	Mysql mysql;
//	Oracle oracle;
//	IDatabse database;
	Databse database;

//	public Manager() {
////		this.mysql = new Mysql();
//		this.oracle = new Oracle();
//	}

//	public Manager(IDatabse database) {
//		this.database = database;
//
//	}
	public Manager(Databse database) {
		this.database = database;

	}

	public void menu() {

		System.out.println("1-Veri ekle");
		System.out.println("2-Veri sil");
		System.out.println("3-Veri guncelle");
		System.out.println("4-Verileri getir");

	}

	public void calistir() {
		int secim;

		do {
			menu();

			secim = Utility.intDegerAlma("Lütfen bir secim yapın");
			switch (secim) {
			case 1:
				database.ekle();
				break;
			case 2:
				database.sil();
				break;
			case 3:
				database.guncelle();
				break;
			case 4:
				database.verileriGetir();
				break;

			default:
				break;
			}
		} while (secim != 0);

	}
}
