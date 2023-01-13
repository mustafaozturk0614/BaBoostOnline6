package com.bilgeadam.lesson042.taksiapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Durak {

	List<Taksi> taksiler;
	static Queue<Integer> musteriKuyrugu;

	public Durak() {
		taksiler = new ArrayList<>();
		musteriKuyrugu = new LinkedList<>();
		musteriOlustur();
		taksiOlustur();

	}

	private void musteriOlustur() {
		for (int i = 1; i < 101; i++) {
			musteriKuyrugu.add(i);
		}
	}

	private void taksiOlustur() {
		for (int i = 1; i < 11; i++) {
			taksiler.add(new Taksi(i));
		}
	}

}
