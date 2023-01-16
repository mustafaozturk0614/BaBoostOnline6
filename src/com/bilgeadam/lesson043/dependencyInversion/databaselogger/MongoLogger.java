package com.bilgeadam.lesson043.dependencyInversion.databaselogger;

public class MongoLogger implements ILogger {

	public void log() {

		System.out.println("mongoyo loglandý");
	}

}
