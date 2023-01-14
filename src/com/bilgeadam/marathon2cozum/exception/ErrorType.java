package com.bilgeadam.marathon2cozum.exception;

public enum ErrorType {

	MUSTERI_BULUNAMADI(1001, "Boyle Bir Musteri Bulunamad�"), KITAP_BULUNAMADI(2001, "Boyle Bir Kitap Bulunamad�"),
	KITAP_KIRADA(2002, "Bu Kitap �uanda Kiralamaya uygun de�ildir"),
	KIRALAMA_BULUNAMADI(3001, "Boyle Bir K�ralama Bulunamad�");

	private String message;
	private int code;

	private ErrorType(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}
