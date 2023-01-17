package com.bilgeadam.lesson044.singelton;

/*
 * Singelton Yapýsýna Uygun Bir Singelton Class olusrmanýn adýmlarý
 * 1-const-> private olacak
 * 2-sýnýf içinde kendi referansýnda static bir degiþken tanýmlayacaðýz
 * 3- static bir getInstance() metodu yazacagýz ve bize kendý sýnýfýmýzý geri donecek
 * 4- metot içinde degiþkenimizin null kontrolunu yapacagýz
 * eger null ise degiskenimizi newleyecegiz deðilse geri doneceðiz
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
