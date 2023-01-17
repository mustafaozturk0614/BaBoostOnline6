package com.bilgeadam.lesson044.singelton.eager;

public class Test {

	public static void main(String[] args) {

		EvHalki anne = new EvHalki();
		EvHalki baba = new EvHalki();
		EvHalki cocuk = new EvHalki();

//		anne.robotCagýr();
//		baba.robotCagýr();
//		cocuk.robotCagýr();
		Thread thread1 = new Thread(anne);
		Thread thread2 = new Thread(baba);
		Thread thread3 = new Thread(cocuk);
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
