package com.bilgeadam.lesson028.menuodevcozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MenuManager {

	ArrayList<Enum> icecekler;
	ArrayList<Enum> yemekler;
	ArrayList<Enum> corbalar;
	ArrayList<Enum> tatlilar;

	public MenuManager() {
		this.icecekler = new ArrayList<>(Arrays.asList(EIcecekler.values()));
		this.yemekler = new ArrayList<>(Arrays.asList(EYemek.values()));
		this.corbalar = new ArrayList<>(Arrays.asList(ECorba.values()));
		this.tatlilar = new ArrayList<>(Arrays.asList(ETatli.values()));
	}

	public ECorba corbaBelirle() {
		int uzunluk = ECorba.values().length;
		return ECorba.values()[randomIndex(uzunluk)];
	}

	public Enum menuBelirle(Enum[] dizi) {
		return dizi[randomIndex(dizi.length)];
	}

	public int randomIndex(int uzunluk) {
		Random random = new Random();
		return random.nextInt(uzunluk);
	}

	public Enum icecekBelirle(EIcecekler[] dizi) {
		int uzunluk = dizi.length;
		int index = randomIndex(uzunluk);

		while (dizi[index].isAtandimi()) {
			index = randomIndex(uzunluk);
		}

		dizi[index].setAtandimi(true);
		return dizi[index];

	}

	public Enum menuBelirle2(ArrayList<Enum> list) {
		Enum value = null;
		int index = randomIndex(list.size());
		value = list.get(index);
		list.remove(index);
		return value;
	}

	public Menu menuOlustur() {
		Menu menu = new Menu();
		menu.setCorba((ECorba) menuBelirle(ECorba.values()));
		menu.setYemek((EYemek) menuBelirle(EYemek.values()));
		menu.setTatli((ETatli) menuBelirle(ETatli.values()));
		menu.setIcecek((EIcecekler) menuBelirle(ETatli.values()));
		return menu;
	}

	public Menu menuOlustur2() {
		Menu menu = new Menu();
		menu.setCorba((ECorba) menuBelirle2(corbalar));
		menu.setYemek((EYemek) menuBelirle2(yemekler));
		menu.setTatli((ETatli) menuBelirle2(tatlilar));
		menu.setIcecek((EIcecekler) menuBelirle2(icecekler));
		return menu;
	}

	public void haftalýkMenu() {
		EGun[] gunler = EGun.values();
		// {EGun.PAZARTESÝ,EGun.SALI,EGun.CARSAMBA.....}
		for (EGun gun : gunler) {
			System.out.println(gun.ordinal() + 1 + "-" + gun);
			System.out.println(menuOlustur2());
		}
	}

	public static void main(String[] args) {

		MenuManager menuManager = new MenuManager();

		menuManager.haftalýkMenu();
	}

}
