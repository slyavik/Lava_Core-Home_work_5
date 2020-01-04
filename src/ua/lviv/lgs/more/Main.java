package ua.lviv.lgs.more;

public class Main {
	
	public static void main(String[] args) {
		
		Amphibia a = new Amphibia();
		Frog f = new Frog("Sebastian");
		
		System.out.println(f.getName());
		f.eat();
		f.sleep();
		f.swim();
		f.walk();
	}
}
