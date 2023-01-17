package com.bilgeadam.lesson044.singelton.eager;

public class EvHalki implements Runnable {

	Robot robot;

	public void robotCagýr() {
		robot = Robot.getRobot();
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
