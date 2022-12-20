package com.bilgeadam.lesson030;

public class Ogrenci implements Comparable<Ogrenci> {

	int id;
	String name;

	public Ogrenci(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Ogrenci(int id) {
		this.id = id;

	}

	@Override
	public int compareTo(Ogrenci o) {
		if (o.id < this.id) {
			return 1;
		} else if (o.id == this.id) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", name=" + name + "]";
	}

}
