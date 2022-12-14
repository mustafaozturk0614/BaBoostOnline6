package com.bilgeadam.lesson027;

/*
 * id değeri tutacağız
 * daha sonra bir kirli olp olmadığını tutan bir değişken tutacağız 
 * 
 * rastgele 10 tane tabak uretecegiz 
 * (tabak nesnesi olusurken kirli veya temzi olması rastgele olacak)
 * 
 * daha sonra temizleri bir stack içine alalım kirlileri başka bir stacak içine alalım 
 * 
 * metot işlemlerini tabak sınıfında değilde manager sınfında yapabiliriz 
 * 
 * 
 */
public class Tabak {

	private int id;
	private boolean kirliMi;

	public Tabak() {
		// TODO Auto-generated constructor stub
	}

	public Tabak(int id, boolean kirliMi) {
		super();
		this.id = id;
		this.kirliMi = kirliMi;
	}

	public int getId() {
		return id;
	}

	public boolean isKirliMi() {
		return kirliMi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKirliMi(boolean kirliMi) {
		this.kirliMi = kirliMi;
	}

	@Override
	public String toString() {
		return "Tabak [id=" + id + ", kirliMi=" + kirliMi + "]";
	}

}
