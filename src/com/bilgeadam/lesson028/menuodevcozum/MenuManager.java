package com.bilgeadam.lesson028.menuodevcozum;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class MenuManager {

	Stack<EIcecekler> icecekler = new Stack<>();
	ArrayList<Enum> icecekler2 = new ArrayList<>();

	public MenuManager() {

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

	public Enum menuBelirle2() {

		Enum value = null;

		int index = randomIndex(icecekler2.size());
		value = icecekler2.get(index);
		System.out.println(index);
		icecekler2.remove(index);

		return value;
	}

	public Menu menuOlustur() {
		Menu menu = new Menu();
		menu.setCorba((ECorba) menuBelirle(ECorba.values()));
		menu.setYemek((EYemek) menuBelirle(EYemek.values()));
		menu.setTatli((ETatli) menuBelirle(ETatli.values()));
		menu.setIcecek((EIcecekler) menuBelirle2());
		return menu;
	}

	public void haftalýkMenu() {
		EGun[] gunler = EGun.values();
		// {EGun.PAZARTESÝ,EGun.SALI,EGun.CARSAMBA.....}
		for (EGun gun : gunler) {
			System.out.println(gun.ordinal() + 1 + "-" + gun);
			System.out.println(menuOlustur());
		}
	}

	public static void main(String[] args) {

		MenuManager menuManager = new MenuManager();

		menuManager.haftalýkMenu();
	}

}
