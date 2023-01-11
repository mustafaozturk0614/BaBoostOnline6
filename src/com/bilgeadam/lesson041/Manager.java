package com.bilgeadam.lesson041;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 1-ogrenci s�n�f� olustural�m bu ogrenci s�n�f�nda 2 tane const. olusturun
 * birinde sadece isim olsun digerinde hem isim hem ortalama olsun 
 * 1-dosyam�z� okuyup gelen veirlerden bir ogrenci yarat�p bunlar� bir listeye atal�m 
 * daha sonra bu listeyi yazd�ral�m (ilk ba�ta ogrenci olusturken sadece isimlerle olustural�m)
 * 
 * 2- ogrenci listesinden bir serile�tirme i�lemi ile ogrencileri bir dosyay yazal�m 
 * 3- serile�tirip yazd���m�z dosyadan gelen ogrenci verilerini okuyup console yazd�ral�m 
 * 
 */
public class Manager {

	File file = new File("E:/java6dosya/ogrenci.txt");
	List<Ogrenci> ogrenciler = new ArrayList<>();

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.dosyadanVeriOkuma2();
	}

	public void dosyadanVeriOkuma() {
		String isim = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String deger = "";
			while ((deger = bufferedReader.readLine()) != null) {
				// isim += deger + "\n";
				Ogrenci ogrenci = new Ogrenci(deger.substring(0, deger.indexOf(",")));
				ogrenciler.add(ogrenci);
			}
		} catch (Exception e) {
		}
		ogrenciler.forEach(System.out::println);

	}

	public void dosyadanVeriOkuma2() {

		String isim = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String deger = "";
			while ((deger = bufferedReader.readLine()) != null) {
				String[] array = deger.split(",");// {"Mustafa","70","80","90"}
				// arrayi bolup yeni bir arraye kopyalama i�lemi
				// String [] array2=Arrays.copyOfRange(array, 1, array.length);
				// olusturdugumuz arrayi bir meteoda verelim bu metot bize ortalamay� donsun
				double ort = ortHesapla2(Arrays.asList(array));

				Ogrenci ogrenci = new Ogrenci(array[0], ort);
				ogrenciler.add(ogrenci);
			}
		} catch (Exception e) {

		}
		ogrenciler.forEach(System.out::println);

	}

	public double ortHesapla(List<String> list) {
		double toplam = 0;
		for (int i = 1; i < list.size(); i++) {
			toplam = toplam + Double.parseDouble(list.get(i));
		}
		return toplam / (list.size() - 1);
	}

	public double ortHesapla2(List<String> list) {
		return list.subList(1, list.size()).stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));

	}

}
