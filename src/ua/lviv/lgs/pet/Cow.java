package ua.lviv.lgs.pet;

public class Cow extends Pet {

	private String name;
	private String song;
	
	Cow (String name, String song) {
		super();
		this.name = name;
		this.song = song;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	
	public String toString() {
		return " Cow [name = "+name+" , song = "+song+" ] ";
	}
	
	void voice() {
		System.out.println("ß êîğîâà- Ìóóó-Ìóóó");
	}
	
}
