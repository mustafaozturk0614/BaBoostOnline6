package com.bilgeadam.marathon2cozum.repository;

import java.util.List;
import java.util.Optional;

import com.bilgeadam.marathon2cozum.entity.Musteri;
import com.bilgeadam.marathon2cozum.utility.Database;

public class MusteriRepository implements ICrud<Musteri> {

	@Override
	public Optional<Musteri> findById(long id) {

		return Database.musteriler.stream().filter(x -> x.getId() == id).findFirst();
	}

	@Override
	public Optional<Musteri> findbyName(String name) {

		return Database.musteriler.stream().filter(x -> x.getIsim().equals(name)).findFirst();
	}

	@Override
	public List<Musteri> findAll() {

		return Database.musteriler;
	}

	@Override
	public void save(Musteri t) {
		Database.musteriler.add(t);

	}

}
