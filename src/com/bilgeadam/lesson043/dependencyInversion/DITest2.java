package com.bilgeadam.lesson043.dependencyInversion;

import com.bilgeadam.lesson043.dependencyInversion.databaselogger.c�z�m.DatabaseLogger2;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.c�z�m.MongoLogger;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.c�z�m.PostgreLogger;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.exception.StoryException;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.exception.VideoException;

public class DITest2 {

	public static void main(String[] args) {

		WhatsApp whatsApp = new WhatsApp();

		try {
			whatsApp.hikayePaylas();
			whatsApp.videoKonferans();
		} catch (StoryException e) {
			new DatabaseLogger2(new PostgreLogger()).logToDatabse(e.getMessage());
			;
		} catch (VideoException e) {
			new DatabaseLogger2(new MongoLogger()).logToDatabse(e.getMessage());
			;
		}

	}

}
