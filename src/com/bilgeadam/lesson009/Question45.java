package com.bilgeadam.lesson009;

import java.util.Scanner;

//Türkçe karakterleri Ýngilizce karaktere çevirme
/**
 * 
 * Bir metot yazalým metot arraylarimizin 2 sinide alsýn
 * 
 * daha sonra metodun içinde bir string deðer alaým
 * 
 * sonra türkçe karakterleri ing karakterelere dönüþtürlmüþ halini geri dönelim
 * 
 * döndüðümüz String deðerini main metotoda yazdýralým
 * 
 * 
 * @author musty
 *
 */
public class Question45 {

	public static void main(String[] args) {
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "Ý", "ý", "þ", "Þ", "ç", "Ç", "ð", "Ð", "ü", "Ü", "ö", "Ö" };

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
