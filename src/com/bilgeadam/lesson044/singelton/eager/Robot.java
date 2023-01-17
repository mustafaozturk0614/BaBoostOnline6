package com.bilgeadam.lesson044.singelton.eager;

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

	private static Robot robot = new Robot();

	private Robot() {

	}

	public static Robot getRobot() {

		return robot;
	}

	public void calis() {

		System.out.println(hashCode() + "--->  robot �al���yor");
	}

}
