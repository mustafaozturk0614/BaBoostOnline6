package com.bilgeadam.etut;

import java.util.List;

public interface ICrud {

	void kitapEkle();

	void kitapSil();

	Kitap ismeGoreKitapBul();

	List<Kitap> yazarinKitaplariniBul();

	List<Kitap> kitaplariListele();

	List<Yazar> yazarlariListele();

}
