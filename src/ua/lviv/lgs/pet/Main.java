package ua.lviv.lgs.pet;

public class Main {
	
	public static void main(String[] args) {
		
		 Cat c =new Cat ("ћура", "Ќ€в-Ќ€в-Ќ€в");
		 System.out.println(c);
		 Dog d = new Dog("Dino", "√ав-√ав-√ав");
		 System.out.println(d);
		 Cow o = new Cow("з≥рка", " му-му-му");
		 System.out.println(o);
		 
		 System.out.println("-------------------");
		 c.voice();
		 d.voice();
		 o.voice();
		
	}

}
