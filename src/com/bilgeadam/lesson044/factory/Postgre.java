package com.bilgeadam.lesson044.factory;

class Postgre implements ILogger {

	public void log(String ex) {
		System.out.println(ex + "-->postgreye loglandý");
	}

}
