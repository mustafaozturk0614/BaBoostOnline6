package com.bilgeadam.marathon2cozum.controller;

import java.util.List;

import com.bilgeadam.marathon2cozum.entity.Musteri;
import com.bilgeadam.marathon2cozum.exception.KutuphaneException;
import com.bilgeadam.marathon2cozum.service.MusteriService;

public class MusteriController {

	MusteriService musteriService = new MusteriService();

	public Musteri findById(Long id) throws KutuphaneException {

		return musteriService.findById(id);
	}

	public Musteri findByName(String name) throws KutuphaneException {

		return musteriService.findbyName(name);
	}

	public List<Musteri> findAll() {

		return musteriService.findAll();
	}

	public void save(Musteri Musteri) {

		musteriService.save(Musteri);
		;
	}
}
