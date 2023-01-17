package com.bilgeadam.lesson043.dependencyInversion.databaselogger.cözüm;

public class MongoLogger implements ILogger {

	public void log(String ex) {

		System.out.println(ex + "-->mongoyo loglandý");
	}

}
