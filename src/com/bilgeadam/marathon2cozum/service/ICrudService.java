package com.bilgeadam.marathon2cozum.service;

import java.util.List;

public interface ICrudService<T> {
	T findById(long id);

	T findbyName(String name);

	List<T> findAll();

	void save(T t);
}
