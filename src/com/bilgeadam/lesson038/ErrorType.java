package com.bilgeadam.lesson038;

public enum ErrorType {

	DOLU_YER_SECIMI(1001, "Secti�iniz Yer doludur"), SINIRLAR_DISINDA(1002, "Yapt���n�z Se�im s�n�rlar�n d�s�ndad�r"),
	YETERSIZ_AGIRLIK(1003, "100 kilonun alt� bir y�k eklenemez"),
	MESAI_GUNLERI_DISI(1004, "Cuma gunleri kabul yap�lm�yor"),
	GECERSIZ_KABUL_TARIHI(1005, "Ge�mi� bir gunun tarihini girdiniz");

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
