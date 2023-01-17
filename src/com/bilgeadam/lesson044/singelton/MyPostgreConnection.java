package com.bilgeadam.lesson044.singelton;

/*
 * Singelton Yap�s�na Uygun Bir Singelton Class olusrman�n ad�mlar�
 * 1-const-> private olacak
 * 2-s�n�f i�inde kendi referans�nda static bir degi�ken tan�mlayaca��z
 * 3- static bir getInstance() metodu yazacag�z ve bize kend� s�n�f�m�z� geri donecek
 * 4- metot i�inde degi�kenimizin null kontrolunu yapacag�z
 * eger null ise degiskenimizi newleyecegiz de�ilse geri donece�iz
 * 
 * 
 * 
 * 
 */
public class MyPostgreConnection {

	private static MyPostgreConnection instance;

	private MyPostgreConnection() {

	}

	public static MyPostgreConnection getINSTANCE() {
		if (instance == null) {
			instance = new MyPostgreConnection();
		}

		return instance;

	}

	@Override
	public String toString() {
		return "MyPostgreConnection [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
