package com.bilgeadam.lesson043.dependencyInversion.databaselogger.c�z�m;

public class DatabaseLogger2 {
	ILogger logger;

	public DatabaseLogger2(ILogger logger) {
		super();
		this.logger = logger;
	}

	public void logToDatabse(String ex) {
		logger.log(ex);
	}

}
