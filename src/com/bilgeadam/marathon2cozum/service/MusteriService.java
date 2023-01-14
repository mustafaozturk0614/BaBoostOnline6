package com.bilgeadam.marathon2cozum.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.bilgeadam.marathon2cozum.entity.Musteri;
import com.bilgeadam.marathon2cozum.exception.ErrorType;
import com.bilgeadam.marathon2cozum.exception.KutuphaneException;
import com.bilgeadam.marathon2cozum.exception.Log;
import com.bilgeadam.marathon2cozum.repository.MusteriRepository;

public class MusteriService implements ICrudService<Musteri> {

	MusteriRepository MusteriRepository = new MusteriRepository();
	Scanner scanner = new Scanner(System.in);

	@Override
	public Musteri findById(long id) throws KutuphaneException {
		Optional<Musteri> musteri = MusteriRepository.findById(id);

		if (musteri.isPresent()) {
			return musteri.get();
		} else {
			throw new KutuphaneException(ErrorType.MUSTERI_BULUNAMADI,
					new Log(ErrorType.MUSTERI_BULUNAMADI.getMessage(), ErrorType.MUSTERI_BULUNAMADI.getCode(),
							MusteriService.class.getName(), "findbyId", System.currentTimeMillis()));
		}

	}

	@Override
	public Musteri findbyName(String name) throws KutuphaneException {

		Optional<Musteri> musteri = MusteriRepository.findbyName(name);

		if (musteri.isPresent()) {
			return musteri.get();

		} else {
			throw new KutuphaneException(ErrorType.MUSTERI_BULUNAMADI,
					new Log(ErrorType.MUSTERI_BULUNAMADI.getMessage(), ErrorType.MUSTERI_BULUNAMADI.getCode(),
							MusteriService.class.getName(), "findbyName", System.currentTimeMillis()));
		}
	}

	@Override
	public List<Musteri> findAll() {

		return MusteriRepository.findAll();
	}

	@Override
	public void save(Musteri t) {

		MusteriRepository.save(t);

	}

}
