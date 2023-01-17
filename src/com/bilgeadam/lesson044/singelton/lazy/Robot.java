package com.bilgeadam.lesson044.singelton.lazy;

/*
 * 1 tane Robotumuz var bu robotumuzun çalýþ metodu var 
 * çalýþ metodunda hascode---> robot çalýþýyor gibi bir çýktý vereceðiz
 * 2- Ev Halký sýnýfýmýz olacak 
 * bu sýnýfta robotCagýr metodu olacak bu bize bir robot cagýracak
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

// Thread Safe yapmak için  metotumuzu synchronized metoto haline getirebiliriz
//	veya baþka bir yontemle Singelton yapýsý olusturabilirz
//	public synchronized static Robot getRobot() {
//		if (robot == null) {
//			robot = new Robot();
//		}
//		return robot;
//	}
	public void calis() {

		System.out.println(hashCode() + "--->  robot çalýþýyor");
	}

}
