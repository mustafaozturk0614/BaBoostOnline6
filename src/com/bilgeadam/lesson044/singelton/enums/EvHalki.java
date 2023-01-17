package com.bilgeadam.lesson044.singelton.enums;

public class EvHalki implements Runnable {

	Robot robot;

	public void robotCagýr() {
		robot = Robot.ROBOT;
		robot.calis();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			robotCagýr();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
