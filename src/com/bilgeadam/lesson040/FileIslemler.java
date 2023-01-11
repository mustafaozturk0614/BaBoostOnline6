package com.bilgeadam.lesson040;
/*
 * 
 * 			System.out.println("0- ��k��");
			System.out.println("1- Dosya Yarat");
			System.out.println("2- Ekle");
			System.out.println("3- Okuma");
			System.out.println("4- Harf De�i�tir");
			System.out.println("5- Dosya silme");
			System.out.println("l�tfen i�lem se�iniz");
 * 
 * 
 * 
 * 
 * 1- File sabitlerde bir file yaratal�m  daha sonra bu file butun metotlar�m�zda kullacag�z
 *	
 *dosya yaratmak i�in bir metot yazal�m e�er 
 *dosyam�z dizinde yoksa yarats�n varsa bize bir ��kt� vers�n bu dosya daha once yarat�lm�st�r 
 *2- dosyam�za d��ardan ald�g�m�z bir veriyi ekleyelim (Scanner ile ald���m�z veriyi) 
 *ve her ekleme yap�ld�ktan sonra bir sonraki ekleme i�lemi alt sat�ra ge�sin
 *
 *4-d�sardan girdi�imiz bir deger metin i�erisinde varsa o degeri d�sardan 
 *girdi�imiz 2. deger ile degistirip dosyaya geri yazal�m 
 *
 *5- eger dosya varsa silelim yoksa dosya bulunamam�st�r diye ��kt� verelim 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemler {

	public static void main(String[] args) {
		FileIslemler fileIslemler = new FileIslemler();
		fileIslemler.dosyaYarat2();
		// fileIslemler.dosyayaVeriEkle();
		fileIslemler.dosyadanVeriOkuma();

	}

	public void dosyaYarat() {
		try {
			if (!FileSabitler.file.exists()) {
				FileSabitler.file.createNewFile();
				System.out.println(FileSabitler.file.getName() + " ba�ar�yla olu�turulmustur");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha �nce yarat�lm��t�r");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dosyaYarat2() {
		try {
			if (FileSabitler.file.createNewFile()) {

				System.out.println(FileSabitler.file.getName() + " ba�ar�yla olu�turulmustur");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha �nce yarat�lm��t�r");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dosyayaVeriEkle() {
		try {
			FileWriter fw = new FileWriter(FileSabitler.file, true);
			Scanner scanner = new Scanner(System.in);
			BufferedWriter bufferedWriter = new BufferedWriter(fw);
			System.out.println("L�tfen bir veri giriniz");
			bufferedWriter.write(scanner.nextLine() + "\n");
			bufferedWriter.flush();
			System.out.println("veri eklendi " + FileSabitler.file.getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void dosyadanVeriOkuma() {
		String tumMetin = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(FileSabitler.file));
			String deger = "";
			while ((deger = bufferedReader.readLine()) != null) {
				tumMetin += deger + "\n";
			}

		} catch (Exception e) {

		}

		System.out.println("deger==>\n" + tumMetin);
	}

}
