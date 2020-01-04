package ua.lviv.lgs.constructors;

public class Main {
	
	public static void main(String[] args) {
		
		Application first = new Application (" Мурка ", " Діно ");
		Application second = new Application (" Мурка - ", 3, ", Діно - ",5);
		
		System.out.println(first);
		System.out.println();
		System.out.println(second);
		
	}

}
