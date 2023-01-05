package com.bilgeadam.lesson038;

public class LimanAppException extends RuntimeException {

	private final ErrorType errorType;

	public LimanAppException(ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}

	public LimanAppException(ErrorType errorType, String message) {
		super(message);
		this.errorType = errorType;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

}
