package com.bilgeadam.lesson024.database;

public class Mysql extends Databse {

	@Override
	public void ekle() {
		System.out.println("Mysql veritaban�na  Veri eklendi");

	}

	@Override
	public void sil() {
		System.out.println("Mysql veritaban�ndan Veri silindi");

	}

	@Override
	public void guncelle() {
		System.out.println("Mysql veritaban�nda Veri g�ncellendi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Mysql veritaban�ndan Veriler getiriliyor");

	}

	@Override
	public void login() {
		System.out.println("Mysql veritaban�na ba�lan�ld�");

	}

}
