package com.bilgeadam.lesson024.database;

public class Mysql extends Databse {

	@Override
	public void ekle() {
		System.out.println("Mysql veritabanına  Veri eklendi");

	}

	@Override
	public void sil() {
		System.out.println("Mysql veritabanından Veri silindi");

	}

	@Override
	public void guncelle() {
		System.out.println("Mysql veritabanında Veri güncellendi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Mysql veritabanından Veriler getiriliyor");

	}

	@Override
	public void login() {
		System.out.println("Mysql veritabanına bağlanıldı");

	}

}
