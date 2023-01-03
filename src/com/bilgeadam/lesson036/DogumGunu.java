package com.bilgeadam.lesson036;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Dýþarýdan string olarak dogum gununuzu alýnýz
 * 
 * daha sonra dogdugnuz gunden bugune 
 * 
 * kaç yýl kaç gun kaç hafta kaç ay yaþamýssýnýz onu hesaplayýp yazdýrýn
 * 
 * bir sonrakli dogum gunune kaç gun kaldýgýný hesaplayalým 
 * 
 * 
 * 
 */
public class DogumGunu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dogum gunu tarihini giriniz");
		LocalDate dg = LocalDate.parse(scanner.nextLine());

		LocalDate now = LocalDate.now();

		long yil = dg.until(now, ChronoUnit.YEARS);
		long ay = dg.until(now, ChronoUnit.MONTHS);
		long hafta = dg.until(now, ChronoUnit.WEEKS);
		long gun = dg.until(now, ChronoUnit.DAYS);

		System.out
				.println("Bugune kadar " + yil + " yýl " + ay + " ay " + hafta + " hafta " + gun + " gun yaþamýssýnýz");

		int sonrakiDogumGunu2 = (dg.getDayOfYear() - now.getDayOfYear() + 365) % 365;
		LocalDate sonrakiDogunGunu = dg.plusYears(yil + 1);
		long fark = now.until(sonrakiDogunGunu, ChronoUnit.DAYS);
		System.out.println("Bir sonraki dogum gununuze " + fark + " gunkaldý");
		System.out.println("Bir sonraki dogum gununuze " + sonrakiDogumGunu2 + " gunkaldý");
	}

}
