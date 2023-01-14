package com.bilgeadam.marathon2cozum.controller;

import java.util.List;

import com.bilgeadam.marathon2cozum.entity.Kiralama;
import com.bilgeadam.marathon2cozum.exception.KutuphaneException;
import com.bilgeadam.marathon2cozum.service.KiralamaService;

public class KiralamaController {

	KiralamaService kiralamaService = new KiralamaService();

	public Kiralama findById(Long id) throws KutuphaneException {

		return kiralamaService.findById(id);
	}

	public Kiralama findByName(String name) throws KutuphaneException {

		return kiralamaService.findbyName(name);
	}

	public List<Kiralama> findAll() {

		return kiralamaService.findAll();
	}

	public void save(Kiralama kiralama) {

		kiralamaService.save(kiralama);
		;
	}
}
