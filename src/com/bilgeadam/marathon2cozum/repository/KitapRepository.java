package com.bilgeadam.marathon2cozum.repository;

import java.util.List;

import com.bilgeadam.marathon2cozum.entity.Kitap;
import com.bilgeadam.marathon2cozum.utility.Database;

public class KitapRepository implements ICrud<Kitap> {

	@Override
	public Kitap findById(long id) {

		return Database.kitaplar.stream().filter(x -> x.getId() == id).findFirst().get();
	}

	@Override
	public Kitap findbyName(String name) {

		return Database.kitaplar.stream().filter(x -> x.getName().equalsIgnoreCase(name)).findFirst().get();
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
