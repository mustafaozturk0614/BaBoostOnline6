package com.bilgeadam.marathon2cozum.repository;

import java.util.List;

import com.bilgeadam.marathon2cozum.entity.Kiralama;
import com.bilgeadam.marathon2cozum.utility.Database;

public class KiralamaRepository implements ICrud<Kiralama> {

	@Override
	public Kiralama findById(long id) {

		return null;
	}

	@Override
	public Kiralama findbyName(String name) {
		// TODO Auto-generated method stub
		return null;
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
