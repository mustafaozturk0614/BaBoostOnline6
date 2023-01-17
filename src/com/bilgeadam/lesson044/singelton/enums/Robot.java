package com.bilgeadam.lesson044.singelton.enums;

/*
 * 1 tane Robotumuz var bu robotumuzun çalýþ metodu var 
 * çalýþ metodunda hascode---> robot çalýþýyor gibi bir çýktý vereceðiz
 * 2- Ev Halký sýnýfýmýz olacak 
 * bu sýnýfta robotCagýr metodu olacak bu bize bir robot cagýracak
 *	 
 * 
 * 
 */
public enum Robot {

	ROBOT;

	public void calis() {
		System.out.println(hashCode() + "--->  robot çalýþýyor");
	}
}
