package com.bilgeadam.lesson044.factory;

class Mongo implements ILogger {

	public void log(String ex) {

		System.out.println(ex + "-->mongoyo loglandý");
	}

}
