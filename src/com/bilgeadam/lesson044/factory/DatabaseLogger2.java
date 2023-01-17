package com.bilgeadam.lesson044.factory;

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
