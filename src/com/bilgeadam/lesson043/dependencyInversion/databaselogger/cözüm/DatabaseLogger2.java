package com.bilgeadam.lesson043.dependencyInversion.databaselogger.cözüm;

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
