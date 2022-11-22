package com.bilgeadam.lesson013;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "e";
		do {
			Student student = new Student();
			System.out.println("Lütfen Ögrenci ismi giriniz");
			student.ad = scanner.nextLine();
			student.kayit();
			System.out.println("Yeni kayıt var mı");
			input = scanner.nextLine();

		} while (input.equalsIgnoreCase("e"));

//		Student student1 = new Student();
//		student1.ad = "Mustafa";
//		student1.kayit();
//		Student student2 = new Student();
//		student2.ad = "Yasin";
//		student2.kayit();
//		student2 = new Student();
//		student2.ad = "Merve";
//		student2.kayit();
	}

}
