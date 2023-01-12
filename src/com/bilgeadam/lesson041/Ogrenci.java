package com.bilgeadam.lesson041;

import java.io.Serializable;

/*
 * name
 * ortalama
 * 
 * 
 * 
 */
public class Ogrenci implements Serializable {

	private String name;
	private double ort;

	public Ogrenci(String name) {
		super();
		this.name = name;
	}

	public Ogrenci(String name, double ort) {
		super();
		this.name = name;
		this.ort = ort;
	}

	public String getName() {
		return name;
	}

	public double getOrt() {
		return ort;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrt(double ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		return "Ogrenci [name=" + name + ", ort=" + ort + "]";
	}

}
