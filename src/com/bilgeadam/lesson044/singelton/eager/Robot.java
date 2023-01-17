package com.bilgeadam.lesson044.singelton.eager;

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

	private static Robot robot = new Robot();

	private Robot() {

	}

	public static Robot getRobot() {

		return robot;
	}

	public void calis() {

		System.out.println(hashCode() + "--->  robot çalýþýyor");
	}

}
