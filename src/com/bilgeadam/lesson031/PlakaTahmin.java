package com.bilgeadam.lesson031;
/*
 * 
 * -bu arrayden bir map olusturan metodu yazalým 
 * key degerleri plaka degerleri olsun value þehir olsun 
 * 1,2,3 
 * 
 * oyun sayýsýný 
 * hakkýmýz olsun () --> bir oyunda 3 kere tahminde bulunabiliriz 
 * 
 * menumuz olacak 
 * 
 * Sehir tahmin oyunana hosgeldiniz
 * Her oyun için 3 tahmin hakkýnýz bulunmaktadýr 
 * 
 * 1-oyuna basla
 * 
 * 1.oyun (kacýncý oyundaysak)
 * 3 tahmin hakkýmýz var(herdefasýnda azalacak)
 * 
 * Random bir plaka uretecegiz 
 * ve kullanýcýya soru soracagýz bu plaka hangi ile atittir 
 * kullanýcýdan gelen degere gore iþlem yapacagýz dogruysa bildiniz
 * yanlýssa tekrar deneyin cýktýsýný verip basa donecegiz (toplamda 3 tahmin hakkýmýz bulunmaktadýr)
 * baþarýlý bildiðimiz zaman ve tahmin hakkýmýz kalmadýgý zaman ana menuye donsun 
 * 
 * 
 * 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim 
 * her oyunun tahminlerini bir yerde tutacagým sonra burayý cagýrdýgým zaman 
 * her oyunun tahminleri ayrý ayrý yazýlsýn  
 *  
 * 3- cýkýs
 * 
 * 
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PlakaTahmin {

	String[] iller = { "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara", "Antalya", "Artvin", "Aydýn",
			"Balýkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum",
			"Denizli", "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir", "Gaziantep", "Giresun",
			"Gümüþhane", "Hakkari", "Hatay", "Isparta", "Mersin", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
			"Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraþ", "Mardin",
			"Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdað", "Tokat", "Trabzon", "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan", "Iðdýr", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	Map<Integer, String> sehirMap = new LinkedHashMap<>();

	Map<Integer, List<String>> eskiTahminler = new LinkedHashMap<>();

	int oyunSayisi;
	int hak = 3;

	public PlakaTahmin() {

	}

	public void mapOlustur() {
		for (int i = 0; i < iller.length; i++) {
			sehirMap.put(i + 1, iller[i]);
		}

	}

	public void menu() {
		int secim = 3;
		do {

			System.out.println("Sehir tahmin oyunana hosgeldiniz\n" + "Her oyun için 3 tahmin hakkýnýz bulunmaktadýr");
			System.out.println("==========================");
			System.out.println("1-Oyuna Baþla");
			System.out.println("2-Eski Tahminlerim");
			System.out.println("3-Çýkýþ");
			secim = Utility.intDegerAlma("Lütfen bir Secim Yapýnýz");
			switch (secim) {
			case 1:
				oyunOyna();
				break;
			case 2:
				tahminleriYazdýr();
				break;
			case 3:
				System.out.println("Sistemden çýkýlýyor...");
				secim = 3;
				break;

			default:
				break;
			}

		} while (secim != 3);

	}

	public void oyunOyna() {
		int plaka = randomPlakaUret();
		oyunSayisi++;
		System.out.println(oyunSayisi + ". oyun");
		tahminEt(plaka);
	}

	public void tahminEt(int plaka) {
		List<String> tahminler = new ArrayList<>();
		for (int i = 0; i < hak; i++) {
			System.out.println("kalan hakkýnýz:" + (hak - i));
			String tahmin = Utility.stringDegerAlma(plaka + " plaka kodu hangi Þehire  aittir lütfen giriniz:");
			tahminler.add(tahmin);

			if (sehirMap.get(plaka).equalsIgnoreCase(tahmin)) {
				System.out.println("Tebrikler bildiniz");
				break;
			} else {

				System.out.println("Yanlýþ Tahmin");
			}

		}

		eskiTahminler.put(oyunSayisi, tahminler);
	}

	public void tahminleriYazdýr() {
		eskiTahminler.forEach((x, y) -> System.out.println(x + ". oyun tahminleri =" + y));

	}

	public int randomPlakaUret() {
		return Utility.randomSayýUret(1, iller.length + 1);
	}

}
