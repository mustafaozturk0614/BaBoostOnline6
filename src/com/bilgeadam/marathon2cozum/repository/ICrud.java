package com.bilgeadam.marathon2cozum.repository;

import java.util.List;

public interface ICrud<T> {

	T findById(long id);

	T findbyName(String name);

	List<T> findAll();

	void save(T t);
}
