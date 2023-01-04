package com.bilgeadam.lesson037;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
 * Bir alýþveris tarhimiz olsun 
 * 
 * daha sonra birde her ayýn 15 i bizim fatura kesim tarihimiz
 * 
 * 
 * 1- alýþveriþ tarihi fatura tarihinden öncemi kontrol edelim 
 * 	once ise fatura tarihinden once yazdýralým 
 *
 * 2-sonra ise fatura tarihinden  sonra yazdýlarým 
 
 * Yeni fatura tarihi yazdýralým( bir sonraki fatura tarihi)  ve kalan gun sayýsýný yazdýralým 
 */
public class SiparisGunu {

	public static void main(String[] args) {

		LocalDate alisverisTarihi = LocalDate.parse("2023-01-19");
		LocalDate faturaTarihi = LocalDate.of(alisverisTarihi.getYear(), alisverisTarihi.getMonth(), 15);

		if (alisverisTarihi.isBefore(faturaTarihi)) {
			System.out.println("fatura tarihinden daha vardýr");
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
