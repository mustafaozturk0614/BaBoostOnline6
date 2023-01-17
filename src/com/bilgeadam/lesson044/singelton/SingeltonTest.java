package com.bilgeadam.lesson044.singelton;

public class SingeltonTest {

	public static void main(String[] args) {

		MyPostgreConnection myPostgreConnection = MyPostgreConnection.getINSTANCE();
		MyPostgreConnection myPostgreConnection2 = MyPostgreConnection.getINSTANCE();
		MyPostgreConnection myPostgreConnection3 = MyPostgreConnection.getINSTANCE();
		MyPostgreConnection myPostgreConnection4 = MyPostgreConnection.getINSTANCE();
		MyPostgreConnection myPostgreConnection5 = MyPostgreConnection.getINSTANCE();
		MyPostgreConnection myPostgreConnection6 = MyPostgreConnection.getINSTANCE();

		System.out.println(myPostgreConnection);
		System.out.println(myPostgreConnection2);
		System.out.println(myPostgreConnection3);
		System.out.println(myPostgreConnection4);
		System.out.println(myPostgreConnection5);
		System.out.println(myPostgreConnection6);

		// MyPostgreConnection myPostgreConnection2 = new MyPostgreConnection();

	}
}
