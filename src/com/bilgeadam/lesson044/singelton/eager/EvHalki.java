package com.bilgeadam.lesson044.singelton.eager;

public class EvHalki implements Runnable {

	Robot robot;

	public void robotCag�r() {
		robot = Robot.getRobot();
		robot.calis();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			robotCag�r();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
