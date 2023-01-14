package com.bilgeadam.marathon2cozum.repository;

import java.util.List;
import java.util.Optional;

import com.bilgeadam.marathon2cozum.entity.Kiralama;
import com.bilgeadam.marathon2cozum.utility.Database;

public class KiralamaRepository implements ICrud<Kiralama> {

	@Override
	public Optional<Kiralama> findById(long id) {

		return Database.kiralananKitaplar.stream().filter(x -> x.getId() == id).findFirst();
	}

	@Override
	public Optional<Kiralama> findbyName(String name) {

		return Database.kiralananKitaplar.stream().filter(x -> x.getKitap().getName().equals(name)).findFirst();
	}

	@Override
	public List findAll() {

		return Database.kiralananKitaplar;
	}

	@Override
	public void save(Kiralama kiralama) {
		Database.kiralananKitaplar.add(kiralama);

	}

}
