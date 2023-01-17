package com.bilgeadam.lesson044.singelton.lazy;

/*
 * 1 tane Robotumuz var bu robotumuzun �al�� metodu var 
 * �al�� metodunda hascode---> robot �al���yor gibi bir ��kt� verece�iz
 * 2- Ev Halk� s�n�f�m�z olacak 
 * bu s�n�fta robotCag�r metodu olacak bu bize bir robot cag�racak
 *	 
 * 
 * 
 */
public class Robot {

	private static Robot robot;

	private Robot() {

	}

	public static Robot getRobot() {
		if (robot == null) {
			robot = new Robot();
		}
		return robot;
	}

// Thread Safe yapmak i�in  metotumuzu synchronized metoto haline getirebiliriz
//	veya ba�ka bir yontemle Singelton yap�s� olusturabilirz
//	public synchronized static Robot getRobot() {
//		if (robot == null) {
//			robot = new Robot();
//		}
//		return robot;
//	}
	public void calis() {

		System.out.println(hashCode() + "--->  robot �al���yor");
	}

}
