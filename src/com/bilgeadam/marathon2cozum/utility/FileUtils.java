package com.bilgeadam.marathon2cozum.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;
import java.util.UUID;

import com.bilgeadam.marathon2cozum.exception.Log;

public class FileUtils {

	public static void createLog(Log log) {
		try {
			String fileName = UUID.randomUUID().toString();
			FileOutputStream file = new FileOutputStream("E:/java6dosya/" + fileName + ".log");
			ObjectOutputStream logStream = new ObjectOutputStream(file);
			logStream.writeObject(log);
			logStream.close();
		} catch (Exception exception) {

		}
	}

	public static Optional<Log> getLogFile(String logFileUuid) {
		try {
			FileInputStream file = new FileInputStream("E:/java6dosya/" + logFileUuid + ".log");
			ObjectInputStream logStream = new ObjectInputStream(file);
			Log log = (Log) logStream.readObject();
			logStream.close();
			return Optional.of(log);
		} catch (Exception exception) {
			return Optional.empty();
		}
	}
}
