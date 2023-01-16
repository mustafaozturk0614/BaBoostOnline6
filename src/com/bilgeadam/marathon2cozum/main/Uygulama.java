package com.bilgeadam.marathon2cozum.main;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bilgeadam.marathon2cozum.controller.KiralamaController;
import com.bilgeadam.marathon2cozum.controller.KitapController;
import com.bilgeadam.marathon2cozum.controller.MusteriController;
import com.bilgeadam.marathon2cozum.entity.Kiralama;
import com.bilgeadam.marathon2cozum.entity.Kitap;
import com.bilgeadam.marathon2cozum.entity.Musteri;
import com.bilgeadam.marathon2cozum.exception.ErrorType;
import com.bilgeadam.marathon2cozum.exception.KutuphaneException;
import com.bilgeadam.marathon2cozum.exception.Log;
import com.bilgeadam.marathon2cozum.utility.Database;
import com.bilgeadam.marathon2cozum.utility.FileUtils;

public class Uygulama {

	KitapController kitapController = new KitapController();
	KiralamaController kiralamaController = new KiralamaController();
	MusteriController musteriController = new MusteriController();
	Scanner scanner = new Scanner(System.in);

	public Uygulama() {
		Database.musteriveKasiyerOlustur();
		Database.kitapOlustur();
		Database.kiralamaOlustur();
	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
//		uygulama.kitapKayýtEt();
//		uygulama.kitapListesi();
		// uygulama.idyeGorekitapBul();
//		Optional<Log> log = FileUtils.getLogFile("0df6ae65-9df5-459d-a642-5b405abe5094");
//		System.out.println(log);
		// uygulama.kiralamaYap();
		uygulama.kiralananKitapListesi();
		uygulama.kitapIdyeGoreEnsonKiralama2();
//		uygulama.kitapIsmineGoreButunKiralamalar();
//		uygulama.musteriIdyeGoreKiraladýgýKitaplarýGetir();
		// uygulama.kitapIdyeGoreEnsonKiralama();
		;
	}

