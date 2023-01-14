package com.bilgeadam.marathon2cozum.repository;

import java.util.List;
import java.util.Optional;

import com.bilgeadam.marathon2cozum.entity.Kitap;
import com.bilgeadam.marathon2cozum.utility.Database;

public class KitapRepository implements ICrud<Kitap> {

	@Override
	public Optional<Kitap> findById(long id) {

		return Database.kitaplar.stream().filter(x -> x.getId() == id).findFirst();
	}

	@Override
	public Optional<Kitap> findbyName(String name) {

		return Database.kitaplar.stream().filter(x -> x.getName().equalsIgnoreCase(name)).findFirst();
	}

	@Override
	public List<Kitap> findAll() {

		return Database.kitaplar;
	}

	@Override
	public void save(Kitap t) {

		Database.kitaplar.add(t);

	}

}
