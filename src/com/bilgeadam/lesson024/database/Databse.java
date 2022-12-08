package com.bilgeadam.lesson024.database;

public abstract class Databse {

	String url;
	String password;

	public abstract void ekle();

	public abstract void sil();

	public abstract void guncelle();

	public abstract void verileriGetir();

	public abstract void login();

}
