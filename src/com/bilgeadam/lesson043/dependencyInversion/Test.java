package com.bilgeadam.lesson043.dependencyInversion;

import com.bilgeadam.lesson043.dependencyInversion.databaselogger.DatabaseLogger;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.DatabaseLogger2;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.MongoLogger;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.PostgreLogger;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.StoryException;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.VideoException;

public class Test {

	public static void main(String[] args) {

		WhatsApp whatsApp = new WhatsApp();

		try {
			whatsApp.hikayePaylas();
			whatsApp.videoKonferans();

		} catch (StoryException e) {
			new DatabaseLogger().logToPostgre();
		} catch (VideoException e) {
			new DatabaseLogger().logToMongo();
			;
		}

		try {
			whatsApp.hikayePaylas();
			whatsApp.videoKonferans();

		} catch (StoryException e) {
			new DatabaseLogger2(new PostgreLogger());
		} catch (VideoException e) {
			new DatabaseLogger2(new MongoLogger());
		}

	}

}
