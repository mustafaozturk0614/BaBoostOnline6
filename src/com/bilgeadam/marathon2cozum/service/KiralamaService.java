package com.bilgeadam.marathon2cozum.service;

import java.util.List;
import java.util.Optional;

import com.bilgeadam.marathon2cozum.entity.Kiralama;
import com.bilgeadam.marathon2cozum.exception.ErrorType;
import com.bilgeadam.marathon2cozum.exception.KutuphaneException;
import com.bilgeadam.marathon2cozum.exception.Log;
import com.bilgeadam.marathon2cozum.repository.KiralamaRepository;
import com.bilgeadam.marathon2cozum.utility.Database;

public class KiralamaService implements ICrudService<Kiralama> {

	private final KiralamaRepository kiralamaRepository;

	public KiralamaService() {

		this.kiralamaRepository = new KiralamaRepository();
		;
	}

	@Override
	public Kiralama findById(long id) throws KutuphaneException {
		Optional<Kiralama> kiralama = kiralamaRepository.findById(id);

		if (kiralama.isPresent()) {
			return kiralama.get();
		} else {
			throw new KutuphaneException(ErrorType.KIRALAMA_BULUNAMADI,
					new Log(ErrorType.KIRALAMA_BULUNAMADI.getMessage(), ErrorType.KIRALAMA_BULUNAMADI.getCode(),
							KitapService.class.getName(), "findbyId", System.currentTimeMillis()));
		}

	}

	@Override
	public Kiralama findbyName(String name) throws KutuphaneException {
		Optional<Kiralama> kiralama = kiralamaRepository.findbyName(name);

		if (kiralama.isPresent()) {
			return kiralama.get();
		} else {
			throw new KutuphaneException(ErrorType.KIRALAMA_BULUNAMADI,
					new Log(ErrorType.KIRALAMA_BULUNAMADI.getMessage(), ErrorType.KIRALAMA_BULUNAMADI.getCode(),
							KitapService.class.getName(), "findbyName", System.currentTimeMillis()));
		}
	}

	@Override
	public List<Kiralama> findAll() {

		return kiralamaRepository.findAll();
	}

	@Override
	public void save(Kiralama t) {
		Database.kiralananKitaplar.add(t);

	}

}
