package ua.lviv.lgs.more;

public class Frog extends Amphibia{
	
	private String name;
	
	Frog (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString () {
		return "Frog[name = "+name+"]";
	}
	
}
