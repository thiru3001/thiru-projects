package detailedCar;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter location");
	String location=sc.next();
	System.out.println("enter car type");
	String type=sc.next();
	String country=location;
	String carType=type;
	CommFact fact=new CommFact();
	fact.buildCar(country, carType);
	
	
	
}
}
