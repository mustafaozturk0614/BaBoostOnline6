package com.bilgeadam.lesson040;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek2 {

	public static void main(String[] args) {

		String path = "E:/java6dosya/deneme3.txt";
		File file = new File(path);

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

//			FileWriter fileWriter = new FileWriter(file);
//	BufferedWriter writer2 = new BufferedWriter(fileWriter);

			// new FileWriter(file, true)==> herdefasýnda dosyayý sýfýrlamadan devamýna
			// yazdýrmak için
			// true yu kullanýyoruz
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			BufferedReader reader = new BufferedReader(new FileReader(file));

			// Scanner ile Veri okuma iþlemini burda yaptýk
			// Scanner input = new Scanner(file);

//			writer.write("satýr1\n");
//			writer.write("satýr2");
//			writer.flush();
//			// Scanner ile okuma
//			while (input.hasNextLine()) {
//				System.out.println(input.next());
//			}
			writer.write("satýr1\n");
			writer.write("satýr2");
			writer.flush();
//			String deger1 = reader.readLine();
//			System.out.println(deger1);
//			String deger2 = reader.readLine();
//			System.out.println(deger2);
//			String deger3 = reader.readLine();
//			System.out.println(deger3);

			String deger;

			while ((deger = reader.readLine()) != null) {
				System.out.println(deger);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
