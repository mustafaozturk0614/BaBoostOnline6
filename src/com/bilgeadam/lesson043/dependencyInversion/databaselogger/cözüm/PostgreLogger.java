package com.bilgeadam.lesson043.dependencyInversion.databaselogger.c�z�m;

public class PostgreLogger implements ILogger {

	public void log(String ex) {
		System.out.println(ex + "-->postgreye logland�");
	}

}
