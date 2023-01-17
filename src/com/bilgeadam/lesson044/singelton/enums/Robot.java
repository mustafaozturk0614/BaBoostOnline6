package com.bilgeadam.lesson044.singelton.enums;

/*
 * 1 tane Robotumuz var bu robotumuzun �al�� metodu var 
 * �al�� metodunda hascode---> robot �al���yor gibi bir ��kt� verece�iz
 * 2- Ev Halk� s�n�f�m�z olacak 
 * bu s�n�fta robotCag�r metodu olacak bu bize bir robot cag�racak
 *	 
 * 
 * 
 */
public enum Robot {

	ROBOT;

	public void calis() {
		System.out.println(hashCode() + "--->  robot �al���yor");
	}
}
