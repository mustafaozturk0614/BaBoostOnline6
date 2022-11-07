package com.bilgeadam.lesson001;

public class Question1 {

	public static void main(String[] args) {
		long number1 = 5;
		long number4 = 1;
		long number2 = 1000000;
		short number3 = 6;
		long result1 = number1 + number2;
		short result2 = (short) (number3 + number2);
		System.out.println(result2);

		double number5 = 14.5;
		long result3 = (long) (number1 / number5);
		System.out.println(result3);
		double result4 = (number1 / number5);
		System.out.println(result4);
		System.out.println("içş");
		int n1 = 10;
		int n2 = 5;
		n1 = n2++;
		System.out.println(n1);// 5
		n1 = n2 + 5;
		System.out.println(n1);// 11,10
		n2++;
		n1 = n2;
		System.out.println(n1);// 7,6,11
		n1 = ++n2 + 5 + n1++;
		System.out.println(n1);// 18+,20++++

	}

}
