package com.bilgeadam.lesson040;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {

	public static void main(String[] args) {

		// Output --> yazma iþlemini
		// Ýnput --> okuma iþlemi
		try {
			FileOutputStream fos = new FileOutputStream("E:/java6dosya/deneme2.txt");
			FileInputStream fis = new FileInputStream("E:/java6dosya/deneme2.txt");
//				fos.write(65);
//				fos.write(80);
			byte[] array = { 101, 80, 88 };
			// fos.write(array);
			String string = "Merhaba dünya";
			fos.write(string.getBytes());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			int deger;
			while ((deger = fis.read()) != -1) {
				System.out.println((char) deger);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
