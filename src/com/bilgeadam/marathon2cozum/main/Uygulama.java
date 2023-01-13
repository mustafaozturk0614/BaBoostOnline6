package com.bilgeadam.marathon2cozum.main;

import java.util.Scanner;

import com.bilgeadam.marathon2cozum.controller.KitapController;
import com.bilgeadam.marathon2cozum.entity.Kitap;
import com.bilgeadam.marathon2cozum.utility.Database;

public class Uygulama {

	KitapController kitapController = new KitapController();
	Scanner scanner = new Scanner(System.in);

	public Uygulama() {
		Database.musteriveKasiyerOlustur();
		Database.kitapOlustur();
		Database.kiralamaOlustur();
	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.kitapKayýtEt();
		uygulama.kitapListesi();
	}

	public void idyeGorekitapBul() {
		System.out.println("Lütfen bir kitap id si giriniz");
		long id = Long.parseLong(scanner.nextLine());
		System.out.println(kitapController.findById(id));

	}

	public void ismeGorekitapBul() {
		System.out.println("Lütfen bir kitap ismi  giriniz");
		String isim = scanner.nextLine();
		System.out.println(kitapController.findByName(isim));

	}

	public void kitapListesi() {

		kitapController.findAll().forEach(System.out::println);

	}

	public void kitapKayýtEt() {
		System.out.println("Lütfen bir kitap ismi  giriniz");
		String isim = scanner.nextLine();

		Kitap kitap = new Kitap((Database.kitaplar.size() + 1), isim);
		kitapController.save(kitap);

		System.out.println(kitap + "baþarý ile kayýt edildi");

	}
}
