package com.bilgeadam.lesson020.pokemon;

public class Pokemon {
	private long id;
	private String ad;
	private String tür;
	private int can;
	private int güc;
	private int derece;
	private String[] handikap;
	private Kullanici kullanici;

	public Pokemon() {
		can = 100;
	}

	public Pokemon(long id, String ad) {

		this.id = id;
		this.ad = ad;
	}

	public Pokemon(long id, String ad, String tür, int can, int güc, int derece) {
		this.id = id;
		this.ad = ad;
		this.tür = tür;
		this.can = can;
		this.güc = güc;
		this.derece = derece;
	}

//alt+shift+s constructor için sayfa acýyor
	public void pokedex() {
		System.out.println("PokeDex");
		System.out.println("====================");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("tür= " + tür);
		System.out.println("can= " + can);
		System.out.println("güc= " + güc);
		System.out.println("derece= " + derece);

	}

//	public void pokedex(int yakicilikgücü) {
//		System.out.println("PokeDex");
//		System.out.println("====================");
//		System.out.println("id= " + id);
//		System.out.println("ad= " + ad);
//		System.out.println("tür= " + tür);
//		System.out.println("can= " + can);
//		System.out.println("güc= " + güc);
//		System.out.println("derece= " + derece);
//		System.out.println("yakicilikgücü= " + yakicilikgücü);
//		System.out.println("====================");
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTür() {
		return tür;
	}

	public void setTür(String tür) {
		this.tür = tür;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int getGüc() {
		return güc;
	}

	public void setGüc(int güc) {
		this.güc = güc;
	}

	public int getDerece() {
		return derece;
	}

	public void setDerece(int derece) {
		this.derece = derece;
	}

	public String[] getHandikap() {
		return handikap;
	}

	public void setHandikap(String[] handikap) {
		this.handikap = handikap;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

}
