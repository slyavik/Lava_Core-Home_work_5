package ua.lviv.lgs.coin;
 
 public class Coin {
	
	static void coinToss ()  {
	double value = Math.random()*2;
	int integer = (int) Math.floor(value);
	
	if (integer == 0) {
		System.out.println("випав - герб");
	}  else {
		System.out.println("випала - монета");
	}
	
//	System.out.println(value);
//	System.out.println(integer);
//	
	
	}
	
		
	

}
