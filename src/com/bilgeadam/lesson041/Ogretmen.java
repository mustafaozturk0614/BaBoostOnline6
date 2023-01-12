package com.bilgeadam.lesson041;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * ogretmen sýnýfýný thread yapalým
 * 
 * run metodu yazalým run metodunda 10 kere donsunçýktý olarakta 
 * 
 * ogretmenismi --->  1.ogrencinin notlraýný okudu
 * ogretmenismi --->  2.ogrencinin notlraýný okudu
 * 
 * OgretmenTest olusturalým 
 * burda test edeceðiz 2 tane ogretmen olusturalým 
 * ve threadleri çalýþtýralým 
 * 
 * 
 * ogretmenler ayný dosya uzerinde okuma yapýp okuduklerý verileri 
 * kendi sýnýflarý içerisinde tutuklarý ogrenci listesine ekleyecekler
 * bunu bir thread yapýsý uzerinden kuracagýz 
 * 
 * ogretmenTest sýnýfýnda 2 tane ogretmenimiz olucak bu threadleri çalýþtýrcagýz 
 * en sonundada kaçtane ogrencinin notunu okumuslar onu gosterceðiz
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
				System.out.println(name + "====>" + ogrenci.getName() + " adlý ogrenciyi ekledi");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public double ortHesapla2(List<String> list) {
		return list.subList(1, list.size()).stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));

	}

}
