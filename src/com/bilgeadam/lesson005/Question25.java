package com.bilgeadam.lesson005;

public class Question25 {

	public static void main(String[] args) {
		String value = " Merhaba dünya ";
		String value2 = "Merhaba dünya";
		String value3 = "Merhaba dünya";
		System.out.println(value.charAt(2));//
		System.out.println(value.trim());
		System.out.println(value.length());
		System.out.println(value.indexOf("a"));
		System.out.println(value.lastIndexOf("a"));
		System.out.println(value.substring(5));
		System.out.println(value.substring(0, 5));
		System.out.println(value.equals("Merhaba Dünya"));// false
		System.out.println(value == " Merhaba dünya ");// true,false
		System.out.println(value.trim() == value2);// false
		System.out.println(value.trim().equals(value2));// false
		System.out.println(value3 == value2);// true
	}
}
