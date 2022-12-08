package com.bilgeadam.lesson024.database;

public class Oracle extends Databse {

	@Override
	public void ekle() {
		System.out.println("Oracle veritabanýna  Veri eklendi");

	}

	@Override
	public void sil() {
		System.out.println("Oracle veritabanýndan Veri silindi");

	}

	@Override
	public void guncelle() {
		System.out.println("Oracle veritabanýnda Veri güncellendi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Oracle veritabanýndan Veriler getiriliyor");

	}

	@Override
	public void login() {
		System.out.println("Oracle veritabanýna baðlanýldý");

	}

}
