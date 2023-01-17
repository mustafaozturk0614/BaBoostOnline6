package com.bilgeadam.lesson043.dependencyInversion.databaselogger;

public class DatabaseLogger {

	PostgreLogger postgreLogger = new PostgreLogger();

	public void logToPostgre(String ex) {
		postgreLogger.log(ex);
	}

	public void logToMongo(String ex) {
		MongoLogger mongoLogger = new MongoLogger();
		mongoLogger.log(ex);
	}

}
