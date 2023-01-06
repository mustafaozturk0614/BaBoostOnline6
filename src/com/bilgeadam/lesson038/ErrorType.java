package com.bilgeadam.lesson038;

public enum ErrorType {

	DOLU_YER_SECIMI(1001, "Sectiðiniz Yer doludur"), SINIRLAR_DISINDA(1002, "Yaptýðýnýz Seçim sýnýrlarýn dýsýndadýr"),
	YETERSIZ_AGIRLIK(1003, "100 kilonun altý bir yük eklenemez"),
	MESAI_GUNLERI_DISI(1004, "Cuma gunleri kabul yapýlmýyor"),
	GECERSIZ_KABUL_TARIHI(1005, "Geçmiþ bir gunun tarihini girdiniz");

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
