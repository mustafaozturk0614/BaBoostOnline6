package com.bilgeadam.lesson043.dependencyInversion.databaselogger;

public class PostgreLogger implements ILogger {

	public void log() {

		System.out.println("postgreye loglandý");
	}

}
