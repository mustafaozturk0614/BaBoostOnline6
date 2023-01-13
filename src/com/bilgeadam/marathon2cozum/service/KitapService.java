package com.bilgeadam.marathon2cozum.service;

import java.util.List;
import java.util.Scanner;

import com.bilgeadam.marathon2cozum.entity.Kitap;
import com.bilgeadam.marathon2cozum.repository.KitapRepository;

public class KitapService implements ICrudService<Kitap> {

	KitapRepository kitapRepository = new KitapRepository();
	Scanner scanner = new Scanner(System.in);

	@Override
	public Kitap findById(long id) {

		return kitapRepository.findById(id);
	}

	@Override
	public Kitap findbyName(String name) {

		return kitapRepository.findbyName(name);
	}

	@Override
	public List<Kitap> findAll() {

		return kitapRepository.findAll();
	}

	@Override
	public void save(Kitap t) {

		kitapRepository.save(t);

	}

}
