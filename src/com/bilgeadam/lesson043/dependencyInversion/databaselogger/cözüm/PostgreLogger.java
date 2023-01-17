package com.bilgeadam.lesson043.dependencyInversion.databaselogger.cözüm;

public class PostgreLogger implements ILogger {

	public void log(String ex) {
		System.out.println(ex + "-->postgreye loglandý");
	}

}
