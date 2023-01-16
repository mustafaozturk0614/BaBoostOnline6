package com.bilgeadam.lesson043.dependencyInversion.databaselogger;

public class DatabaseLogger2 {

	ILogger logger;

	public DatabaseLogger2(ILogger logger) {
		super();
		this.logger = logger;
	}

	public void log() {
		logger.log();
	}

}
