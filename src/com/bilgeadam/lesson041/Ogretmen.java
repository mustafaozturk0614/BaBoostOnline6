package com.bilgeadam.lesson041;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * ogretmen s�n�f�n� thread yapal�m
 * 
 * run metodu yazal�m run metodunda 10 kere donsun��kt� olarakta 
 * 
 * ogretmenismi --->  1.ogrencinin notlra�n� okudu
 * ogretmenismi --->  2.ogrencinin notlra�n� okudu
 * 
 * OgretmenTest olustural�m 
 * burda test edece�iz 2 tane ogretmen olustural�m 
 * ve threadleri �al��t�ral�m 
 * 
 * 
 * ogretmenler ayn� dosya uzerinde okuma yap�p okudukler� verileri 
 * kendi s�n�flar� i�erisinde tutuklar� ogrenci listesine ekleyecekler
 * bunu bir thread yap�s� uzerinden kuracag�z 
 * 
 * ogretmenTest s�n�f�nda 2 tane ogretmenimiz olucak bu threadleri �al��t�rcag�z 
 * en sonundada ka�tane ogrencinin notunu okumuslar onu gosterce�iz
 * 
 * 
 * 
 * 
 * 
 */
public class Ogretmen extends Thread {

	String name;
	List<Ogrenci> ogrenciler = new ArrayList<>();
	BufferedReader bufferedReader;

	public Ogretmen(String name, BufferedReader bufferedReader) {
		super();
		this.name = name;
		this.bufferedReader = bufferedReader;
	}

	@Override
	public void run() {
		try {

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] array = line.split(",");// Mustafa,87,76,60
				double ort = ortHesapla2(Arrays.asList(array));
				Ogrenci ogrenci = new Ogrenci(array[0], ort);
				ogrenciler.add(ogrenci);
				System.out.println(name + "====>" + ogrenci.getName() + " adl� ogrenciyi ekledi");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public double ortHesapla2(List<String> list) {
		return list.subList(1, list.size()).stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));

	}

}
