package ua.lviv.lgs.pet;

public class Main {
	
	public static void main(String[] args) {
		
		 Cat c =new Cat ("����", "���-���-���");
		 System.out.println(c);
		 Dog d = new Dog("Dino", "���-���-���");
		 System.out.println(d);
		 Cow o = new Cow("����", " ��-��-��");
		 System.out.println(o);
		 
		 System.out.println("-------------------");
		 c.voice();
		 d.voice();
		 o.voice();
		
	}

}
