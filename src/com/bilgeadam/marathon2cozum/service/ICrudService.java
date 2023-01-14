package com.bilgeadam.marathon2cozum.service;

import java.util.List;

import com.bilgeadam.marathon2cozum.exception.KutuphaneException;

public interface ICrudService<T> {
	T findById(long id) throws KutuphaneException;

	T findbyName(String name) throws KutuphaneException;

	List<T> findAll();

	void save(T t);
}
