package com.bilgeadam.lesson026.footballapp;

import java.util.Random;

public abstract class Futbolcu {

	private String adSoyad;
	private int formaNo;
	private int dayaniklilik;
	private int hiz;
	private int pas;
	private int sut;
	private int yetenek;
	private int kararlilik;
	private int dogalForm;
	private int sans;

	public Futbolcu(String adSoyad, int formaNo) {
		this.formaNo = formaNo;
		this.adSoyad = adSoyad;
		this.dayaniklilik = rastgeleYetenekPuanıAta();
		this.hiz = rastgeleYetenekPuanıAta();
		this.pas = rastgeleYetenekPuanıAta();
		this.sut = rastgeleYetenekPuanıAta();
		this.yetenek = rastgeleYetenekPuanıAta();
		this.kararlilik = rastgeleYetenekPuanıAta();
		this.dogalForm = rastgeleYetenekPuanıAta();
		this.sans = rastgeleYetenekPuanıAta();
	}

	public int rastgeleYetenekPuanıAta() {
		Random random = new Random();
		return random.nextInt(50, 101);
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public int getFormaNo() {
		return formaNo;
	}

	public int getDayaniklilik() {
		return dayaniklilik;
	}

	public int getHiz() {
		return hiz;
	}

	public int getPas() {
		return pas;
	}

	public int getSut() {
		return sut;
	}

	public int getYetenek() {
		return yetenek;
	}

	public int getKararlilik() {
		return kararlilik;
	}

	public int getDogalForm() {
		return dogalForm;
	}

	public int getSans() {
		return sans;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public void setFormaNo(int formaNo) {
		this.formaNo = formaNo;
	}

	public void setDayaniklilik(int dayaniklilik) {
		this.dayaniklilik = dayaniklilik;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public void setYetenek(int yetenek) {
		this.yetenek = yetenek;
	}

	public void setKararlilik(int kararlilik) {
		this.kararlilik = kararlilik;
	}

	public void setDogalForm(int dogalForm) {
		this.dogalForm = dogalForm;
	}

	public void setSans(int sans) {
		this.sans = sans;
	}

	@Override
	public String toString() {
		return "Futbolcu [adSoyad=" + adSoyad + ", formaNo=" + formaNo + ", dayaniklilik=" + dayaniklilik + ", hiz="
				+ hiz + ", pas=" + pas + ", sut=" + sut + ", yetenek=" + yetenek + ", kararlilik=" + kararlilik
				+ ", dogalForm=" + dogalForm + ", sans=" + sans + "]";
	}

}
