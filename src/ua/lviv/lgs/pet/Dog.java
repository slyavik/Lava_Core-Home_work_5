package ua.lviv.lgs.pet;

public class Dog extends Pet {
	
	
	private String name;
	private String song;
	public Dog(String name, String song) {
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
	@Override
	public String toString() {
		return "Dog [name=" + name + ", song=" + song + "]";
	}
	@Override
	void voice() {
		System.out.println("ί οερ-Γΰσσσ-Γΰσσσ");
	}
	
	

}
