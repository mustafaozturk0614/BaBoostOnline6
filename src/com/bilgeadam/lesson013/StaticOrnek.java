package com.bilgeadam.lesson013;

public class StaticOrnek {

	int number = 0; // nesne değişkeni

	static int number2 = 0; ///// StaticOrnek.number2=0

	public static void main(String[] args) {
		StaticOrnek staticOrnek = new StaticOrnek();//

		staticOrnek.number = 2;//
		staticOrnek.numaraVer();// 3-1
		staticOrnek = new StaticOrnek();
		staticOrnek.numaraVer();// 1-1//1-2
		staticOrnek = new StaticOrnek();
		staticOrnek.numaraVer();

	}

	public void numaraVer() {
		number += 1;
		number2 += 1;
		System.out.println("number==>" + number);
		System.out.println("number2==>" + number2);
	}

}
