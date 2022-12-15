package com.bilgeadam.lesson027;

import java.util.Random;

public class Test {

	public static void main(String[] args) throws InterruptedException {
//		Stack<Integer> stack = new Stack<>();
//		stack.add(1);
//		stack.push(2);
//		stack.peek();
//		stack.pop();
//		stack.isEmpty();
		TabakManager manager = new TabakManager();
		Random random = new Random();

		manager.rastgeleTabakOlustur();

		for (int i = 0; i < 10; i++) {
			manager.kullan();
		}

		for (int i = 0; i < 50; i++) {
			int secim = random.nextInt(1, 3);
			manager.secimYap(secim);
			Thread.sleep(1000);
		}

	}

}
