package com.bilgeadam.marathon2cozum.exception;

import com.bilgeadam.marathon2cozum.utility.FileUtils;

public class KutuphaneException extends Exception {

	private final ErrorType errorType;

	public KutuphaneException(ErrorType errorType, Log log) {
		super(errorType.getMessage());
		this.errorType = errorType;
		createLog(log);
	}

	public KutuphaneException(ErrorType errorType, String message) {
		super(message);
		this.errorType = errorType;
	}

	public KutuphaneException(ErrorType errorType) {

		this.errorType = errorType;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

	public void createLog(Log log) {

		FileUtils.createLog(log);

	}

}
