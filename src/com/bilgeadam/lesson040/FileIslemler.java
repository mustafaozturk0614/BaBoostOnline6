package com.bilgeadam.lesson040;
/*
 * 
 * 			System.out.println("0- Çýkýþ");
			System.out.println("1- Dosya Yarat");
			System.out.println("2- Ekle");
			System.out.println("3- Okuma");
			System.out.println("4- Harf Deðiþtir");
			System.out.println("5- Dosya silme");
			System.out.println("lütfen iþlem seçiniz");
 * 
 * 
 * 
 * 
 * 1- File sabitlerde bir file yaratalým  daha sonra bu file butun metotlarýmýzda kullacagýz
 *	
 *dosya yaratmak için bir metot yazalým eðer 
 *dosyamýz dizinde yoksa yaratsýn varsa bize bir çýktý versýn bu dosya daha once yaratýlmýstýr 
 *2- dosyamýza dýþardan aldýgýmýz bir veriyi ekleyelim (Scanner ile aldýðýmýz veriyi) 
 *ve her ekleme yapýldýktan sonra bir sonraki ekleme iþlemi alt satýra geçsin
 *
 *4-dýsardan girdiðimiz bir deger metin içerisinde varsa o degeri dýsardan 
 *girdiðimiz 2. deger ile degistirip dosyaya geri yazalým 
 *
 *5- eger dosya varsa silelim yoksa dosya bulunamamýstýr diye çýktý verelim 
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
				System.out.println(FileSabitler.file.getName() + " baþarýyla oluþturulmustur");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha önce yaratýlmýþtýr");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dosyaYarat2() {
		try {
			if (FileSabitler.file.createNewFile()) {

				System.out.println(FileSabitler.file.getName() + " baþarýyla oluþturulmustur");
			} else {
				System.out.println(FileSabitler.file.getAbsolutePath() + " Dosya daha önce yaratýlmýþtýr");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dosyayaVeriEkle(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Metin dosyayay eklenerek mi yazýlsýn (E/H)");
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
		System.out.println("Lütfen deðiþtrimek istediðiniz harfi giriniz");
		char eskiHarf = scanner.nextLine().charAt(0);
		System.out.println("Lütfen yeni harfi giriniz");
		char yeniHarf = scanner.nextLine().charAt(0);
		metin = metin.replace(eskiHarf, yeniHarf);
		dosyayaVeriEkle(metin);

	}

	public void dosyaSil(File file) {

		if (file.exists()) {
			System.out.println("Dosyanýz siliniyor");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			file.delete();
			System.out.println(file.getName() + " adlý dosyanýz silindi");
		} else {
			System.out.println("Boyle bir dosya bulunamadý");
		}
	}

	public void dosyaSil2(Path path) {
		try {
			if (Files.deleteIfExists(path)) {
				System.out.println("Dosyanýz siliniyor");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				System.out.println(path + " adlý dosyanýz silindi");
			} else {
				System.out.println("Boyle bir dosya bulunamadý");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
