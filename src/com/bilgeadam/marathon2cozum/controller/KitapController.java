package com.bilgeadam.marathon2cozum.controller;

import java.util.List;

import com.bilgeadam.marathon2cozum.entity.Kitap;
import com.bilgeadam.marathon2cozum.exception.KutuphaneException;
import com.bilgeadam.marathon2cozum.service.KitapService;

public class KitapController {

	KitapService kitapService = new KitapService();

	public Kitap findById(Long id) throws KutuphaneException {

		return kitapService.findById(id);
	}

	public Kitap findByName(String name) throws KutuphaneException {

		return kitapService.findbyName(name);
	}

	public List<Kitap> findAll() {

		return kitapService.findAll();
	}

	public void save(Kitap kitap) {

		kitapService.save(kitap);
		;
	}
}
