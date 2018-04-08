package models;

public class person {
	public String nama;
	
	public int noiden;
	
	public void person() {
		nama = "Perris Ard";
		noiden = 85;
	}
	
	public String getnama() {
		return nama;
	}
	
	public int getnoiden() {
		return noiden;
	}

	public void setnama(String name) {
		nama = name;
	}
	
	public void setnoiden(int nom) {
		noiden = nom;
	}
}
