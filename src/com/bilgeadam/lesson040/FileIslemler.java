package com.bilgeadam.lesson040;
/*
 * 
 * 			System.out.println("0- Çıkış");
			System.out.println("1- Dosya Yarat");
			System.out.println("2- Ekle");
			System.out.println("3- Okuma");
			System.out.println("4- Harf Değiştir");
			System.out.println("5- Dosya silme");
			System.out.println("lütfen işlem seçiniz");
 * 
 * 
 * 
 * 
 * 1- File sabitlerde bir file yaratalım  daha sonra bu file butun metotlarımızda kullacagız
 *	
 *dosya yaratmak için bir metot yazalım eğer 
 *dosyamız dizinde yoksa yaratsın varsa bize bir çıktı versın bu dosya daha once yaratılmıstır 
 *2- dosyamıza dışardan aldıgımız bir veriyi ekleyelim (Scanner ile aldığımız veriyi) 
 *ve her ekleme yapıldıktan sonra bir sonraki ekleme işlemi alt satıra geçsin
 *
 *4-dısardan girdiğimiz bir deger metin içerisinde varsa o degeri dısardan 
 *girdiğimiz 2. deger ile degistirip dosyaya geri yazalım 
 *
 *5- eger dosya varsa silelim yoksa dosya bulunamamıstır diye çıktı verelim 
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
				System.out.println(FileSabitler.file.getName() + " başarıyla oluşturulmustur");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha önce yaratılmıştır");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dosyaYarat2() {
		try {
			if (FileSabitler.file.createNewFile()) {

				System.out.println(FileSabitler.file.getName() + " başarıyla oluşturulmustur");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha önce yaratılmıştır");
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
			System.out.println("Lütfen bir veri giriniz");
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
