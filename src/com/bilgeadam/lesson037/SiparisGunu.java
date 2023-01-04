package com.bilgeadam.lesson037;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
 * Bir al��veris tarhimiz olsun 
 * 
 * daha sonra birde her ay�n 15 i bizim fatura kesim tarihimiz
 * 
 * 
 * 1- al��veri� tarihi fatura tarihinden �ncemi kontrol edelim 
 * 	once ise fatura tarihinden once yazd�ral�m 
 *
 * 2-sonra ise fatura tarihinden  sonra yazd�lar�m 
 
 * Yeni fatura tarihi yazd�ral�m( bir sonraki fatura tarihi)  ve kalan gun say�s�n� yazd�ral�m 
 */
public class SiparisGunu {

	public static void main(String[] args) {

		LocalDate alisverisTarihi = LocalDate.parse("2023-01-19");
		LocalDate faturaTarihi = LocalDate.of(alisverisTarihi.getYear(), alisverisTarihi.getMonth(), 15);

		if (alisverisTarihi.isBefore(faturaTarihi)) {
			System.out.println("fatura tarihinden daha vard�r");
		} else {

			System.out.println("fatura tarihinden sonra");
			faturaTarihi = faturaTarihi.plusMonths(1);
			System.out.println("bir sonraki fatura tarihi: " + faturaTarihi);
			long kalanGun = alisverisTarihi.until(faturaTarihi, ChronoUnit.DAYS);
			long kalanGun2 = ChronoUnit.DAYS.between(faturaTarihi, alisverisTarihi);
			System.out.println("kalan gun: " + kalanGun);
			System.out.println("kalan gun: " + Math.abs(kalanGun2));

		}
		Period p = Period.between(alisverisTarihi, faturaTarihi);
		long fark = p.getDays();
		System.out.println("kalan gun: " + fark);
	}

}
