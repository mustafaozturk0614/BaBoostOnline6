package com.bilgeadam.lesson024.database;

public class Oracle extends Databse {

	@Override
	public void ekle() {
		System.out.println("Oracle veritaban�na  Veri eklendi");

	}

	@Override
	public void sil() {
		System.out.println("Oracle veritaban�ndan Veri silindi");

	}

	@Override
	public void guncelle() {
		System.out.println("Oracle veritaban�nda Veri g�ncellendi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Oracle veritaban�ndan Veriler getiriliyor");

	}

	@Override
	public void login() {
		System.out.println("Oracle veritaban�na ba�lan�ld�");

	}

}
