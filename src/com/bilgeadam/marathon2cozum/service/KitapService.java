package com.bilgeadam.marathon2cozum.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.bilgeadam.marathon2cozum.entity.Kitap;
import com.bilgeadam.marathon2cozum.exception.ErrorType;
import com.bilgeadam.marathon2cozum.exception.KutuphaneException;
import com.bilgeadam.marathon2cozum.exception.Log;
import com.bilgeadam.marathon2cozum.repository.KitapRepository;

public class KitapService implements ICrudService<Kitap> {

	KitapRepository kitapRepository = new KitapRepository();
	Scanner scanner = new Scanner(System.in);

	@Override
	public Kitap findById(long id) throws KutuphaneException {
		Optional<Kitap> kitap = kitapRepository.findById(id);

		if (kitap.isPresent()) {

			return kitap.get();
		} else {
			throw new KutuphaneException(ErrorType.KITAP_BULUNAMADI,
					new Log(ErrorType.KITAP_BULUNAMADI.getMessage(), ErrorType.KITAP_BULUNAMADI.getCode(),
							KitapService.class.getName(), "findbyId", System.currentTimeMillis()));
		}

	}

	@Override
	public Kitap findbyName(String name) throws KutuphaneException {

		Optional<Kitap> kitap = kitapRepository.findbyName(name);

		if (kitap.isPresent()) {
			return kitap.get();

		} else {
			throw new KutuphaneException(ErrorType.KITAP_BULUNAMADI,
					new Log(ErrorType.KITAP_BULUNAMADI.getMessage(), ErrorType.KITAP_BULUNAMADI.getCode(),
							KitapService.class.getName(), "findbyName", System.currentTimeMillis()));
		}
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
