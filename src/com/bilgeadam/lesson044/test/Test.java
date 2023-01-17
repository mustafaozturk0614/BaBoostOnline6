package com.bilgeadam.lesson044.test;

import com.bilgeadam.lesson044.factory.DatabaseFactory;
import com.bilgeadam.lesson044.factory.ILogger;

public class Test {

	public static void main(String[] args) {

		// Mongo mongoLogger = new Mongo();

		ILogger logger = DatabaseFactory.createDatabase("POSTGRE");
		logger.log("xxx");

	}
}
