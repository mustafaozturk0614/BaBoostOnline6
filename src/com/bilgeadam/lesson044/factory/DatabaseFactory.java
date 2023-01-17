package com.bilgeadam.lesson044.factory;

public class DatabaseFactory {

	public static ILogger createDatabase(String dbName) {

		switch (dbName.toUpperCase()) {
		case "POSTGRE":
			return new Postgre();
		case "MONGO":
			return new Mongo();
		default:
			throw new RuntimeException("Girdiðiniz Database Desteklenmemektedir");
		}

	}

}
