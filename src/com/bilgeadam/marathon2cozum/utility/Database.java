package com.bilgeadam.marathon2cozum.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.bilgeadam.marathon2cozum.entity.Kasiyer;
import com.bilgeadam.marathon2cozum.entity.Kiralama;
import com.bilgeadam.marathon2cozum.entity.Kitap;
import com.bilgeadam.marathon2cozum.entity.Musteri;

public class Database {

	public static final List<Kiralama> kiralananKitaplar = new ArrayList<>();
	public static final List<Kitap> kitaplar = new ArrayList<>();
	public static final List<Musteri> musteriler = new ArrayList<>();
	public static final List<Kasiyer> kasiyerler = new ArrayList<>();
	public static final Map<Long, Musteri> kitapMusteri = new TreeMap<>();

	public static void musteriveKasiyerOlustur() {

		Musteri musteri1 = new Musteri(1, "Ahmet Akçay");
		Musteri musteri2 = new Musteri(2, "Mehmet Gürel");
		Musteri musteri3 = new Musteri(3, "Ahmet Ada");
		Musteri musteri4 = new Musteri(4, "Ayse Gür");
		musteriler.add(musteri1);
		musteriler.add(musteri2);
		musteriler.add(musteri3);
		musteriler.add(musteri4);
		Kasiyer kasiyer1 = new Kasiyer(1, "Berkin Yardımcı");
		Kasiyer kasiyer2 = new Kasiyer(2, "Mustafa Öztürk");
		kasiyerler.add(kasiyer1);
		kasiyerler.add(kasiyer2);

	}

	public static void kitapOlustur() {
		Kitap kitap1 = new Kitap(1, "Esir Şehrin insanları");
		Kitap kitap2 = new Kitap(2, "Ölü Canlar");
		Kitap kitap3 = new Kitap(3, "Palto");
		Kitap kitap4 = new Kitap(4, "Mutlu ölüm");
		Kitap kitap5 = new Kitap(5, "Kayıp Cennet");
		Kitap kitap6 = new Kitap(6, "Sırça Fanus");
		Kitap kitap7 = new Kitap(6, "Budala");
		Kitap kitap8 = new Kitap(6, "Gülün Adı");
		Kitap kitap9 = new Kitap(6, "Huzursuzluğun Kitabı");

		kitaplar.add(kitap1);
		kitaplar.add(kitap2);
		kitaplar.add(kitap3);
		kitaplar.add(kitap4);
		kitaplar.add(kitap5);
		kitaplar.add(kitap6);
		kitaplar.add(kitap7);
		kitaplar.add(kitap8);
		kitaplar.add(kitap9);
	}

	public static void kiralamaOlustur() {

		Kiralama kiralama1 = new Kiralama(1, kitaplar.get(0), musteriler.get(0), kasiyerler.get(0));
		kiralama1.setDate(LocalDate.now().minusMonths(1));
		kitapMusteri.put(kitaplar.get(0).getId(), musteriler.get(0));

		Kiralama kiralama2 = new Kiralama(2, kitaplar.get(0), musteriler.get(1), kasiyerler.get(1));
		kiralama2.setDate(LocalDate.now().minusWeeks(2));
		kitapMusteri.put(kitaplar.get(0).getId(), musteriler.get(1));
		Kiralama kiralama3 = new Kiralama(3, kitaplar.get(0), musteriler.get(2), kasiyerler.get(1));
		kiralama3.setDate(LocalDate.now().minusWeeks(1));
		kiralama3.getKitap().setKiradaMi(true);
		kitapMusteri.put(kitaplar.get(0).getId(), musteriler.get(2));
		Kiralama kiralama4 = new Kiralama(4, kitaplar.get(1), musteriler.get(2), kasiyerler.get(1));
		kiralama4.setDate(LocalDate.now().minusWeeks(1));
		kiralama4.getKitap().setKiradaMi(true);
		kitapMusteri.put(kitaplar.get(1).getId(), musteriler.get(2));
		Kiralama kiralama5 = new Kiralama(5, kitaplar.get(2), musteriler.get(3), kasiyerler.get(1));
		kiralama5.setDate(LocalDate.now().minusMonths(1));
		kitapMusteri.put(kitaplar.get(2).getId(), musteriler.get(3));
		Kiralama kiralama6 = new Kiralama(6, kitaplar.get(3), musteriler.get(3), kasiyerler.get(1));
		kiralama6.setDate(LocalDate.now().minusWeeks(1));

		kitapMusteri.put(kitaplar.get(3).getId(), musteriler.get(3));

		Kiralama kiralama7 = new Kiralama(7, kitaplar.get(2), musteriler.get(1), kasiyerler.get(1));
		kiralama7.setDate(LocalDate.now().minusDays(1));
		kiralama7.getKitap().setKiradaMi(true);
		kitapMusteri.put(kitaplar.get(2).getId(), musteriler.get(1));

		Kiralama kiralama8 = new Kiralama(8, kitaplar.get(3), musteriler.get(1), kasiyerler.get(1));
		kiralama8.setDate(LocalDate.now().minusDays(1));
		kiralama8.getKitap().setKiradaMi(true);
		kitapMusteri.put(kitaplar.get(3).getId(), musteriler.get(1));

		kiralananKitaplar.add(kiralama1);
		kiralananKitaplar.add(kiralama2);
		kiralananKitaplar.add(kiralama3);
		kiralananKitaplar.add(kiralama4);
		kiralananKitaplar.add(kiralama5);
		kiralananKitaplar.add(kiralama6);

	}

}
