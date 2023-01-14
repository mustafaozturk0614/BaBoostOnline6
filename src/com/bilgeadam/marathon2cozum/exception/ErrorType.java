package com.bilgeadam.marathon2cozum.exception;

public enum ErrorType {

	MUSTERI_BULUNAMADI(1001, "Boyle Bir Musteri Bulunamadý"), KITAP_BULUNAMADI(2001, "Boyle Bir Kitap Bulunamadý"),
	KITAP_KIRADA(2002, "Bu Kitap Þuanda Kiralamaya uygun deðildir"),
	KIRALAMA_BULUNAMADI(3001, "Boyle Bir Kýralama Bulunamadý");

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
