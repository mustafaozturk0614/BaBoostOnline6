package com.bilgeadam.lesson024.database;

public class Mysql extends Databse {

	@Override
	public void ekle() {
		System.out.println("Mysql veritabanýna  Veri eklendi");

	}

	@Override
	public void sil() {
		System.out.println("Mysql veritabanýndan Veri silindi");

	}

	@Override
	public void guncelle() {
		System.out.println("Mysql veritabanýnda Veri güncellendi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Mysql veritabanýndan Veriler getiriliyor");

	}

	@Override
	public void login() {
		System.out.println("Mysql veritabanýna baðlanýldý");

	}

}
