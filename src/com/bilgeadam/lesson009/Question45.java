package com.bilgeadam.lesson009;

import java.util.Scanner;

//T�rk�e karakterleri �ngilizce karaktere �evirme
/**
 * 
 * Bir metot yazal�m metot arraylarimizin 2 sinide als�n
 * 
 * daha sonra metodun i�inde bir string de�er ala�m
 * 
 * sonra t�rk�e karakterleri ing karakterelere d�n��t�rlm�� halini geri d�nelim
 * 
 * d�nd���m�z String de�erini main metotoda yazd�ral�m
 * 
 * 
 * @author musty
 *
 */
public class Question45 {

	public static void main(String[] args) {
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�" };

		System.out.println(changeString(ingilizceKarakter, turkceKarakter));

	}

	public static String changeString(String[] eng, String[] tr) {

		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();

		for (int i = 0; i < tr.length; i++) {
			value = value.replace(tr[i], eng[i]);
		}

		return value;
	}

}
