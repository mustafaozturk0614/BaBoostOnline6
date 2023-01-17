package com.bilgeadam.lesson044.factory;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen loglama yapacagýnýz database isimini giriniz");
		String dbName = scanner.nextLine();
//	standart nesne olusturma
		Postgre postgreLogger = new Postgre();
		Mongo mongoLogger = new Mongo();
		// polimorifzm
		ILogger postgreLogger2 = new Postgre();
		ILogger mongoLogger2 = new Mongo();

		ILogger logger = DatabaseFactory.createDatabase(dbName);
		System.out.println(logger.getClass());

	}

}
