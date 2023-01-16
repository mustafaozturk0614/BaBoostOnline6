package com.bilgeadam.lesson043.dependencyInversion.databaselogger;

public class DatabaseLogger {

	PostgreLogger postgreLogger = new PostgreLogger();

	public void logToPostgre() {
		PostgreLogger postgreLogger2 = new PostgreLogger();
		postgreLogger.log();
		postgreLogger2.log();

	}

	public void logToMongo() {
		MongoLogger mongoLogger = new MongoLogger();
		mongoLogger.log();
	}

}
