package com.bilgeadam.lesson043.dependencyInversion;

import com.bilgeadam.lesson043.dependencyInversion.databaselogger.DatabaseLogger;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.exception.StoryException;
import com.bilgeadam.lesson043.dependencyInversion.databaselogger.exception.VideoException;

public class DITest {

	public static void main(String[] args) {

		WhatsApp whatsApp = new WhatsApp();

		try {
			whatsApp.hikayePaylas();
			whatsApp.videoKonferans();
		} catch (StoryException e) {
			new DatabaseLogger().logToPostgre(e.getMessage());
		} catch (VideoException e) {
			new DatabaseLogger().logToMongo(e.getMessage());
		}

	}

}
