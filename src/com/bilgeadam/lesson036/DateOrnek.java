package com.bilgeadam.lesson036;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateOrnek {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2020, 11, 3);

		long gun = date2.until(date1, ChronoUnit.DAYS);
		long hafta = date2.until(date1, ChronoUnit.WEEKS);
		long ay = date2.until(date1, ChronoUnit.MONTHS);
		long year = date2.until(date1, ChronoUnit.YEARS);
		System.out.println(gun);
		System.out.println(hafta);
		System.out.println(year);
//		System.out.println(date2.plusDays(25));
//		System.out.println(date2.plusMonths(1));
//		System.out.println(date2.plusWeeks(3));
//		System.out.println(date2.plusYears(1));
//		System.out.println(date2.minusDays(5));
//		System.out.println("y�l� :" + date2.getYear());
//		System.out.println("ay :" + date2.getMonthValue());
//		System.out.println("g�n :" + date2.getDayOfMonth());
//		System.out.println("o y�ldaki ka��nc� g�n  :" + date2.getDayOfYear());
//		System.out.println(date1.isBefore(date2));
//		System.out.println(date1.isAfter(date2));
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("L�tfen y�l� giriniz");
//		int y�l = scanner.nextInt();
//		System.out.println("L�tfen ay� giriniz");
//		int ay = scanner.nextInt();
//		System.out.println("L�tfen g�n� giriniz");
//		int gun = scanner.nextInt();
//		LocalDate date3 = LocalDate.of(y�l, ay, gun);
//		System.out.println(date3);
//		LocalDate date4 = LocalDate.parse("2000-10-25");
//		System.out.println(date4);
//		System.out.println("L�tfen tarihi giriniz");
//		LocalDate date5 = LocalDate.parse(scanner.nextLine());
//		System.out.println(date5);
//		LocalDateTime date2 = LocalDateTime.now();
//		System.out.println(date2);
//		Date date = new Date();
//		System.out.println(date);

	}
}
