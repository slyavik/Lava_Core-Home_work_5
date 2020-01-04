package ua.lviv.lgs.constructors;

public class Application {
	
	private String Cat;
	private int CatYear;
	private String Dog;
	private int DogYear;
	
	Application (String Cat, String Dog) {
		this.Cat = Cat;
		this.Dog = Dog;
	}
	
	Application (String Cat, int CatYear, String Dog, int DogYear) {
		this(Cat , Dog);
		this.CatYear = CatYear;
		this.DogYear = DogYear;
	}

	@Override
	public String toString() {
		return "Application [Cat=" + Cat + ", CatYear=" + CatYear + ", Dog=" + Dog + ", DogYear=" + DogYear + "]";
	}
	
	
}