	public void idyeGorekitapBul() {
		System.out.println("Lütfen bir kitap id si giriniz");
		long id = Long.parseLong(scanner.nextLine());
		try {
			System.out.println(kitapController.findById(id));
		} catch (KutuphaneException e) {

			FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
					"IdyeGoreKitapBul", System.currentTimeMillis()));
			System.out.println(e.getMessage());
			;
		}

	}

	public void ismeGorekitapBul() {
		System.out.println("Lütfen bir kitap ismi  giriniz");
		String isim = scanner.nextLine();
		try {
			System.out.println(kitapController.findByName(isim));
		} catch (KutuphaneException e) {
			FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
					"ismeGorekitapBul", System.currentTimeMillis()));
			System.out.println(e.getMessage());
		}

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

	public void idyeGoreMusteriBul() {
		System.out.println("Lütfen bir musteri id si giriniz");
		long id = Long.parseLong(scanner.nextLine());
		try {
			System.out.println(musteriController.findById(id));
		} catch (KutuphaneException e) {
			FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
					"idyeGoreMusteriBul", System.currentTimeMillis()));
			System.out.println(e.getMessage());
		}

	}

	public void ismeGoreMusteriBul() {
		System.out.println("Lütfen bir Musteri ismi  giriniz");
		String isim = scanner.nextLine();
		try {
			System.out.println(musteriController.findByName(isim));
		} catch (KutuphaneException e) {
			FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
					"ismeGoreMusteriBul", System.currentTimeMillis()));
			System.out.println(e.getMessage());
		}

	}

	public void kiralananKitapListesi() {
		System.out.println("Kiralanan Kitap Listesi");
		kiralamaController.findAll().forEach(System.out::println);

	}

	public void kiralamaYap() {

		kitapController.findAll().stream().filter(x -> !x.isKiradaMi()).forEach(System.out::println);
		System.out.println("Lütfen bir kitap id si seçiniz");
		Long kitapId = Long.parseLong(scanner.nextLine());
		Kitap kitap;
		try {
			kitap = kitapController.findById(kitapId);

			if (kitap.isKiradaMi()) {

				throw new KutuphaneException(ErrorType.KITAP_KIRADA);
			}

			kitap.setKiradaMi(true);
			System.out.println("Lütfen id nizi giriniz");
			long id = Long.parseLong(scanner.nextLine());
			Musteri musteri = null;
			try {
				musteri = musteriController.findById(id);
				Kiralama kiralama = new Kiralama((kiralamaController.findAll().size() + 1), kitap, musteri,
						Database.kasiyerler.get(0));
				kiralamaController.save(kiralama);
			} catch (KutuphaneException e) {
				FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
						"kiralamaYap", System.currentTimeMillis()));
				System.out.println(e.getMessage());
			}
		} catch (KutuphaneException e1) {
			FileUtils.createLog(new Log(e1.getMessage(), e1.getErrorType().getCode(), Uygulama.class.getName(),
					"kiralamaYap", System.currentTimeMillis()));
			System.out.println(e1.getMessage());
		}

	}

	public void kitapIdyeGoreEnsonKiralama() {
		System.out.println("Lütfen id nizi giriniz");
		long id = Long.parseLong(scanner.nextLine());
		Kitap kitap;
		try {
			kitap = kitapController.findById(id);
			List<Musteri> musteriler = kiralamaController.findAll().stream().filter(x -> x.getKitap().equals(kitap))
					.map(x -> x.getMusteri()).collect(Collectors.toList());
			System.out.println(id + " Li kitabý enson kiralayan muserti===> " + musteriler.get(musteriler.size() - 1));
		} catch (KutuphaneException e) {
			FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
					"kiralamaYap", System.currentTimeMillis()));
			System.out.println(e.getMessage());
		}

	}

	// Map Yapýsý ile Kitabý en son kim kiralamýs
	public void kitapIdyeGoreEnsonKiralama2() {
		System.out.println("Lütfen id nizi giriniz");
		long id = Long.parseLong(scanner.nextLine());
		Kitap kitap;
		try {

			kitap = kitapController.findById(id);
			System.out.println(id + " Li kitabý enson kiralayan muserti===> " + Database.kitapMusteri.get(id));

		} catch (KutuphaneException e) {
			FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
					"kiralamaYap", System.currentTimeMillis()));
			System.out.println(e.getMessage());
		}

	}

	public void kitapIsmineGoreButunKiralamalar() {
		System.out.println("Lütfen kitap ismini giriniz");

		try {
			Kitap kitap = kitapController.findByName(scanner.nextLine());

			System.out.println(kitap.getName() + " isimli kitabý enson kiralayan musertiler");
			kiralamaController.findAll().stream().filter(x -> x.getKitap().equals(kitap)).map(x -> x.getMusteri())
					.collect(Collectors.toList()).forEach(System.out::println);
		} catch (KutuphaneException e) {
			FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
					"kitapIdyeGoreButunKiralamalar", System.currentTimeMillis()));
			System.out.println(e.getMessage());
		}

	}

	public void musteriIdyeGoreKiraladýgýKitaplarýGetir() {
		System.out.println("Lütfen id nizi giriniz");
		long id = Long.parseLong(scanner.nextLine());
		Musteri musteri;
		try {
			musteri = musteriController.findById(id);
			System.out.println(id + " limusterinin kiraladýðý kitaplar");
			kiralamaController.findAll().stream().filter(x -> x.getMusteri().equals(musteri)).map(x -> x.getKitap())
					.collect(Collectors.toList()).forEach(System.out::println);
		} catch (KutuphaneException e) {
			FileUtils.createLog(new Log(e.getMessage(), e.getErrorType().getCode(), Uygulama.class.getName(),
					"musteriIdyeGoreKiraladýgýKitaplarýGetir", System.currentTimeMillis()));
			System.out.println(e.getMessage());
		}

	}

	public void ismiAhmIleBaslayanMusteriler() {
		List<Musteri> musteriler = musteriController.findAll().stream()
				.filter(x -> x.getIsim().toLowerCase().startsWith("ahm")).collect(Collectors.toList());

		if (musteriler.size() == 0) {
			System.out.println("ismi ahm ile baslayan musteri bulunamadý");
		} else {
			musteriler.forEach(System.out::println);
		}
	}
}
