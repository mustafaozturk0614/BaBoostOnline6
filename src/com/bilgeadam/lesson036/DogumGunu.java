package com.bilgeadam.lesson036;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * D��ar�dan string olarak dogum gununuzu al�n�z
 * 
 * daha sonra dogdugnuz gunden bugune 
 * 
 * ka� y�l ka� gun ka� hafta ka� ay ya�am�ss�n�z onu hesaplay�p yazd�r�n
 * 
 * bir sonrakli dogum gunune ka� gun kald�g�n� hesaplayal�m 
 * 
 * 
 * 
 */
public class DogumGunu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen dogum gunu tarihini giriniz");
		LocalDate dg = LocalDate.parse(scanner.nextLine());

		LocalDate now = LocalDate.now();

		long yil = dg.until(now, ChronoUnit.YEARS);
		long ay = dg.until(now, ChronoUnit.MONTHS);
		long hafta = dg.until(now, ChronoUnit.WEEKS);
		long gun = dg.until(now, ChronoUnit.DAYS);

		System.out
				.println("Bugune kadar " + yil + " y�l " + ay + " ay " + hafta + " hafta " + gun + " gun ya�am�ss�n�z");

		int sonrakiDogumGunu2 = (dg.getDayOfYear() - now.getDayOfYear() + 365) % 365;
		LocalDate sonrakiDogunGunu = dg.plusYears(yil + 1);
		long fark = now.until(sonrakiDogunGunu, ChronoUnit.DAYS);
		System.out.println("Bir sonraki dogum gununuze " + fark + " gunkald�");
		System.out.println("Bir sonraki dogum gununuze " + sonrakiDogumGunu2 + " gunkald�");
	}

}
