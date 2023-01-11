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
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIslemler {

	public static void main(String[] args) {
		FileIslemler fileIslemler = new FileIslemler();
		// fileIslemler.dosyaYarat2();
		// fileIslemler.dosyayaVeriEkle();
		// fileIslemler.dosyadanVeriOkuma();

		// fileIslemler.harfDegistir(fileIslemler.dosyadanVeriOkuma());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileIslemler.dosyaSil2(FileSabitler.path);

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

	public void dosyayaVeriEkle(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Metin dosyayay eklenerek mi yaz�ls�n (E/H)");
		boolean kontrol = false;
		if (scanner.nextLine().equalsIgnoreCase("e")) {
			kontrol = true;
		}
		try {
			FileWriter fw = new FileWriter(FileSabitler.file, kontrol);
			BufferedWriter bufferedWriter = new BufferedWriter(fw);
			bufferedWriter.write(metin + "\n");
			bufferedWriter.flush();
			System.out.println("veri eklendi " + FileSabitler.file.getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String dosyadanVeriOkuma() {
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

		return tumMetin;
	}

	public void harfDegistir(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen de�i�trimek istedi�iniz harfi giriniz");
		char eskiHarf = scanner.nextLine().charAt(0);
		System.out.println("L�tfen yeni harfi giriniz");
		char yeniHarf = scanner.nextLine().charAt(0);
		metin = metin.replace(eskiHarf, yeniHarf);
		dosyayaVeriEkle(metin);

	}

	public void dosyaSil(File file) {

		if (file.exists()) {
			System.out.println("Dosyan�z siliniyor");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			file.delete();
			System.out.println(file.getName() + " adl� dosyan�z silindi");
		} else {
			System.out.println("Boyle bir dosya bulunamad�");
		}
	}

	public void dosyaSil2(Path path) {
		try {
			if (Files.deleteIfExists(path)) {
				System.out.println("Dosyan�z siliniyor");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				System.out.println(path + " adl� dosyan�z silindi");
			} else {
				System.out.println("Boyle bir dosya bulunamad�");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
