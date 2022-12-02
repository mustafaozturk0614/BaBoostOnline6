package com.bilgeadam.lesson020.pokemon;

public class Pokemon {
	private long id;
	private String ad;
	private String t�r;
	private int can;
	private int g�c;
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

	public Pokemon(long id, String ad, String t�r, int can, int g�c, int derece) {
		this.id = id;
		this.ad = ad;
		this.t�r = t�r;
		this.can = can;
		this.g�c = g�c;
		this.derece = derece;
	}

//alt+shift+s constructor i�in sayfa ac�yor
	public void pokedex() {
		System.out.println("PokeDex");
		System.out.println("====================");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("t�r= " + t�r);
		System.out.println("can= " + can);
		System.out.println("g�c= " + g�c);
		System.out.println("derece= " + derece);

	}

//	public void pokedex(int yakicilikg�c�) {
//		System.out.println("PokeDex");
//		System.out.println("====================");
//		System.out.println("id= " + id);
//		System.out.println("ad= " + ad);
//		System.out.println("t�r= " + t�r);
//		System.out.println("can= " + can);
//		System.out.println("g�c= " + g�c);
//		System.out.println("derece= " + derece);
//		System.out.println("yakicilikg�c�= " + yakicilikg�c�);
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

	public String getT�r() {
		return t�r;
	}

	public void setT�r(String t�r) {
		this.t�r = t�r;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int getG�c() {
		return g�c;
	}

	public void setG�c(int g�c) {
		this.g�c = g�c;
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
