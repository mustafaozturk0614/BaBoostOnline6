package com.bilgeadam.marathon2cozum.repository;

import java.util.List;
import java.util.Optional;

public interface ICrud<T> {

	Optional<T> findById(long id);

	Optional<T> findbyName(String name);

	List<T> findAll();

	void save(T t);
}
