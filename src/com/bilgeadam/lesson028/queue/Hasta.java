package com.bilgeadam.lesson028.queue;

/*
 * isim
 * þikayet
 * öncelik özelliði 
 * 
 * þikayete göre önceliði belirliyeceðiz
 * 
 *      Apandisit ----> En yüksek öncelik
        Yanýk -------> Orta Öncelik
        Baþ Aðrýsý ---> En düþük öncelik
 * 
 * önceliðe göre kuyruðumuzu oluþturacaðýz
 * 
 * 
 */
public class Hasta implements Comparable<Hasta> {

	private String isim;
	private ESikayet sikayet;
	private int oncelik;

	public Hasta(String isim, ESikayet sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		oncelikBelirle(sikayet);
	}

	public void oncelikBelirle(ESikayet sikayet) {

		switch (sikayet) {
		case COVID: {
			this.oncelik = 0;
			break;
		}
		case APANDISIT: {
			this.oncelik = 1;
			break;
		}
		case YANIK: {

			this.oncelik = 2;
			break;
		}
		case BASAGRISI: {

			this.oncelik = 3;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + sikayet);
		}

	}

	public String getIsim() {
		return isim;
	}

	public ESikayet getSikayet() {
		return sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setSikayet(ESikayet sikayet) {
		this.sikayet = sikayet;
	}

	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}

	@Override
	public int compareTo(Hasta hasta) {
		if (hasta.oncelik > this.oncelik) {
			return -1;

		} else if (hasta.oncelik < this.oncelik) {
			return 1;

		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Hasta [isim=" + isim + ", sikayet=" + sikayet + ", oncelik=" + oncelik + "]";
	}

}
