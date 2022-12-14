package com.bilgeadam.lesson027;

public class Test {

	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<>();
//		stack.add(1);
//		stack.push(2);
//		stack.peek();
//		stack.pop();
//		stack.isEmpty();
		TabakManager manager = new TabakManager();

		manager.rastgeleTabakOlustur();

		for (int i = 0; i < 10; i++) {
			manager.kullan();
		}

	}

}
