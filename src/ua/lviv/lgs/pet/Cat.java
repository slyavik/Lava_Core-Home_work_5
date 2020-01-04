package ua.lviv.lgs.pet;

public class Cat extends Pet {
	
	private String name;
	private String song;
	
	Cat (String name, String song) {
		super();
		this.name = name;
		this.name = song;
	}
	
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public String getSong() {
		return song;
	}
	public void setSong (String song) {
		this.song = song;
	}
	
	public String toString() {
		return "Cat[ name = "+name+", song = "+song+"] ";
	}
	
	void voice() {
		System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
	}

}
